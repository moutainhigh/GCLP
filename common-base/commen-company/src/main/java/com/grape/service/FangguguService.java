package com.grape.service;

import java.util.List;

import com.grape.controller.reponse.bean.FGGQueryPriceBean;
import com.grape.model.db.Exchannel;
import com.grape.model.db.Mortgagematch;

public interface FangguguService {
		List<Mortgagematch> getFGGMortgage(Exchannel exchannel,String workid,String citycode,String mortgageno,String mortgagename);

		FGGQueryPriceBean getFGGQueryPricAgain(Exchannel exchannel,String workid,String citycode,String mortgageno,String houseType,Float buildingArea,String communityid);
}
