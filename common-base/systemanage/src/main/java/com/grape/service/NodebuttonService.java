package com.grape.service;

import com.grape.controller.response.bean.NodeKeyinfoBean;
import com.grape.model.db.Nodepage;

import java.util.List;

public interface NodebuttonService {
    List<NodeKeyinfoBean> selectNodebutton(String nodeid) ;

    void insertNodebutton(List<NodeKeyinfoBean> bean) ;

    void updateNodebutton(List<NodeKeyinfoBean> bean) ;

    void insertNobutton(NodeKeyinfoBean bean) ;

    void updateNobutton(NodeKeyinfoBean bean) ;

    List<Nodepage> selectNodepage(String nodeid) ;
}
