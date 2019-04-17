package com.grape.service;

import com.grape.workflow.bean.Actor;

public interface PersonService {

	Actor getCurrentActor();
	
	Actor getActor(String name);
	
}
