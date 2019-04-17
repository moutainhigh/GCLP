package com.grape.service;

import com.grape.controller.request.ShufflingOptionRequest;
import com.grape.controller.request.ShufflingfigureRequest;
import com.grape.controller.request.ShufflingfigureRequest1;
import com.grape.model.db.Shufflingfigure;

import java.util.List;
import java.util.Map;

public interface ShufflingService {
    List<Shufflingfigure> selectAllShuffling() ;

    List<Shufflingfigure> selectByOption(ShufflingOptionRequest request) ;

    /*List<Shufflingfigure> queryShufflingByOption(Map<String, Object> map) ;*/

    Shufflingfigure selectById(String id) ;

    void updateShufflingById(Shufflingfigure shufflingfigure) ;

    void insertShuffing(Shufflingfigure shufflingfigure) ;

    void deleteShuffling(String id) ;

    void editShufflingStatu(String id , String useflg) ;

	Integer selectByOptionCount(ShufflingOptionRequest request);
}
