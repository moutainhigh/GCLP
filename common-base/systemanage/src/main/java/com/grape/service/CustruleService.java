package com.grape.service;

import com.grape.controller.request.CustruleOptionRequest;
import com.grape.controller.response.bean.CustruleByOptionBean;
import com.grape.controller.response.bean.SmsparamByOptionBean;
import com.grape.model.db.Custrule;
import com.grape.model.db.Smsparam;

import java.util.List;

public interface CustruleService{
    List<Custrule> selectAllCustrule() ;

    List<Custrule> selectByOption(CustruleOptionRequest request) ;

    Custrule selectById(String id) ;

    void updateCustruleById(Custrule custrule) ;

    void insertCustrule(Custrule custrule) ;

    void deleteCustrule(String id) ;

	Integer selectByOptionCount(CustruleOptionRequest request);
}
