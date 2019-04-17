package com.grape.service.impl;

import com.grape.model.db.Nodepage;
import com.grape.model.db.NodepageExample;
import com.grape.model.mapper.base.NodepageMapper;
import com.grape.service.NodepageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class NodepageServiceImpl implements NodepageService {
    @Autowired
    private NodepageMapper nodepageMapper ;

    @Override
    public List<Nodepage> selectAllNodepage(String nodeid) {
        List<Nodepage> nodepages = new ArrayList<>() ;
        NodepageExample example = new NodepageExample() ;
        example.createCriteria().andNodeidEqualTo(nodeid) ;
        nodepages = nodepageMapper.selectByExample(example) ;
        if(!CollectionUtils.isEmpty(nodepages)) {
            return nodepages ;
        }else {
            return null;
        }
    }

    @Override
    public void insertNodepage(Nodepage nodepage) {
        nodepageMapper.insert(nodepage) ;
    }

    @Override
    public void updateNodepage(Nodepage nodepage) {
        NodepageExample example = new NodepageExample() ;
        example.createCriteria().andIdEqualTo(nodepage.getId()) ;
        nodepageMapper.updateByExample(nodepage , example) ;
    }
}
