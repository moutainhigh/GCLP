package com.grape.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.ApplyinfofcomBean;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ApplyinfoOfComResponse;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.IndustyResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.SharemanResponse;
import com.grape.controller.request.ApplyinfoOfComRequest;
import com.grape.controller.request.Codflg;
import com.grape.controller.request.WorkidAndComnoRequest;
import com.grape.model.db.Applyinfoofcom;
import com.grape.model.db.City;
import com.grape.model.db.Industry;
import com.grape.model.db.Shareman;
import com.grape.service.ApplyinfoOfComService;
import com.grape.service.CityService;
import com.grape.service.IndustyService;
import com.grape.service.SharemanService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/comofApplyinfo")
public class ComofApplyinfoController {
	private static final Logger log = LoggerFactory.getLogger(ComofApplyinfoController.class);
	@Autowired
	private CityService cityService;
	@Autowired
	private ApplyinfoOfComService applyinfoOfComService;
	@Autowired
	private IndustyService industyService;
	@Autowired
	private SharemanService sharemanService;
	@ApiOperation(value="根据申请编号和公司社会统一信用编号查询公司申请人信息",notes="公司申请人信息接口一",response=ApplyinfoOfComResponse.class,httpMethod="POST")
	@RequestMapping("/queryByWorkid")
	public Response queryByWorkid(@RequestBody WorkidAndComnoRequest req){
		ApplyinfofcomBean applyBean = new ApplyinfofcomBean();
		Applyinfoofcom applyinfo = applyinfoOfComService.queryByWorkidAndCredid(req);
		List<Shareman> sharelist = sharemanService.selectSharemanList(req);
		List<Shareman> sharelist2 = sharemanService.selectSharemanList2(req);
		if(applyinfo!=null){
			City comaddresscity =cityService.selectCityById(applyinfo.getComaddresscity());
			City comaddressprovince =cityService.selectCityById(applyinfo.getComaddressprovince());
			City comaddressarea = cityService.selectCityById(applyinfo.getComaddressarea());
			City realcomaddresscity =cityService.selectCityById(applyinfo.getRealcomaddresscity());
			City realcomaddressprovince = cityService.selectCityById(applyinfo.getRealcomaddressprovince());
			City realarea = cityService.selectCityById(applyinfo.getRealcomaddressarea());
			Industry industyfirst = industyService.selectNameById(applyinfo.getIndustryfirst());
			Industry industysecond = industyService.selectNameById(applyinfo.getIndustrysecond());
			try {
				Util.transferFields(applyinfo, applyBean);
			} catch (Exception e) {
				log.info("法人信息实体类转换出错");
			}
			
			if(comaddresscity != null) {
				applyBean.setComaddresscityofch(comaddresscity.getCityname());
			}
			if(comaddressprovince != null) {
				applyBean.setComaddressprovinceofch(comaddressprovince.getCityname());
			}
			if(comaddressarea != null) {
				applyBean.setComaddressareaofch(comaddressarea.getCityname());
			}
			if(realcomaddresscity != null) {
				applyBean.setRealcomaddresscityofch(realcomaddresscity.getCityname());
			}
			if(realcomaddressprovince != null) {
				applyBean.setRealcomaddressprovinceofch(realcomaddressprovince.getCityname());
			}
			if(realarea != null) {
				applyBean.setRealcomaddressareaofch(realarea.getCityname());
			}
			if(industyfirst != null) {
				applyBean.setIndustryfirstofch(industyfirst.getCodname());
			}
			if(industysecond != null) {
				applyBean.setIndustrysecondofch(industysecond.getCodname());
			}
			if(sharelist2.size()>0){
				sharelist.addAll(sharelist2);
			}
			return new ApplyinfoOfComResponse(applyBean,sharelist);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="更新公司申请人信息",notes="公司申请人信息接口二",response=ApplyinfoOfComResponse.class,httpMethod="POST")
	@RequestMapping("/saveapplyinfo")
	public Response saveApplyinfo(@RequestBody ApplyinfoOfComRequest req){
		applyinfoOfComService.saveApplyinfoOfCom(req);
		return new RestfulResponse();
	}
	
	@ApiOperation(value="新增公司申请人信息",notes="公司申请人信息接口四",response=ApplyinfoOfComResponse.class,httpMethod="POST")
	@RequestMapping("/insertApplyinfo")
	public Response insertApplyinfo(@RequestBody ApplyinfoOfComRequest req){
		WorkidAndComnoRequest comreq = new WorkidAndComnoRequest();
		comreq.setComno(req.getSocialcreditcode());
		comreq.setWorkid(req.getWorkid());
		Applyinfoofcom applyinfo = applyinfoOfComService.queryByWorkidAndCredid(comreq);
		if(applyinfo!=null){
			applyinfoOfComService.saveApplyinfoOfCom(req);
		}else{
			applyinfoOfComService.insertApplyinfoOfCom(req);
		}
		return new RestfulResponse();
	}
	
	@ApiOperation(value="删除公司申请人信息",notes="公司申请人信息接口三",response=ApplyinfoOfComResponse.class,httpMethod="POST")
	@RequestMapping("/deleteapplyinfo")
	public Response deleteApplyinfo(@RequestBody WorkidAndComnoRequest req){
		applyinfoOfComService.deleteApplyinfoOfCom(req);
		return new RestfulResponse();
	}
	
	@ApiOperation(value="股东信息",notes="查询股东信息",response=SharemanResponse.class,httpMethod="POST")
	@RequestMapping("/selectShareman")
	public Response selectShareman(@RequestBody WorkidAndComnoRequest req){
		List<Shareman> list = sharemanService.selectSharemanList(req);
		if(list!=null){
			return new SharemanResponse(list);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	
	@ApiOperation(value="行业分类",notes="行业分类的地铁一个接口",response=IndustyResponse.class,httpMethod="POST")
	@RequestMapping("/selectIndusty")
	public Response selectIndusty(@RequestBody Codflg req){
		Industry industry = applyinfoOfComService.selectIndustry(req);
		if(industry!=null){
			return new IndustyResponse(industry);
		}
		return new ErrorEntity(StatusCode.NO_DATAERROR);
	
	}
}
