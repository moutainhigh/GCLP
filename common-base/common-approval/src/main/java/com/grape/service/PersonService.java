package com.grape.service;

import com.grape.model.db.Person;

public interface PersonService{

	Person selectByWorkerid(String userid);

	String selectOrgnoByOrganization(String org);

}
