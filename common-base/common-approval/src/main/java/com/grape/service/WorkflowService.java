package com.grape.service;

import com.grape.controller.request.FlowHandleRequest;

public interface WorkflowService {

	FlowHandleRequest selectWorkflow(String workid,String nodeid);

}
