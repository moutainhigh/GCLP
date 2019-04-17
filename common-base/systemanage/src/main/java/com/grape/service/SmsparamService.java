package com.grape.service;

import com.grape.controller.request.SmsparamOptionRequest;
import com.grape.controller.response.bean.SmsparamByOptionBean;
import com.grape.model.db.Smsparam;

import java.util.List;

public interface SmsparamService {
    List<Smsparam> selectAllSmsparam() ;

    List<Smsparam> selectByOption(SmsparamOptionRequest req) ;

    Smsparam selectById(String id) ;

    void updateSmsparamById(Smsparam smsparam) ;

    void insertSmsparam(Smsparam smsparam) ;

    void deleteSmsparam(String id) ;

    void editSmsparam(String id , String useflg) ;

	Integer selectByOptionCount(SmsparamOptionRequest request);
}
