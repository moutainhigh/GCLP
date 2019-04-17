package com.grape.service;

import java.util.List;

import com.grape.controller.request.IdRequest;
import com.grape.controller.request.ProcnodefileRequest;
import com.grape.model.db.Procnodefile;

public interface ProcnodefileService {
	List<Procnodefile> queryByNodeidAndProno(ProcnodefileRequest req) ;

	List<Procnodefile> queryByFiletype(IdRequest req) ;
}
