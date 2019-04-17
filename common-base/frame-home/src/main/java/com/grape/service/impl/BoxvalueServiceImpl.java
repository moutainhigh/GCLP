package com.grape.service.impl;

import com.grape.controller.reponse.OrganizationInfoResponse;
import com.grape.controller.reponse.ProductInfoResponse;
import com.grape.controller.reponse.bean.GetProductInfo;
import com.grape.controller.reponse.bean.OrganizationInfo;
import com.grape.model.db.Area;
import com.grape.model.db.Codetable;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.model.mapper.external.BoxvalueExMapper;
import com.grape.service.BoxvalueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoxvalueServiceImpl implements BoxvalueService {

	@Autowired
	private BoxvalueExMapper boxvalueExMapper;

	@Override
	public List<Product> getProduct() {
		return boxvalueExMapper.getProduct();
	}

	@Override
	public ProductInfoResponse productInfoResponse() {
		GetProductInfo prd=new GetProductInfo("1", "房抵贷", boxvalueExMapper.getPRD());
		GetProductInfo sld=new GetProductInfo("2", "赎楼贷", boxvalueExMapper.getSLD());
		GetProductInfo zq=new GetProductInfo("5", "展期", boxvalueExMapper.getZQ());
		List<GetProductInfo> getProductInfo=new ArrayList<GetProductInfo>();
		getProductInfo.add(prd);
		getProductInfo.add(sld);
		getProductInfo.add(zq);
		return new ProductInfoResponse(getProductInfo);
	}

	@Override
	public List<Productnode> getProductnode(String productno) {
		Map<String, Object> ParamMap = new HashMap<String, Object>();
		ParamMap.put("productno", productno);
		return boxvalueExMapper.getProductnode(ParamMap);
	}

	@Override
	public List<Codetable> getLog() {
		return boxvalueExMapper.getLog();
	}

	@Override
	public List<Area> getArea() {
		return boxvalueExMapper.getArea();
	}

	@Override
	public OrganizationInfoResponse organizationInfoResponse() {
		String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		HashMap<String, Object> ParamMap = new HashMap<String, Object>();
		ParamMap.put("workerid", username);
		ParamMap.put("mobilephone", username);
		Map<String, Object> map=boxvalueExMapper.getUserOfOrg(ParamMap);

		OrganizationInfo channelside=new OrganizationInfo("01", "渠道方", boxvalueExMapper.getChannelside());
		OrganizationInfo fundside=new OrganizationInfo("02", "资金方", boxvalueExMapper.getFundside());
		OrganizationInfo aisleside=new OrganizationInfo("03", "通道方", boxvalueExMapper.getAisleside());
		OrganizationInfo terrcaeno=new OrganizationInfo("04", "平台方", boxvalueExMapper.getTerrcaeno());
		List<OrganizationInfo> organizationInfo=new ArrayList<OrganizationInfo>();
		String orgbelongsto=map.get("orgbelongsto").toString();
		if(orgbelongsto.equals("03")){
			organizationInfo.add(fundside);
		}
		if(orgbelongsto.equals("04")){
			organizationInfo.add(channelside);
			organizationInfo.add(fundside);
		}
		return new OrganizationInfoResponse(organizationInfo);
	}
}
