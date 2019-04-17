package com.grape.model.mapper.external;

import com.grape.controller.response.bean.CustruleByOptionBean;
import com.grape.controller.response.bean.SmsparamByOptionBean;
import com.grape.model.db.Custrule;
import com.grape.model.db.Smsparam;

import java.util.List;

public interface CustruleExMapper {
    List<Custrule> queryCustruleByOption(CustruleByOptionBean bean) ;

	Integer queryCustruleByOptionCount(CustruleByOptionBean bean);
}
