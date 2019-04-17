package com.grape.service;

import com.grape.model.db.Nodepage;


import java.util.List;


public interface NodepageService {

    List<Nodepage> selectAllNodepage(String nodeid) ;

    void insertNodepage(Nodepage nodepage) ;

    void updateNodepage(Nodepage nodepage) ;

}
