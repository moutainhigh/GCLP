package com.grape.controller.feigncontroller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grape.controller.reponse.WaihuCalllogResponse;
import com.grape.controller.request.WorkidRequest;

@FeignClient(value="commen-company",url="http://localhost:8080/company")
public interface CompanyFeign {
	@RequestMapping("/waihu/calllog_get")
	public WaihuCalllogResponse callloginfo(WorkidRequest req); 
	
}
