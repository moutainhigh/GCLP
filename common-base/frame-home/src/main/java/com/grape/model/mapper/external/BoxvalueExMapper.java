package com.grape.model.mapper.external;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.grape.model.db.Area;
import com.grape.model.db.Codetable;
import com.grape.model.db.Organization;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
@Mapper
public interface BoxvalueExMapper {
	
	Map<String, Object> getUserOfOrg(Map<String, Object> map);
	
	List<Product> getProduct();
	
	List<Product> getPRD();
	
	List<Product> getSLD();
	
	List<Product> getZQ();
	
	List<Productnode> getProductnode(Map<String,Object> map);

	List<Codetable> getLog();
	
	List<Area> getArea();
	
	List<Organization> getChannelside();
	
	List<Organization> getFundside();
	
	List<Organization> getAisleside();

	List<Organization> getTerrcaeno();
}
