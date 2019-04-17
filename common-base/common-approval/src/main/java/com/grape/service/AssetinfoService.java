package com.grape.service;



import java.util.List;

import com.grape.controller.request.AssetinfoRequest;
import com.grape.controller.request.IdRequest;
import com.grape.controller.request.WorkidAndCerdidRequest;
import com.grape.model.db.Assetinfo;

public interface AssetinfoService{

	public List<Assetinfo> queryAssetByWorkid(WorkidAndCerdidRequest req);

	void insertAssetinfo(AssetinfoRequest req);

	void updateAssetinfo(AssetinfoRequest req);

	public void deleteAssetinfo(IdRequest req);
	
	public List<Assetinfo> queryAssetinfoByWorkid(String workid) ;

	public String selectAssessNotation(String workid);
	
	void insertAsset(Assetinfo info) ;
	public String selectAssessNotation2(String workid);

}
