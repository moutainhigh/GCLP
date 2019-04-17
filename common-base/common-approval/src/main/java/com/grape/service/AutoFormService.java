package com.grape.service;

import com.grape.controller.request.AutoFormRequest;
import com.grape.controller.request.FormDataRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Autoform;
import com.grape.model.db.Formdata;

import java.util.List;

public interface AutoFormService {
    public Autoform selectColumnById(String id);

    void insertFormColumn(AutoFormRequest autoFormRequest);

    void insertFormColumnData(FormDataRequest formDataRequest);

    Formdata selectFormDataById(IdRequest req);

	public Autoform selectColumnByFormId(String formid);

    List<Autoform> selectAllFormInfo();
}
