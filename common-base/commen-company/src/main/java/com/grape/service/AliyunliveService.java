package com.grape.service;




import java.util.Date;
import java.util.List;
import java.util.Set;

import com.grape.controller.reponse.bean.RecordIndexInfoResult;
import com.grape.model.db.Liveinfo;

public interface AliyunliveService {
		
		String getPushAddress(String workid,String nodeid) throws Exception;
		
		String getLiveAddress(String workid,String mortgageno) throws Exception;
		
		String getLiveAddress() throws Exception;
		
		String getPlayAddress(String record_url) throws Exception;
		
		void saveLiveinfo(Liveinfo liveinfo);
		
		void updateLiveinfo(Liveinfo liveinfo);
		
		Liveinfo findLiveinfoById(String id);
		Date findLiveStartTime(String workid,String mortgageno,String type);
		Date findLiveStartTime1(String workid,String mortgageno);
		Date findLiveStartTime2(String workid);
		Date findLiveStartTime3(String workid,String type);
		Date findLiveEndTime(String workid,String mortgageno,String type);
		Date findLiveEndTime1(String workid,String mortgageno);
		Date findLiveEndTime2(String workid);
		Date findLiveEndTime3(String workid,String type);
	//	RecordIndexInfoResult getRecordContentInfoList(String workid,String mortgageno) throws Exception;
		
		RecordIndexInfoResult getRecordContentInfoList2(String workid,String mortgageno,String startTime,String endTime) throws Exception;
		
		List<Liveinfo> isAlive(String workid);
		
		List<Liveinfo> findLiveinfoAlive();
		
		List<String> findTypeByWorkid(String workid);
		
		Liveinfo findByWorkidAndType(String workid,String type);
		
		List<Liveinfo> findListByWorkidAndType(String workid,String type);
		
		Set<String> findLiveinfoListByWorkid(String workid);
		
		
		
		
		
		
}
