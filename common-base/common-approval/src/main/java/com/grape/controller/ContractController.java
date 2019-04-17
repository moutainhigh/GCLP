package com.grape.controller;

import java.util.ArrayList;
import java.util.List;

import com.grape.model.db.Applyforex;
import com.grape.model.db.Doctask;
import com.grape.service.ApplyforexService;
import com.grape.service.DoctaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ContractResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.ContractRequest;
import com.grape.controller.request.ProductnoAndAeraAndChannelnoRequest;
import com.grape.model.db.Contract;
import com.grape.service.ContractService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/contract")
public class ContractController {

	@Autowired
	private ContractService contractService ;
	@Autowired
	private DoctaskService doctaskService ;
	@Autowired
    private ApplyforexService applyforexService ;

    private Doctask doctask;
    private List<Applyforex> applyforexes;
    private Applyforex applyforex;

    @ApiOperation(value="添加合同",notes="",httpMethod="POST")
	@RequestMapping("/insertContract")
	public Response insertContract(@RequestBody ContractRequest req) {
		contractService.insertContract(req);
		return new RestfulResponse();
	}

	@ApiOperation(value="查询合同",notes="",response=ContractResponse.class,httpMethod="POST")
	@RequestMapping("/queryContract")
	public Response queryContract(@RequestBody ProductnoAndAeraAndChannelnoRequest req) {
		String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
        doctask = doctaskService.queryByWorkid(workerid);
        if(null != doctask) {
            String productno ;
            if(doctask.getProductno().startsWith("ZQ")) {
                applyforexes = applyforexService.selectByNewWorkids(workerid);
                if(null != applyforexes && applyforexes.size() > 0) {
                    applyforex = applyforexes.get(0);
                    doctask = doctaskService.queryByWorkid(applyforex.getWorkid());
                    productno = doctask.getProductno() ;
                    req.setProductno(productno);
                }
            }
        }
        if(req.getChannelno() != null) {
			List<Contract> conlist = new ArrayList<>() ;
			conlist = contractService.selectContracts(req) ;
			if(!conlist.isEmpty()){
				return new ContractResponse(conlist);
			}else{
			return new ErrorEntity(StatusCode.NO_DATAERROR);
			}
		}else{
			return new ErrorEntity(StatusCode.NO_DATAERROR);
		}
	}
}
