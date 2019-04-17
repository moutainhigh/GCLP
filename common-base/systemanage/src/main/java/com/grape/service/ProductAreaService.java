package com.grape.service;

import java.util.List;

import com.grape.controller.request.ProductAreaFormRequest;
import com.grape.controller.request.ProductAreaInfoRequest;
import com.grape.controller.request.ProductAreaRequest;
import com.grape.controller.response.bean.ProductAreaBean;
import com.grape.model.db.City;

public interface ProductAreaService {

	List<ProductAreaBean> selectProductAreaInfo(ProductAreaInfoRequest req);

	void insertProductAreaInfo(ProductAreaRequest req);

	void updateProductAreaInfo(ProductAreaFormRequest req);

	Integer selectProductAreaInfoCount(ProductAreaInfoRequest req);

	City selectAreaNameById(String areaid);

}
