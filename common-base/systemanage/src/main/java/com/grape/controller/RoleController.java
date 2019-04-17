package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.*;
import com.grape.controller.request.*;
import com.grape.controller.response.bean.RoleExBean;
import com.grape.controller.response.bean.RolePersonBean;
import com.grape.model.db.Noderole;
import com.grape.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.response.bean.PersonBean;
import com.grape.model.db.Person;
import com.grape.model.db.Role;
import com.grape.service.RoleService;

import io.swagger.annotations.ApiOperation;

import javax.xml.soap.Node;

@RestController
@RequestMapping("Role")
public class RoleController {
    @Autowired
    private RoleService roleService ;

    @RequestMapping("/selectSameOrg")
    @ApiOperation(value="查询共同直属上司",notes="",httpMethod="POST",response= RoleResponse.class)
    public Response selectSameOrg(@RequestBody OrganizationRequest request) {
        List<Role> roles = roleService.selectSameOrg(request.getOrganizationno());
        if(!CollectionUtils.isEmpty(roles)) {
            return new RoleResponse(roles) ;
        }else{
            return new ErrorEntity(StatusCode.NO_DATAERROR);
        }
    }

    @RequestMapping("/selectAllPerson")
    @ApiOperation(value="",notes="",httpMethod="POST",response= PersonListResponse2.class)
    public Response selectAllPerson(@RequestBody AllPersonRequest request) {
        PersonBean personBean = new PersonBean();
        personBean.setOrganizationid(request.getOrganizationid());
        if(!StringUtils.isEmpty(request.getWorkername())) {
            personBean.setWorkername(request.getWorkername());
        }
        List<Person> personList = roleService.selectAllPerson(personBean);
        if(!CollectionUtils.isEmpty(personList)) {
            return new PersonListResponse2(personList) ;
        }else{
            return new ErrorEntity();
        }
    }

    @RequestMapping("/updateNodeRole")
    @ApiOperation(value="更新节点权限信息",notes="",httpMethod="POST")
    public Response updateNodeRole(@RequestBody NoderoleRequest request) {
    	String nodeid = request.getNodeid();
        List<Noderole> noderoles = request.getNoderoles();
        if(!CollectionUtils.isEmpty(noderoles)) {
                roleService.updateNodeRole(noderoles,nodeid);
        }
        return new RestfulResponse() ;
    }

    @RequestMapping("/selectRole")
    @ApiOperation(value="查询节点权限信息",notes="",httpMethod="POST",response= Role1Response.class)
    public Response selectRole(@RequestBody NodeidRequest request) {
        String nodeid = request.getNodeid();
        List<Role> roles = roleService.selectAllRole(nodeid);
        List<RoleExBean> roleExBeans = new ArrayList<>() ;
        if(!CollectionUtils.isEmpty(roles)) {
            for (Role role: roles) {
                RoleExBean roleExBean = new RoleExBean() ;
                roleExBean.setRoleid(role.getRoleid());
                roleExBean.setRolename(role.getRolename());
                roleExBean.setUseflg(role.getUseflg());
                roleExBeans.add(roleExBean) ;
            }
            return new Role1Response(roleExBeans) ;
        }else {
            return new ErrorEntity(StatusCode.NO_DATAERROR);
        }
    }

    @RequestMapping("/queryPersonAndRole")
    @ApiOperation(value="根据公司查询相同角色的职员",notes="",httpMethod="POST",response= RolePersonResponse.class)
    public Response queryPersonAndRole(@RequestBody AllPersonRequest req) {
        List<Role> roles = roleService.selectSameOrg(req.getOrganizationid());
        List<RolePersonBean> lists = new ArrayList<>() ;
        if(!CollectionUtils.isEmpty(roles)){
            for (Role role:
                    roles) {
                if(!StringUtils.isEmpty(role.getRoleid())){
                     RolePersonBean rolePersonBean = roleService.selectByRoleid(role.getRoleid());
                    lists.add(rolePersonBean) ;
                }
            }
        }
        if(!CollectionUtils.isEmpty(lists)){
            return new RolePersonResponse(lists) ;
        }else {
            return new ErrorEntity(StatusCode.NO_DATAERROR);
        }
    }

    @RequestMapping("/insertOrUpdateRole")
    @ApiOperation(value="新增或者更新role",notes="",httpMethod="POST")
    public Response insertOrUpdateRole(@RequestBody RoleRequest req){
        Role role = new Role() ;
        try {
            Util.transferFields(req,role);
        } catch (Exception e) {

        }
        if(!role.getRoleid().isEmpty()) {
            roleService.insertRole(role);
        }else {
            roleService.updateRole(role);
        }
        return new RestfulResponse() ;
    }

}
