package com.grape.controller;

import com.grape.bean.StatusCode;
import com.grape.controller.reponse.CodetableResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.CodtypRequest;
import com.grape.model.db.Codetable;
import com.grape.service.CodetableService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Codetable")
public class CodetableController {
    @Autowired
    private CodetableService codetableService ;

    @RequestMapping("/selectCompany")
    @ApiOperation(value="根据codtyp查询码表",notes="",httpMethod="POST",response= CodetableResponse.class)
    public Response selectCodeByCodtyp(@RequestBody CodtypRequest request) {
        List<Codetable> codetables = codetableService.selectcoddesAndflg(request.getCodtyp());
        if(!CollectionUtils.isEmpty(codetables)) {
            return new CodetableResponse(codetables) ;
        }else{
            return new ErrorEntity(StatusCode.NO_DATAERROR);
        }
    }
}
