package com.grape.service.impl;

import com.grape.controller.request.ShufflingOptionRequest;
import com.grape.model.db.Shufflingfigure;
import com.grape.model.db.ShufflingfigureExample;
import com.grape.model.mapper.base.ShufflingfigureMapper;
import com.grape.model.mapper.external.ShufflingExMapper;
import com.grape.service.ShufflingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShufflingServiceImpl implements ShufflingService {
    @Autowired
    private ShufflingfigureMapper shufflingfigureMapper ;
    @Autowired
    private ShufflingExMapper shufflingExMapper ;

    @Override
    public List<Shufflingfigure> selectAllShuffling() {
        ShufflingfigureExample shufflingfigureExample = new ShufflingfigureExample() ;
        shufflingfigureExample.createCriteria() ;
        List<Shufflingfigure> shufflingfigures = shufflingfigureMapper.selectByExample(shufflingfigureExample);
        if(!CollectionUtils.isEmpty(shufflingfigures)) {
            return shufflingfigures ;
        }else {
            return null ;
        }
    }

    @Override
    public List<Shufflingfigure> selectByOption(ShufflingOptionRequest request) {
        Map<String,Object> map = new HashMap<String,Object>();
        if(!StringUtils.isEmpty(request.getUseflg())) {
            map.put("useflg" , request.getUseflg()) ;
        }
        if(!StringUtils.isEmpty(request.getFilename())) {
            map.put("filename" , request.getFilename()) ;
        }
        if(!StringUtils.isEmpty(request.getProductno())) {
            map.put("productno" , request.getProductno()) ;
        }
        map.put("pagenum", request.getPagenum());
        map.put("pagesize", request.getPagesize());
        List<Shufflingfigure> list = shufflingExMapper.queryShufflingByOption(map) ;
        if(!CollectionUtils.isEmpty(list)) {
            return list ;
        }else {
            return null;
        }
    }

    @Override
    public Shufflingfigure selectById(String id) {
        Shufflingfigure shufflingfigure = shufflingfigureMapper.selectByPrimaryKey(id);
        return shufflingfigure;
    }

    @Override
    public void updateShufflingById(Shufflingfigure shufflingfigure) {
        shufflingfigureMapper.updateByPrimaryKeySelective(shufflingfigure) ;
    }

    @Override
    public void insertShuffing(Shufflingfigure shufflingfigure) {
        shufflingfigureMapper.insertSelective(shufflingfigure) ;
    }

    @Override
    public void deleteShuffling(String id) {
        shufflingfigureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void editShufflingStatu(String id , String useflg) {
        Shufflingfigure shufflingfigure = selectById(id);
        shufflingfigure.setUseflg(useflg);
        shufflingfigureMapper.updateByPrimaryKey(shufflingfigure) ;
    }

	@Override
	public Integer selectByOptionCount(ShufflingOptionRequest request) {
		Map<String,Object> map = new HashMap<String,Object>();
        if(!StringUtils.isEmpty(request.getUseflg())) {
            map.put("useflg" , request.getUseflg()) ;
        }
        if(!StringUtils.isEmpty(request.getFilename())) {
            map.put("filename" , request.getFilename()) ;
        }
        if(!StringUtils.isEmpty(request.getProductno())) {
            map.put("productno" , request.getProductno()) ;
        }
        Integer count = shufflingExMapper.queryShufflingByOptionCount(map) ;
		return count;
	}
}
