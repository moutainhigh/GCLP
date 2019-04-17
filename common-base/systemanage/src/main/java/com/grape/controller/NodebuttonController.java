package com.grape.controller;

import com.grape.controller.reponse.*;
import com.grape.controller.request.NodebuttonRequest;
import com.grape.controller.request.NodeidRequest;
import com.grape.controller.response.bean.NodeKeyinfoBean;
import com.grape.service.MenuService;
import com.grape.service.NodebuttonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.bean.StatusCode;
import java.util.List;

@RestController
@RequestMapping("/nodebutton")
public class NodebuttonController {
    @Autowired
    private NodebuttonService nodebuttonService;

    @RequestMapping("/selectAllnodebutton")
    @ApiOperation(value="查找节点按键信息",notes="",httpMethod="POST",response= NodeKeyinfoResponse.class)
    public Response selectAllnodebutton(@RequestBody NodeidRequest request){
        List<NodeKeyinfoBean> nodeKeyinfoBeans = nodebuttonService.selectNodebutton(request.getNodeid());
        if(!CollectionUtils.isEmpty(nodeKeyinfoBeans)) {
            return new NodeKeyinfoResponse(nodeKeyinfoBeans) ;
        }else{
            return new ErrorEntity(StatusCode.NO_DATAERROR);
        }
    }

    @RequestMapping("/saveNodebutton")
    @ApiOperation(value="保存节点按键信息",notes="",httpMethod="POST")
    public Response saveAllnodebutton(@RequestBody NodebuttonRequest request){
        List<NodeKeyinfoBean> list = request.getLists();
        if(!CollectionUtils.isEmpty(list)) {
            for (NodeKeyinfoBean bean: list ) {
                if(StringUtils.isEmpty(bean.getId())){
                    nodebuttonService.insertNobutton(bean);
                } else {
                    nodebuttonService.updateNobutton(bean);
                }
            }
        }
        return new RestfulResponse() ;
    }
}
