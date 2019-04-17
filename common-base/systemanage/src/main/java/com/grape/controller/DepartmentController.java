package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.DepartmentRoleResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.ObjectResponse;
import com.grape.controller.reponse.PersonListResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.RoleDepartmentResponse;
import com.grape.controller.request.ComnoRequest;
import com.grape.controller.request.DepartmentRequest;
import com.grape.controller.request.DepnoRequest;
import com.grape.controller.response.bean.DepartmentBean;
import com.grape.controller.response.bean.PersonBean;
import com.grape.controller.response.bean.RoleDepartmentBean;
import com.grape.model.db.Department;
import com.grape.model.db.Person;
import com.grape.model.db.Userrole;
import com.grape.service.CompanyService;
import com.grape.service.DepartmentService;
import com.grape.service.PersonService;
import com.grape.util.BuildTree;
import com.grape.util.Tree;
import com.grape.util.Util;

import StatusCode.MessageDetail;
import io.swagger.annotations.ApiOperation;

/** 
* @author cwc
* @version 创建时间：2019年3月14日 上午10:46:19  
*/
@RestController
@RequestMapping("/departmentManager")
public class DepartmentController {
	
	private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("/selectPersonByDepno")
	@ApiOperation(value="根据部门编号查询部门下的所有员工",notes="根据部门编号查询员工信息接口",httpMethod="POST",response=PersonListResponse.class)
	public Response selectPersonByDepno(@RequestBody DepnoRequest req){
		List<Person> persons = new ArrayList<Person>();
		List<PersonBean> personbeans = new ArrayList<PersonBean>();
		persons = personService.selectPersonListByDepno(req);
		if(persons!=null && !"".equals(persons)){
			for(int i=0;i<persons.size();i++){
				PersonBean personbean = new PersonBean();
				try {
					Util.transferFields(persons.get(i), personbean);
				} catch (Exception e) {
					log.info("用户信息实体类转换出错");
				}
				String departmentno = persons.get(i).getDepartment();
				String workerid = persons.get(i).getWorkerid();
				//查找用户所属部门的中文名称
				Department department = departmentService.selectDepartmentByDepno(departmentno);
				if(department!=null){
					personbean.setDepartment(department.getDepartmentname());
				}
				//查找用户所属角色
				List<Userrole> userroles = departmentService.selectUserRoleByWorkerid(workerid);
				List<String> jobs = new ArrayList<String>();
				if(userroles!=null && userroles.size()>0){
					for(Userrole userrole : userroles){
						String roleid = userrole.getRoleid();
						String rolename = departmentService.selectRoleNameByRoleid(roleid);
						jobs.add(rolename);
					}
					personbean.setJob(jobs);
				}
				personbeans.add(personbean);
			}
			return new PersonListResponse(personbeans);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/selectAllDepartment")
	@ApiOperation(value="查找某个公司下的所有部门",notes="查询部门接口",httpMethod="POST",response=ObjectResponse.class)
	public Response selectAllDepartment(@RequestBody ComnoRequest req){
		List<Department> departments = departmentService.selectDepartmentList(req);
		Tree<Department> t = new Tree<Department>();
		List<Tree<Department>> trees = new ArrayList<Tree<Department>>();
		if(departments!=null){
			for(Department dep:departments){
				Tree<Department> tree = new Tree<Department>();
				tree.setId(dep.getDepartmentno());
				tree.setParentId(dep.getSuperdep());
				tree.setText(dep.getDepartmentname());
				trees.add(tree);
			}
			//生成树状结构的json数据  
			t = BuildTree.build(trees);
		}
		return new ObjectResponse(t);
	}
	
	@RequestMapping("/insertDepartment")
	@ApiOperation(value="新增公司信息接口",notes="新增公司信息接口",httpMethod="POST",response=RestfulResponse.class)
	public Response insertDepartment(@RequestBody DepartmentRequest req){
		String depno = req.getDepartmentno();
		Department department = departmentService.selectDepartmentByDepno(depno);
		if(department!=null){
			return new ErrorEntity(StatusCode.UNKNOWED_ERROR,MessageDetail.DEPARTMENT_EXIST);
		}
		departmentService.insertDepartment(req);
		return new RestfulResponse();
	}
	
	@RequestMapping("/selectUserRoleByComno")
	@ApiOperation(value="查询公司所有部门的所有用户信息,返回用户信息",notes="查询公司员工职务相关联信息",httpMethod="POST",response=DepartmentRoleResponse.class)
	public Response selectUserRoleByComno(@RequestBody ComnoRequest request){
		List<DepartmentBean> depbeans = new ArrayList<DepartmentBean>();
		List<Department> departments = departmentService.selectDepartmentList(request);
		if(departments!=null && departments.size()>0){
			for(Department department:departments){
				//循环每一个部门，往部门里添加用户
				DepartmentBean depbean = new DepartmentBean();
				String departmentname = department.getDepartmentname();
				String departmentno = department.getDepartmentno();
				depbean.setDepartmentname(departmentname);
				List<Person> persons = personService.selectPersonListByDepnoAndComno(departmentno,request.getOrganizationno());
				//将同一部门下的所有员工用List存起来
				List<String> userlist = new ArrayList<String>();
				if(persons!=null && persons.size()>0){
					for(int i=0;i<persons.size();i++){
						String personname = persons.get(i).getWorkername();
						userlist.add(personname);
					}
				}
				depbean.setUsernamnes(userlist);
				depbeans.add(depbean);
			}
		}
		return new DepartmentRoleResponse(depbeans);
	}
	
	@RequestMapping("deleteDepartment")
	@ApiOperation(value="删除部门的接口",httpMethod="POST",response=RestfulResponse.class)
	public Response deleteDepartment(@RequestBody DepnoRequest req){
		String depno = req.getDepartmentno();
		Department department = departmentService.selectDepartmentByDepno(depno);
		if(department!=null){
			String comno = department.getOrganizationno();
			//查找该部门下是否存在用户
			List<Person> person = personService.selectPersonListByDepnoAndComno(depno, comno);
			//判断该部门是否还存在子部门
			List<Department> deplist = departmentService.selectDepartmentBySuperDep(depno);
			//如果该部门或部门下还存在子部门或该部门存在用户，则不能删除该部门
			if(person!=null && person.size()>0 && deplist!=null && deplist.size()>0){
				return new ErrorEntity(StatusCode.UNKNOWED_ERROR,MessageDetail.EXISTPERSONINDEP);
			}
		}
		return new RestfulResponse();
	}

	@RequestMapping("/selectSameDuties")
	@ApiOperation(value="查询公司所有部门的所有相同角色信息",notes="",httpMethod="POST",response= RoleDepartmentResponse.class)
	public Response selectSameDuties(@RequestBody ComnoRequest request){
        String organizationno = request.getOrganizationno();
        List<RoleDepartmentBean> roleDepartmentBeans = departmentService.selectByCompno(organizationno);
        if(!CollectionUtils.isEmpty(roleDepartmentBeans)) {
            return new RoleDepartmentResponse(roleDepartmentBeans) ;
        }else{
            return new ErrorEntity();
        }

    }
}
