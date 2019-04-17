package com.grape.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.bean.ProductInfo;
import com.grape.controller.reponse.bean.ProductView;
import com.grape.model.db.Codetable;
import com.grape.model.db.CodetableExample;
import com.grape.model.db.Product;
import com.grape.model.mapper.BaseMapper;
import com.grape.model.mapper.PageBean;
import com.grape.model.mapper.base.CodetableMapper;
import com.grape.model.mapper.base.ProductMapper;
import com.grape.model.mapper.external.ProductExMapper;
import com.grape.service.ProductService;
@Service
public class ProductServiceImpl extends BaseMapper implements ProductService {
	
	@Autowired
	CodetableMapper codetableMapper;
	@Autowired
	ProductExMapper productExMapper;
	
	@Autowired
	ProductMapper productMapper;
	@Override
	public ProductView findByProducttype(String workerid,String city,String producttype,PageBean pageBean) {
		Codetable  codetable = codetableMapper.selectByPrimaryKey("PRODUCTTYPE", producttype);

		String coddes = codetable.getCoddes();
		
		ProductView viewBean = new ProductView();
		viewBean.setProducttype(producttype);
		viewBean.setProducttypename(coddes);
		
		Map<String, String> param = new HashMap<>();
		param.put("producttype", producttype);
		param.put("city", city);
		param.put("workerid", workerid);
		
		List<ProductInfo> productInfos = queryList(ProductExMapper.class, "findProductInfoByParam", param, pageBean);
		
		viewBean.setProductinfos(productInfos);
		
		int count = productExMapper.countProductList(param);
		pageBean.setRecordCount(count);
		return viewBean;
	}
	@Override
	public List<ProductView> findProductAll(PageBean pageBean) {
		CodetableExample codetableExample = new CodetableExample();
		codetableExample.createCriteria().andCodtypEqualTo("PRODUCTTYPE");
		List<Codetable> codetables = codetableMapper.selectByExample(codetableExample);
		
		List<ProductView> productViews = new ArrayList<>();
		for (Codetable codetable : codetables) {
			ProductView productView = new ProductView();
			productView.setProducttype(codetable.getCodflg());
			productView.setProducttypename(codetable.getCoddes());
			Map<String, String> param = new HashMap<>();
			param.put("producttype", codetable.getCodflg());
			
			
			List<ProductInfo> productInfos = queryList(ProductExMapper.class, "findProductInfoByParam", param, pageBean);
			
			productView.setProductinfos(productInfos);
			
			productViews.add(productView);
			int count = productExMapper.countProductAll(param);
			pageBean.setRecordCount(count);
		}
		
		return productViews;
	}
	@Override
	public String findContentByProductno(String productno) {
		Product product = productMapper.selectByPrimaryKey(productno);
		if(product!=null){
			return product.getContent();
		}
		return "";
	}
	@Override
	public boolean ProductUse(String productno, String citycode, String workerid) {
		Map<String, String> map = new HashMap<>();
		map.put("productno", productno);
		map.put("citycode", citycode);
		map.put("workerid", workerid);
		List<ProductInfo> infos = productExMapper.ProductUse(map);
		if(infos.size()>0){
			return true;
		}
		return false;
	}
	

}
