package com.grape.service;

import java.util.List;

import com.grape.controller.request.ComTypeRequest;
import com.grape.controller.request.CompanyRequest;
import com.grape.model.db.Organization;

/** 
* @author cwc
* @version 创建时间：2019年3月12日 上午10:40:53  
*/
public interface CompanyService {

	void insertCompany(CompanyRequest companyRequest);

	List<Organization> selectAllOrganization();

	void deleteCompanyByComno(String organizationno);

	Organization selectCompanyByOrgno(String organizationno);

	List<Organization> selectOrganizationByType(ComTypeRequest req);

	void updateOrganication(CompanyRequest req);

}
