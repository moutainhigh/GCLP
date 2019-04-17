package com.grape.service.impl;

import com.grape.controller.response.bean.PersonBean;
import com.grape.controller.response.bean.RolePersonBean;
import com.grape.controller.response.bean.RolePersonBean1;
import com.grape.model.db.*;
import com.grape.model.mapper.base.NoderoleMapper;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.model.mapper.base.ProductnodeMapper;
import com.grape.model.mapper.base.RoleMapper;
import com.grape.model.mapper.external.PersonExMapper;
import com.grape.model.mapper.external.RoleExMapper;
import com.grape.service.RoleService;
import com.grape.util.Util;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper ;
    @Autowired
    private PersonMapper personMapper ;
    @Autowired
    private NoderoleMapper noderoleMapper ;
    @Autowired
    private ProductnodeMapper productnodeMapper ;
    @Autowired
    private RoleExMapper roleExmapper ;

    @Override
    public List<Role> selectSameOrg(String organizationno) {
        RoleExample roleExample = new RoleExample() ;
        roleExample.createCriteria().andOrganizationnoEqualTo(organizationno) ;
        List<Role> roles = roleMapper.selectByExample(roleExample);
        if(!CollectionUtils.isEmpty(roles)) {
            return roles ;
        } else {
            return null ;
        }
    }

    @Override
    public List<Person> selectAllPerson(PersonBean bean) {
        PersonExample personExample = new PersonExample() ;
        if(StringUtils.isEmpty(bean.getWorkername())){
            personExample.createCriteria().andOrganizationidEqualTo(bean.getOrganizationid()) ;
        }else{
            personExample.createCriteria().andOrganizationidEqualTo(bean.getOrganizationid()).andWorkernameLike(bean.getWorkername()) ;
        }
        List<Person> personList = personMapper.selectByExample(personExample) ;
        if(!CollectionUtils.isEmpty(personList)) {
            return personList ;
        }else {
            return null ;
        }

    }

    @Override
    public List<Role> selectAllRole(String nodeid) {
        List<Role> roles = new ArrayList<>() ;
        RoleExample roleExample = new RoleExample() ;
        roleExample.createCriteria() ;
        roles = roleMapper.selectByExample(roleExample) ;
        if(!CollectionUtils.isEmpty(roles)) {
            return roles ;
        }else{
            return null ;
        }
    }

    @Override
    public void updateNodeRole(List<Noderole> noderoles,String nodeid) {
        NoderoleExample example = new NoderoleExample() ;
        example.createCriteria().andNodeidEqualTo(nodeid) ;
        noderoleMapper.deleteByExample(example) ;
        for(Noderole noderole : noderoles){
        	noderole.setId(Util.getID());
            ProductnodeExample productnodeExample = new ProductnodeExample();
            productnodeExample.createCriteria().andNodeidEqualTo(nodeid) ;
            List<Productnode> productnodeList = productnodeMapper.selectByExample(productnodeExample);
            String productno = "" ;
            if(!CollectionUtils.isEmpty(productnodeList)) {
                productno = productnodeList.get(0).getProductno() ;
            }
            noderole.setProductno(productno);
            noderoleMapper.insertSelective(noderole) ;
        }
        
    }

    @Override
    public RolePersonBean  selectByRoleid(String roleid) {
        Map<String , Object> map = new HashMap<>() ;
        map.put("roleid" , roleid) ;
        List<RolePersonBean1> roles = roleExmapper.selectByRoleid(map);
        RolePersonBean rolePersonBean = new RolePersonBean() ;
        List<String> stringList = new ArrayList<>();
        if(!CollectionUtils.isEmpty(roles)) {
            for (RolePersonBean1 rolePerson:
                 roles) {
                rolePersonBean.setRolename(rolePerson.getRolename());
                stringList.add(rolePerson.getWorkername()) ;
            }
            rolePersonBean.setWorkername(stringList);
            rolePersonBean.setRoleid(roleid);
            return rolePersonBean ;
        }else {
            return null;
        }
    }

    @Override
    public void insertRole(Role role) {
        role.setRoleid(Util.getID());
        roleMapper.insertSelective(role) ;
    }

    @Override
    public void updateRole(Role role) {
        roleMapper.updateByPrimaryKeySelective(role) ;
    }


}
