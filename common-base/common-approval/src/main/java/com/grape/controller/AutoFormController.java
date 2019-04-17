package com.grape.controller;

import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.TestResponse2;
import com.grape.controller.request.AutoFormRequest;
import com.grape.controller.request.FormDataRequest;
import com.grape.controller.request.FormIdRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Autoform;
import com.grape.model.db.Formdata;
import com.grape.service.AutoFormService;
import com.grape.util.Util;

import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;

import java.util.List;

@RestController
@RequestMapping("/AutoForm")
public class AutoFormController {
    @Autowired
    private AutoFormService autoformService;

    @ApiOperation(value="根据id查询表单的json字符串信息",notes="自动生成表单接口一",httpMethod="POST",response= TestResponse2.class)
    @RequestMapping("selectColumnById")
    public Response selectColumnById(@RequestBody @Validated IdRequest req){
        Autoform autoForm = autoformService.selectColumnById(req.getId());
        if(autoForm!=null){
            String jsoncolumn = (String) autoForm.getJsoncolumn();
            JSONObject json = JSONObject.fromObject(jsoncolumn);
            String jsonstr = json.toString();
            return new TestResponse2(jsonstr);
        }
        return new ErrorEntity(StatusCode.NO_DATAERROR);
    }
    
    @ApiOperation(value="根据formid查询表单的json字符串信息",notes="自动生成表单接口一",httpMethod="POST",response= TestResponse2.class)
    @RequestMapping("selectColumnByFormId")
    public Response selectColumnByFormId(@RequestBody @Validated FormIdRequest req){
        Autoform autoForm = autoformService.selectColumnByFormId(req.getFormid());
        if(autoForm!=null){
            String jsoncolumn = (String) autoForm.getJsoncolumn();
            return new TestResponse2(jsoncolumn);
        }
        return new ErrorEntity(StatusCode.NO_DATAERROR);
    }

    @ApiOperation(value="新增动态表单",notes="自动生成表单接口二",httpMethod="POST",response= RestfulResponse.class)
    @RequestMapping("insertFromColumn")
    public Response insertFromColumn(@RequestBody AutoFormRequest autoFormRequest){
        autoformService.insertFormColumn(autoFormRequest);
        return new RestfulResponse();
    }

    @ApiOperation(value="新增动态表单数据",notes="自动生成表单接口三",httpMethod="POST",response= RestfulResponse.class)
    @RequestMapping("insertFromColumnData")
    public Response insertFromColumnData(@RequestBody FormDataRequest formDataRequest){
        autoformService.insertFormColumnData(formDataRequest);
        return new RestfulResponse();
    }

    @ApiOperation(value = "查询表单数据接口",notes = "查询表单接口四",httpMethod = "POST",response = TestResponse2.class)
    @RequestMapping("selectFormDataById")
    public Response selectFormDataById(@RequestBody IdRequest req){
        Formdata formdata = new Formdata();
        formdata= autoformService.selectFormDataById(req);
        if(formdata!=null){
        	return new TestResponse2(formdata.getFormdata());
        }
        return new ErrorEntity(StatusCode.NO_DATAERROR);
    }

    @ApiOperation(value = "查询所有表单接口",notes = "查询表单数据接口五",httpMethod = "POST",response = TestResponse2.class)
    @RequestMapping("/selectAllFormInfo")
    public Response selectAllFormInfo(){
        List<Autoform> autoFormList = autoformService.selectAllFormInfo();
        if(autoFormList!=null && !autoFormList.isEmpty()){
            return new TestResponse2();
        }else{
            return new ErrorEntity(StatusCode.NO_DATAERROR);
        }
    }
    
    @RequestMapping(value="insertOrUpdateForm")
    public Response insertOrUpdateForm(@Validated @RequestBody AutoFormRequest autoFormRequest){
    	String formname = autoFormRequest.getFormname();
    	Boolean isexist = Util.isExistDatabase("dyitp", formname);
    	//如果表单存在，则更新或插入表中数据
    	if(isexist){
    		
    	}else{
    		//在数据库中创建一个新的表单
    		Util.createTable(formname);
    	}
    	return new RestfulResponse();
    }
}
