package com.grape.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.grape.controller.request.AutoFormRequest;
import com.grape.controller.request.FormDataRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Autoform;
import com.grape.model.db.AutoformExample;
import com.grape.model.db.Formdata;
import com.grape.model.db.FormdataExample;
import com.grape.model.mapper.base.AutoformMapper;
import com.grape.model.mapper.base.FormdataMapper;
import com.grape.service.AutoFormService;
import com.grape.util.Util;

@Service
public class AutoFormServiceImpl implements AutoFormService {
    @Autowired
    private AutoformMapper autoformMapper;
    @Autowired
    public FormdataMapper formdataMapper;

    @Override
    public Autoform selectColumnById(String id) {
        AutoformExample example = new AutoformExample();
        example.createCriteria().andIdEqualTo(Integer.parseInt(id));
        List<Autoform> list = autoformMapper.selectByExampleWithBLOBs(example);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public void insertFormColumn(AutoFormRequest autoFormRequest) {
        Autoform autoform = new Autoform();
        String jsonStr = null;
        try {
//            Util.transferFields(autoFormRequest, autoform);
//            JSONObject jsonObject = JSONObject.fromObject(autoFormRequest);
            jsonStr = JSONObject.toJSONString(autoFormRequest);
            autoform.setFormid(autoFormRequest.getFormid());
            autoform.setFormflg(autoFormRequest.getFormflg());
            autoform.setId(autoFormRequest.getId());
            autoform.setJsoncolumn(jsonStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        autoformMapper.insertSelective(autoform);
    }

    @Override
    public void insertFormColumnData(FormDataRequest formDataRequest) {
        Formdata formdata = new Formdata();
        String jsonStr = null;
        try {
//            Util.transferFields(formDataRequest, formdata);
        	jsonStr = JSONObject.toJSONString(formDataRequest);
        	formdata.setFormdata(jsonStr);
        	formdata.setFormid(formDataRequest.getFormid());
        	formdata.setId(formDataRequest.getId());
        	formdata.setWorkid(formDataRequest.getWorkid());
        	formdata.setSavetime(new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
        formdataMapper.insertSelective(formdata);
    }

    @Override
    public Formdata selectFormDataById(IdRequest req) {
        FormdataExample example = new FormdataExample();
        example.createCriteria().andIdEqualTo(Integer.parseInt(req.getId()));
        List<Formdata> formdata = formdataMapper.selectByExampleWithBLOBs(example);
        if (formdata != null) {
            return formdata.get(0);
        }
        return null;
    }

	@Override
	public Autoform selectColumnByFormId(String formid) {
		AutoformExample example = new AutoformExample();
        example.createCriteria().andFormidEqualTo(formid);
        List<Autoform> list = autoformMapper.selectByExampleWithBLOBs(example);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
	}

    @Override
    public List<Autoform> selectAllFormInfo() {
        AutoformExample example = new AutoformExample();
        example.createCriteria();
        List<Autoform> autoForms = autoformMapper.selectByExample(example);
        return autoForms;
    }
}
