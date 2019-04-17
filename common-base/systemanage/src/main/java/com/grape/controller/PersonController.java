package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.PersonResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.PersonRequest;
import com.grape.controller.response.bean.PersonBean;
import com.grape.model.db.Person;
import com.grape.model.db.Userrole;
import com.grape.service.PersonService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController

@RequestMapping("/personManage")
public class PersonController {
    @Autowired
    private PersonService personService ;
    
    @RequestMapping("/insertPerson")
    @ApiOperation(value="新增员工", httpMethod="POST",notes="接口")
    public Response insertPerson(@RequestBody PersonRequest req) {
    	/*String password = req.getPassword();
    	String confpassword  = req.getConfpassword();
    	//判断两次输入的密码是否一致
    	if(!password.equals(confpassword)){
    		return new ErrorEntity(StatusCode.UNKNOWED_ERROR,MessageDetail.PASSWORD_NOTSAME);
    	}*/
        personService.inseretPerson(req);
        return new RestfulResponse() ;
    }

    @RequestMapping("/alterPerson")
    @ApiOperation(value="修改员工信息", httpMethod="POST",notes="接口")
    public Response alterPerson(@RequestBody PersonRequest req) {
        personService.alterPerson(req);
        return new RestfulResponse() ;
    }

    @RequestMapping("/selectPerson")
    @ApiOperation(value="查询某个员工的详细信息" , httpMethod = "POST",response=PersonResponse.class)
    public Response selectPerson(@RequestBody PersonRequest req) {
    	String workerid = req.getWorkerid();
    	List<Userrole> userRoles = new ArrayList<Userrole>();
    	List<String> roleids = new ArrayList<String>();
    	if(userRoles!=null && userRoles.size()>0){
    		for(Userrole userrole : userRoles){
    			roleids.add(userrole.getRoleid());
    		}
    	}
    	userRoles = personService.selectUserRoleByWorkerid(workerid);
        List<Person> peopleList = personService.selectPersonByTerm(req);
        if(peopleList!=null && peopleList.size()>0){
        	Person person =  peopleList.get(0);
            PersonBean personBean = new PersonBean();
            try {
				Util.transferFields(person, personBean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            personBean.setJob(roleids);
            return new PersonResponse(personBean);
        }
        return new ErrorEntity(StatusCode.NO_DATAERROR);
    }
}
