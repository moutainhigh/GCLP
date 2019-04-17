package com.grape.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.ProductContentResponse;
import com.grape.controller.reponse.ProductViewResponse;
import com.grape.controller.reponse.ProductViewsResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.bean.ProductView;
import com.grape.controller.request.CommenPageRequest;
import com.grape.controller.request.ProductCityRequest;
import com.grape.controller.request.ProductContentRequest;
import com.grape.controller.request.ProductRequest;
import com.grape.model.db.Person;
import com.grape.model.mapper.PageBean;
import com.grape.service.PersonService;
import com.grape.service.ProductService;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product")
@Validated
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private PersonService personService;

	
	@ApiOperation(value = "展示更多单个产品",httpMethod="POST",notes="展示更多单个产品",response=ProductViewResponse.class)
    @RequestMapping("/more")
    public Response more(@Validated @RequestBody ProductRequest req) {
		
		ProductView productView;
		PageBean pageBean = Util.intPageBean(req.getCurrentpage(), req.getSize());
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
			Person person = personService.findPersonByWorkeridOrPhone(username);
			productView = productService.findByProducttype(username,person.getCity(),req.getProducttype(), pageBean);
			
			return new ProductViewResponse(productView,pageBean.getRecordCount().toString());
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
    }
	@ApiOperation(value = "产品展示",httpMethod="POST",notes="产品展示",response=ProductViewsResponse.class)
    @RequestMapping("/view")
    public Response view(@Validated @RequestBody CommenPageRequest req) {
		
		
		try {
			List<ProductView> productViews;
			PageBean pageBean = Util.intPageBean(req.getCurrentpage(), req.getSize());
			productViews = productService.findProductAll(pageBean);
			
			return new ProductViewsResponse(productViews,pageBean.getRecordCount().toString());
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
		
    }
	
	@ApiOperation(value = "产品展示（切换城市）",httpMethod="POST",notes="用于城市切换时的产品展示",response=ProductViewsResponse.class)
    @RequestMapping("/view_city")
    public Response view_city(@Validated @RequestBody ProductCityRequest req) {
		
		List<ProductView> productViews;
		PageBean pageBean = Util.intPageBean(req.getCurrentpage(), req.getSize());
		
		
		try {
		
			productViews = productService.findProductAll(pageBean);
			
			return new ProductViewsResponse(productViews,pageBean.getRecordCount().toString());
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
    }
	

	@ApiOperation(value = "产品详细内容",httpMethod="POST",notes="返回产品详细内容",response=ProductContentResponse.class)
    @RequestMapping("/content")
    public Response content(@Validated @RequestBody ProductContentRequest req) {
		
		
		try {
			String content = productService.findContentByProductno(req.getProductno());
			
			String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
			Person person = personService.findPersonByWorkeridOrPhone(workerid);
			
			boolean useflg = productService.ProductUse(req.getProductno(), person.getCity(), workerid);
			
			return new ProductContentResponse(req.getProductno(),content,useflg);
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL,MessageDetail.QUERY_ERROR);
		}
    }
}
