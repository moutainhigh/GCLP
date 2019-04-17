package com.grape.controller.feigncontroller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grape.controller.reponse.FlowCreateResponse;
import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.FlowCreateRequest;
import com.grape.controller.request.FlowHandleRequest;

@FeignClient(value="workflow",url="http://localhost:8080/workflow")
public interface WorkflowForeign {
	@RequestMapping("/workflow/handle")
	public FlowHandleResponse handle(FlowHandleRequest req); 
	
	@RequestMapping("/workflow/genWorkid")
	public FlowCreateResponse startProcess(FlowCreateRequest req) ;
	
}
