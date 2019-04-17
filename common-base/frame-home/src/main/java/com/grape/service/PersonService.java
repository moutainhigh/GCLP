package com.grape.service;


import java.util.List;

import com.grape.controller.reponse.bean.Personinfo;
import com.grape.model.db.Person;

public interface PersonService {
	
	Person findPersonByPhone(String phone);
	
	Person findPersonByWorkeridOrPhone(String username);
	
	Personinfo findPersoninfoByUsername(String username);
	
	boolean checkPassword(Person person,String password);
	
	boolean updatePassword(Person person,String newPassword);
	
	boolean updatePerson(Person person);
	
	boolean resetPassword(String username,String newPasword);
	
	boolean resetPasswordByPerson(Person person,String newPassword);
	
	boolean useradd(Person person);
	
	
}
