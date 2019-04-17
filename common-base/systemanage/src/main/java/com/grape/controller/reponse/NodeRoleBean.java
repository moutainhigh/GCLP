package com.grape.controller.reponse;

import java.util.List;

import com.grape.model.db.Noderole;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NodeRoleBean {
	
	private List<Noderole> roleList;
}
