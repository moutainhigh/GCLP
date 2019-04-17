package com.grape.controller;

import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.NodepageReponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.NodebuttonRequest;
import com.grape.controller.request.NodeidRequest;
import com.grape.controller.request.NodepageRequest;
import com.grape.model.db.Nodepage;
import com.grape.service.NodepageService;
import com.grape.util.Util;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grape.bean.StatusCode;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/nodepage")
@RestController
public class NodepageController {
    @Autowired
    private NodepageService nodepageService ;

    @RequestMapping("/selectNodepage")
    @ApiOperation(value="根据nodeid查询节点页面信息",notes="",httpMethod="POST")
    public Response selectNodepage(@RequestBody NodeidRequest request){
        List<Nodepage> nodepages = new ArrayList<>() ;
        nodepages = nodepageService.selectAllNodepage(request.getNodeid());
        if(!CollectionUtils.isEmpty(nodepages)) {
            return new NodepageReponse(nodepages) ;
        }else {
            return new ErrorEntity(StatusCode.NO_DATAERROR) ;
        }
    }


    @RequestMapping("/insertNodepage")
    @ApiOperation(value="添加或修改节点页面信息",notes="",httpMethod="POST")
    public Response saveNodepage(@RequestBody NodepageRequest request){
        List<Nodepage> nodepageList = new ArrayList<>() ;
        nodepageList = request.getNodepageList();
        for (Nodepage nodepage:nodepageList
             ) {
            if(StringUtils.isEmpty(nodepage.getId())) {
                nodepage.setId(Util.getID());
                nodepageService.insertNodepage(nodepage);
            }else {
                nodepageService.updateNodepage(nodepage);
            }
        }
        return new RestfulResponse() ;
    }
}
