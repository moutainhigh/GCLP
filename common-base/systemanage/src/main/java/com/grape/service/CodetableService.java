package com.grape.service;

import com.grape.model.db.Codetable;

import java.util.List;

public interface CodetableService {
    List<Codetable> selectcoddesAndflg(String codtyp) ;

	Codetable selectCodetableByCodtypAndflg(String codflg, String codtyp);
}
