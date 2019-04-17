package com.grape.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.NoticeResponse;
import com.grape.controller.reponse.NoticeResponse1;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.request.WorkidRequest;
import com.grape.model.db.Mattersattention;
import com.grape.service.NoticeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/notice")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@ApiOperation(value="根据申请编号查询注意事项列表",httpMethod="POST",notes="查询注意事项的接口一",response=NoticeResponse.class)
	@RequestMapping("/queryByWorkid")
	public Response queryByWorkid(@RequestBody WorkidRequest req){
		List<Mattersattention> list = noticeService.queryByWorkid(req);
		if(!list.isEmpty()){
			return new NoticeResponse1(list.get(0));
		}
		return  new ErrorEntity(StatusCode.NO_DATAERROR);
	}
	/*@ApiOperation(value="新增注意事项列表",httpMethod="POST",notes="注意事项的接口二",response=NoticeResponse.class)
	public Response insertNotice(@RequestBody NoticeRequest req){
		noticeService.insertNotice(req);
		
		return new RestfulResponse();
	}*/
}
