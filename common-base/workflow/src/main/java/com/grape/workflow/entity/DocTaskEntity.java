package com.grape.workflow.entity;

import com.grape.model.db.Doctask;
import com.grape.workflow.Entity;

public class DocTaskEntity extends Entity {
	private Doctask doctask;
	
	public DocTaskEntity(Doctask doctask) {
		super(doctask.getWorkid());
		this.doctask = doctask;
	}

	public Doctask getDoctask() {
		return doctask;
	}
}
