package com.grape.service.impl;

import com.grape.controller.response.bean.NodeKeyinfoBean;
import com.grape.model.db.*;
import com.grape.model.mapper.base.NodebuttonMapper;
import com.grape.model.mapper.base.NodepageMapper;
import com.grape.model.mapper.base.ProctransMapper;
import com.grape.service.NodebuttonService;
import com.grape.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class NodebuttonServiceImpl implements NodebuttonService {
    @Autowired
    private ProctransMapper proctransMapper ;
    @Autowired
    private NodebuttonMapper nodebuttonMapper ;
    @Autowired
    private NodepageMapper nodepageMapper ;

    @Override
    public List<NodeKeyinfoBean> selectNodebutton(String nodeid) {
        NodebuttonExample nodebuttonExample = new NodebuttonExample() ;
        nodebuttonExample.createCriteria().andNodeidEqualTo(nodeid) ;
        List<Nodebutton> nodebuttons = new ArrayList<>() ;
        nodebuttons = nodebuttonMapper.selectByExample(nodebuttonExample) ;
        NodeKeyinfoBean bean = new NodeKeyinfoBean() ;
        List<Proctrans> proctransList = new ArrayList<>() ;
        List<NodeKeyinfoBean> beans = new ArrayList<>() ;
        ProctransExample proctransExample = new ProctransExample() ;
        if(!CollectionUtils.isEmpty(nodebuttons)) {
            for (Nodebutton node : nodebuttons) {
                bean.setId(node.getId());
                bean.setName(node.getName());
                bean.setNextnode(node.getNextnode());
                bean.setOrdernode(node.getOrdernode());
                proctransExample.createCriteria().andButtonidEqualTo(node.getId()) ;
                proctransList = proctransMapper.selectByExample(proctransExample) ;
                if(!CollectionUtils.isEmpty(proctransList)) {
                    bean.setProctransList(proctransList);
                }
                beans.add(bean) ;
            }
        }
        return beans;
    }

    @Override
    public void insertNodebutton(List<NodeKeyinfoBean> bean) {
        Nodebutton nodebutton = new Nodebutton() ;
        List<Proctrans> proctransList = new ArrayList<>();
        for (NodeKeyinfoBean nobean:
             bean) {
            nodebutton.setId(Util.getID());
            nodebutton.setName(nobean.getName());
            nodebutton.setNextnode(nobean.getNextnode());
            nodebutton.setOrdernode(nobean.getOrdernode());
            nodebutton.setNodeid(nobean.getNodeid());
            nodebuttonMapper.insertSelective(nodebutton) ;
            proctransList.addAll(nobean.getProctransList()) ;
            for (Proctrans proctrans : proctransList) {
                proctransMapper.insertSelective(proctrans) ;
            }
        }
    }

    @Override
    public void updateNodebutton(List<NodeKeyinfoBean> bean) {
        Nodebutton nodebutton = new Nodebutton() ;
        List<Proctrans> proctransList = new ArrayList<>();
        NodebuttonExample nodebuttonExample = new NodebuttonExample() ;
        for (NodeKeyinfoBean nobean:
                bean) {
            nodebutton.setId(nobean.getId());
            nodebutton.setName(nobean.getName());
            nodebutton.setNextnode(nobean.getNextnode());
            nodebutton.setOrdernode(nobean.getOrdernode());
            nodebuttonExample.createCriteria().andNodeidEqualTo(nobean.getNodeid()) ;
            nodebuttonMapper.updateByExample(nodebutton , nodebuttonExample) ;
            proctransList.addAll(nobean.getProctransList()) ;
            ProctransExample proctransExample = new ProctransExample() ;
            for (Proctrans proctrans : proctransList) {
                proctransExample.createCriteria().andButtonidEqualTo(nobean.getId()) ;
                proctransMapper.updateByExampleSelective(proctrans , proctransExample);
            }
        }
    }

    @Override
    public void insertNobutton(NodeKeyinfoBean bean) {
        Nodebutton nodebutton = new Nodebutton() ;
        List<Proctrans> proctransList = new ArrayList<>();
        String id = Util.getID();
        nodebutton.setId(id);
        nodebutton.setName(bean.getName());
        nodebutton.setNextnode(bean.getNextnode());
        nodebutton.setOrdernode(bean.getOrdernode());
        nodebutton.setNodeid(bean.getNodeid());
        nodebuttonMapper.insertSelective(nodebutton) ;
        proctransList.addAll(bean.getProctransList()) ;
        for (Proctrans proctrans : proctransList) {
        	proctrans.setTransid(Util.getID());
        	proctrans.setButtonid(id);
            proctransMapper.insertSelective(proctrans) ;
        }

    }

    @Override
    public void updateNobutton(NodeKeyinfoBean bean) {
        Nodebutton nodebutton = new Nodebutton() ;
        List<Proctrans> proctransList = new ArrayList<>();
        NodebuttonExample nodebuttonExample = new NodebuttonExample() ;
        nodebutton.setId(bean.getId());
        nodebutton.setName(bean.getName());
        nodebutton.setNextnode(bean.getNextnode());
        nodebutton.setOrdernode(bean.getOrdernode());
        nodebutton.setNodeid(bean.getNodeid());
        nodebuttonExample.createCriteria().andNodeidEqualTo(bean.getNodeid()) ;
        nodebuttonMapper.updateByExample(nodebutton , nodebuttonExample) ;
        ProctransExample proctransExample = new ProctransExample() ;
        for (Proctrans proctrans : proctransList) {
            proctransExample.createCriteria().andButtonidEqualTo(bean.getId()).andTransidEqualTo(proctrans.getTransid()) ;
            proctransMapper.deleteByExample(proctransExample);
            proctrans.setTransid(Util.getID());
            proctransMapper.insertSelective(proctrans);
        }
    }

    @Override
    public List<Nodepage> selectNodepage(String nodeid) {
        NodepageExample nodepageExample = new NodepageExample() ;
        nodepageExample.createCriteria().andNodeidEqualTo(nodeid) ;
        List<Nodepage> nodepages = nodepageMapper.selectByExample(nodepageExample);
        if(!CollectionUtils.isEmpty(nodepages)) {
            return nodepages ;
        }else {
            return null ;
        }
    }
}
