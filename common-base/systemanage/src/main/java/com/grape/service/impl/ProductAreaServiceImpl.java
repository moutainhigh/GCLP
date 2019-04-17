package com.grape.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.request.ProductAreaFormRequest;
import com.grape.controller.request.ProductAreaInfoRequest;
import com.grape.controller.request.ProductAreaRequest;
import com.grape.controller.response.bean.ProductAreaBean;
import com.grape.model.db.City;
import com.grape.model.db.Productarea;
import com.grape.model.db.ProductareaExample;
import com.grape.model.mapper.base.CityMapper;
import com.grape.model.mapper.base.ProductareaMapper;
import com.grape.model.mapper.external.ProductAreaExMapper;
import com.grape.service.ProductAreaService;
import com.grape.util.Util;

@Service
public class ProductAreaServiceImpl implements ProductAreaService{
	private static final Logger log = LoggerFactory.getLogger(ProductAreaServiceImpl.class);
	@Autowired
	private ProductAreaExMapper productAreaExMapper;
	
	@Autowired
	private CityMapper cityMapper;
	
	@Autowired
	private ProductareaMapper productareaMapper;
	@Override
	public List<ProductAreaBean> selectProductAreaInfo(ProductAreaInfoRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(req.getArea()!=null && !"".equals(req.getArea())){
			map.put("area", req.getArea());
		}
		if(req.getProductname()!=null && !"".equals(req.getProductname())){
			map.put("productname", req.getProductname());
		}
		if(req.getProductno()!=null && !"".equals(req.getProductno())){
			map.put("productno", req.getProductno());
		}
		if(req.getProducttype()!=null && !"".equals(req.getProducttype())){
			map.put("producttype", req.getProducttype());
		}
		map.put("pagenum", req.getPagenum());
		map.put("pagesize", req.getPagesize());
		List<ProductAreaBean> list = productAreaExMapper.selectProductAreaInfo(map);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}
	@Override
	public void insertProductAreaInfo(ProductAreaRequest req) {
		List<String> arealist = req.getAreaid();
		String productno = req.getProductno();
		for(int i=0;i<arealist.size();i++){
			Productarea productarea = new Productarea();
			productarea.setProductno(productno);
			ProductareaExample example = new ProductareaExample();
			example.createCriteria().andAreaidEqualTo(arealist.get(i)).andProductnoEqualTo(productno);
			List<Productarea> list = productareaMapper.selectByExample(example);
			//先判断该产品的该区域是否已经新增到了表中，如果没有则新增进去
			if(list==null ){
				productarea.setAreaid(arealist.get(i));
				productareaMapper.insert(productarea);
			}
		}
	}
	@Override
	public void updateProductAreaInfo(ProductAreaFormRequest req) {
		Productarea productarea = new Productarea();
		try {
			Util.transferFields(req, productarea);
		} catch (Exception e) {
			log.info("实体类转换出错");
		}
		
		ProductareaExample example = new ProductareaExample();
		example.createCriteria().andProductnoEqualTo(req.getProductno()).andAreaidEqualTo(req.getAreaid());
		productareaMapper.updateByExample(productarea, example);
	}
	@Override
	public Integer selectProductAreaInfoCount(ProductAreaInfoRequest req) {
		Map<String,Object> map = new HashMap<String,Object>();
		if(req.getArea()!=null && !"".equals(req.getArea())){
			map.put("area", req.getArea());
		}
		if(req.getProductname()!=null && !"".equals(req.getProductname())){
			map.put("productname", req.getProductname());
		}
		if(req.getProductno()!=null && !"".equals(req.getProductno())){
			map.put("productno", req.getProductno());
		}
		if(req.getProducttype()!=null && !"".equals(req.getProducttype())){
			map.put("producttype", req.getProducttype());
		}
		map.put("pagenum", req.getPagenum());
		map.put("pagesize",req.getPagesize());
		Integer count = productAreaExMapper.selectProductAreaInfoCount(map);
		return count;
	}
	@Override
	public City selectAreaNameById(String areaid) {
		City city = cityMapper.selectByPrimaryKey(areaid);
		return city;
	}

}
