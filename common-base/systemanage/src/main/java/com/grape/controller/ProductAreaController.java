package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.ProductAreaInfoResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.ProductAreaFormRequest;
import com.grape.controller.request.ProductAreaInfoRequest;
import com.grape.controller.request.ProductAreaRequest;
import com.grape.controller.response.bean.ProductAreaBean;
import com.grape.model.db.City;
import com.grape.model.db.Codetable;
import com.grape.service.CodetableService;
import com.grape.service.ProductAreaService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/productAreaManage")
public class ProductAreaController {
	
	@Autowired
	private ProductAreaService productAreaService;
	
	@Autowired
	private CodetableService codetableService;
	
	
	@RequestMapping("/selectproductAreaInfo")
	@ApiOperation(value="根据产品编号和地域等条件查询产品地区信息",notes="查询产品区域信息接口",httpMethod="POST",response=ProductAreaInfoResponse.class)
	public Response selectProductAreaInfo(@RequestBody ProductAreaInfoRequest req){
		Integer pagenum = req.getPagenum();
		Integer pagestart = (req.getPagenum()-1)*(req.getPagesize());
		req.setPagenum(pagestart);
		List<ProductAreaBean> list = new ArrayList<ProductAreaBean>();
		list = productAreaService.selectProductAreaInfo(req);
		Integer count = productAreaService.selectProductAreaInfoCount(req);
		if(list!=null && list.size()>0){
			for(int i=0;i<list.size();i++){
				String areaid = list.get(i).getAreaid();
				String producttypecode = "PRODUCTTYPE";
				String producttype = list.get(i).getProducttype();
				Codetable codetable = codetableService.selectCodetableByCodtypAndflg(producttype,producttypecode);
				if(codetable!=null){
					list.get(i).setProducttypename(codetable.getCoddes());
				}
				City city = productAreaService.selectAreaNameById(areaid);
				if(city!=null){
					list.get(i).setAreaname(city.getCityname());
				}
			}
			return new ProductAreaInfoResponse(list,pagenum,count);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@RequestMapping("/insertProductArea")
	@ApiOperation(value="新增产品区域信息",notes="新增产品区域信息接口",httpMethod="POST",response=RestfulResponse.class)
	public Response insertProductAreaInfo(@RequestBody ProductAreaRequest req){
		productAreaService.insertProductAreaInfo(req);
		
		return new RestfulResponse();
	}
	
	@RequestMapping("/updateProductArea")
	@ApiOperation(value="更新产品区域信息",notes="更新产品区域信息接口",httpMethod="POST",response=RestfulResponse.class)
	public Response updateProductArea(@RequestBody ProductAreaFormRequest req){
		productAreaService.updateProductAreaInfo(req);
		
		return new RestfulResponse();
	}
	
	
}
