package com.grape.service;

import java.util.List;

import com.grape.controller.request.NodeidAndProductnoRequest;
import com.grape.controller.request.NodepageBean;
import com.grape.controller.request.WorkidAndNodeidOperationRequest;
import com.grape.controller.request.WorkidAndNodeidRequest;
import com.grape.model.db.Nodebutton;
import com.grape.model.db.Productnode;
import com.grape.model.db.Rolemenu;

public interface NodePageService {

	List<NodepageBean> selectNodepageByNode(NodeidAndProductnoRequest req);

	List<Nodebutton> selectNodeButtonByNode(NodeidAndProductnoRequest req);

	Boolean selectHaveChoose(WorkidAndNodeidOperationRequest req);

	String selectReturnflg(NodeidAndProductnoRequest req);

	List<Rolemenu> selectRolemenu(List<String> role);

	boolean selectNextNodeByButton(NodeidAndProductnoRequest req);

	Productnode selectNodeinfo(String nodeid);

}
