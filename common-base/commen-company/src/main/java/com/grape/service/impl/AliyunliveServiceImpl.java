package com.grape.service.impl;


import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;

import com.alibaba.fastjson.TypeReference;
import com.aliyun.oss.OSSClient;
import com.grape.controller.bean.MessageDetail;
import com.grape.controller.reponse.bean.RecordIndexInfoResult;
import com.grape.model.db.Exchannel;
import com.grape.model.db.Exinterface;
import com.grape.model.db.Liveinfo;
import com.grape.model.db.LiveinfoExample;
import com.grape.model.mapper.base.ExchannelMapper;
import com.grape.model.mapper.base.LiveinfoMapper;
import com.grape.model.mapper.external.LiveinfoExMapper;
import com.grape.service.AliyunliveService;
import com.grape.service.ExinterfaceService;
import com.grape.tool.AliyunSignUtil;
import com.grape.tool.Util;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AliyunliveServiceImpl implements AliyunliveService {
	
	@Autowired
	LiveinfoMapper liveinfoMapper;
	
	@Autowired
	ExchannelMapper exchannelMapper;
	
	@Autowired
	LiveinfoExMapper liveinfoExMapper;
	
	@Autowired
	ExinterfaceService interfaceService;
	
	@Autowired
	RestTemplate template;
	

	
	
	
	@Override
	public String getPushAddress(String workid,String nodeid) throws Exception{
		try {
			//查询阿里云直播配置信息
			Exchannel exchannel = exchannelMapper.selectByPrimaryKey(MessageDetail.LIVE_ID);
			if(exchannel==null){
				throw new Exception("阿里云直播配置信息为空！");
			}
		//	String videocenter = exchannel.getVideocenter();
			String appname = exchannel.getAppname();
			
			String domain = exchannel.getPushdomain();
			//组装推流uri
			//中心推流
		//	String pushCenterURI = "rtmp://"+videocenter+"/"+appname+"/"+workid+"?vhost="+domain;
			
			//边缘推流
			String pushEdgeURI= "rtmp://"+domain+"/"+appname+"/"+getStreamName(workid, nodeid);
			
			//构建签名字符串
			//获取时间戳
			long currentTime = System.currentTimeMillis()/1000;
			//有效时间半小时
			long validTime = currentTime+30*60;
			String authString = "/"+appname+"/"+getStreamName(workid, nodeid);
			//签名字符串
			
			String signString = authString+"-"+validTime+"-"+0+"-"+0+"-"+ exchannel.getPushkey();
			//算出签名
			String sign = DigestUtils.md5Hex(signString);
			
			//生成最终URL
			String pushEdgeURL= pushEdgeURI+"?auth_key="+validTime+"-0-0-"+sign;
			
			return pushEdgeURL;
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public String getLiveAddress(String workid,String nodeid) throws Exception{
		try {
			//查询阿里云直播配置信息
			Exchannel exchannel = exchannelMapper.selectByPrimaryKey(MessageDetail.LIVE_ID);
			if(exchannel==null){
				throw new Exception("阿里云直播配置信息为空！");
			}
			//String videocenter = exchannel.getVideocenter();
			String appname = exchannel.getAppname();
			String authkey = exchannel.getLivekey();
			String domain = exchannel.getLivedomain();
			//组装直播uri
			
			//flv
			String liveFlvURI= "http://"+domain+"/"+appname+"/"+getStreamName(workid, nodeid)+".flv";
			
			//构建签名字符串
			//获取时间戳
			long currentTime = System.currentTimeMillis()/1000;
			//有效时间半小时
			long validTime = currentTime+30*60;
			String authString = "/"+appname+"/"+getStreamName(workid, nodeid);
			//签名字符串
			
			String signString = authString+".flv"+"-"+validTime+"-"+0+"-"+0+"-"+ authkey;
			//算出签名
			String sign = DigestUtils.md5Hex(signString);
			
			//生成最终URL
			String liveFlvURL= liveFlvURI+"?auth_key="+validTime+"-0-0-"+sign;
			
			return liveFlvURL;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void saveLiveinfo(Liveinfo liveinfo) {
		liveinfoMapper.insert(liveinfo);
		
	}

	@Override
	public void updateLiveinfo(Liveinfo liveinfo) {
		
		liveinfoMapper.updateByPrimaryKey(liveinfo);
	}

	@Override
	public Liveinfo findLiveinfoById(String id) {
		
		return liveinfoMapper.selectByPrimaryKey(id);
	}
	
	/*@Override
	public RecordIndexInfoResult getRecordContentInfoList(String workid,String mortgageno) throws Exception{
		
		try {
			//查询阿里云直播配置信息
			Exchannel exchannel = exchannelMapper.selectByPrimaryKey(MessageDetail.LIVE_ID);
			if(exchannel==null){
				throw new Exception("阿里云直播配置信息为空！");
			}
			String accessKeyId = exchannel.getAccesskeyid();
			String accessKeySecret = exchannel.getAccesskeysecret();
			//发送参数
			Map<String, String> paramMap = new HashMap<>();
			paramMap.put("Action", "DescribeLiveStreamRecordIndexFiles");//阿里云查询录制内容系统规定参数
			paramMap.put("AppName", exchannel.getAppname()); //直播流所属应用名称
			paramMap.put("DomainName", exchannel.getLivedomain());//加速域名
			paramMap.put("StreamName",getStreamName(workid, mortgageno));//直播流名称
			
			//查询直播开始和结束时间
			String startTime = null;
			String endTime = null;
			Date liveStartTime = findLiveStartTime(workid,mortgageno);
			if(liveStartTime!=null){
				//计算UTC时间
				startTime = AliyunSignUtil.getUTCTimeStr(liveStartTime);
				
			}
			Date liveEndTime = findLiveEndTime(workid,mortgageno);
			if(liveEndTime!=null){
				endTime = AliyunSignUtil.getUTCTimeStr(liveEndTime);
				
			}
			paramMap.put("StartTime", startTime);
			paramMap.put("EndTime", endTime);
			
			//计算签名
			String signature = AliyunSignUtil.getSignature(paramMap, accessKeyId, accessKeySecret);
			paramMap.put("Signature", signature);
			//组装url参数
			String[] sortedKeys = (String[]) paramMap.keySet().toArray(new String[]{});
			StringBuilder paramString = new StringBuilder();
			
			for (String key : sortedKeys) {
				paramString.append("&").append(key).append("=").append(paramMap.get(key));
			}
			//查询接口url
			Exinterface exinterface = interfaceService.findExinterface1(MessageDetail.LIVE_ID);
			if(exinterface==null){
				throw new Exception("接口配置信息为空！");
			}
			StringBuilder finalUrl = new StringBuilder();
			//最终URL
			finalUrl.append(exinterface.getUrl()).append("?").append(paramString.toString().substring(1));
			log.info("URL:"+finalUrl);
			
			//由于阿里云直播只能用HTTPS，用封装的httpclient发送请求

			CloseableHttpClient httpClient = AliyunSignUtil.getDefaultHttpClient();
			
			HttpGet httpGet =new HttpGet(finalUrl.toString());
			CloseableHttpResponse result =  httpClient.execute(httpGet);
			String resultData = EntityUtils.toString(result.getEntity());
			log.info("resultdata:"+resultData);
			RecordIndexInfoResult recordIndexInfoResult = JSON.parseObject(resultData, new TypeReference<RecordIndexInfoResult>(){});
			RecordIndexInfoResult infoResult = JSONObject.parseObject(resultData,RecordIndexInfoResult.class);
			JSONObject  contentReuslt = JSONObject.parseObject(resultData);
			JSONObject recordIndexInfoList = contentReuslt.getJSONObject("RecordIndexInfoList");
			String contentInfoss = recordIndexInfoList.getString("RecordIndexInfo");
			List<RecordIndexInfo> list = JSONArray.parseArray(contentInfoss, RecordIndexInfo.class);
			
			log.info(recordIndexInfoResult);
			if(recordIndexInfoResult.getRecordIndexInfoList().getRecordIndexInfo().isEmpty()){
				//如果录制内容列表信息为空，直接返回空
				return null;
			}

			return  recordIndexInfoResult;
		} catch (Exception e) {
			throw e;
		}
		
	}*/
	@Override
	public RecordIndexInfoResult getRecordContentInfoList2(String workid,String nodeid,String startTime,String endTime) throws Exception{
		
		try {
			//查询阿里云直播配置信息
			Exchannel exchannel = exchannelMapper.selectByPrimaryKey(MessageDetail.LIVE_ID);
			if(exchannel==null){
				throw new Exception("阿里云直播配置信息为空！");
			}
			String accessKeyId = exchannel.getAccesskeyid();
			String accessKeySecret = exchannel.getAccesskeysecret();
			//发送参数
			Map<String, String> paramMap = new HashMap<>();
			paramMap.put("Action", "DescribeLiveStreamRecordIndexFiles");//阿里云查询录制内容系统规定参数
			paramMap.put("AppName", exchannel.getAppname()); //直播流所属应用名称
			paramMap.put("DomainName", exchannel.getLivedomain());//加速域名
			paramMap.put("StreamName",getStreamName(workid, nodeid));//直播流名称
			paramMap.put("StartTime", startTime);
			paramMap.put("EndTime", endTime);
			
			//计算签名
			String signature = AliyunSignUtil.getSignature(paramMap, accessKeyId, accessKeySecret);
			paramMap.put("Signature", signature);
			//组装url参数
			String[] sortedKeys = (String[]) paramMap.keySet().toArray(new String[]{});
			StringBuilder paramString = new StringBuilder();
			
			for (String key : sortedKeys) {
				paramString.append("&").append(key).append("=").append(paramMap.get(key));
			}
			//查询接口url
			Exinterface exinterface = interfaceService.findExinterface1(MessageDetail.LIVE_ID);
			if(exinterface==null){
				throw new Exception("接口配置信息为空！");
			}
			StringBuilder finalUrl = new StringBuilder();
			//最终URL
			finalUrl.append(exinterface.getUrl()).append("?").append(paramString.toString().substring(1));
			log.info("URL:"+finalUrl);
			
			//由于阿里云直播只能用HTTPS，用封装的httpclient发送请求

			CloseableHttpClient httpClient = AliyunSignUtil.getDefaultHttpClient();
			
			HttpGet httpGet =new HttpGet(finalUrl.toString());
			CloseableHttpResponse result =  httpClient.execute(httpGet);
			String resultData = EntityUtils.toString(result.getEntity());
			log.info("resultdata:"+resultData);
			RecordIndexInfoResult recordIndexInfoResult = JSON.parseObject(resultData, new TypeReference<RecordIndexInfoResult>(){});
			/*RecordIndexInfoResult infoResult = JSONObject.parseObject(resultData,RecordIndexInfoResult.class);
			JSONObject  contentReuslt = JSONObject.parseObject(resultData);
			JSONObject recordIndexInfoList = contentReuslt.getJSONObject("RecordIndexInfoList");
			String contentInfoss = recordIndexInfoList.getString("RecordIndexInfo");
			List<RecordIndexInfo> list = JSONArray.parseArray(contentInfoss, RecordIndexInfo.class);*/
			
			log.info(recordIndexInfoResult);
			if(recordIndexInfoResult.getRecordIndexInfoList().getRecordIndexInfo().isEmpty()){
				//如果录制内容列表信息为空，直接返回空
				return null;
			}

			return  recordIndexInfoResult;
		} catch (Exception e) {
			throw e;
		}
		
	}
	@Override
	public Date findLiveStartTime(String workid,String mortgageno,String type){
		Map<String, String> map = new HashMap<>();
		map.put("workid", workid);
		map.put("mortgageno", mortgageno);
		map.put("type", type);
		List<Liveinfo> liveinfos = liveinfoExMapper.findLiveinfoListOrderByStarttimeAsc(map);
		if(liveinfos.size()>0){
			return  liveinfos.get(0).getLivestarttime();
			
		}
		return null;
	}
	@Override
	public Date findLiveStartTime1(String workid,String mortgageno) {
		return findLiveStartTime(workid, mortgageno, null);
	}
	@Override
	public Date findLiveStartTime2(String workid) {
		
		return findLiveStartTime(workid, null, null);
	}
	
	@Override
	public Date findLiveStartTime3(String workid, String type) {
		return findLiveStartTime(workid, null, type);
	}
	
	@Override
	public Date findLiveEndTime(String workid,String mortgageno,String type) {
		Map<String, String> map = new HashMap<>();
		map.put("workid", workid);
		map.put("mortgageno", mortgageno);
		map.put("type", type);
		List<Liveinfo> liveinfos = liveinfoExMapper.findLiveinfoListOrderByEndtimeDesc(map);
		if(liveinfos.size()>0){
			return  liveinfos.get(0).getLiveendtime();
		}
		return null;
	}
	@Override
	public Date findLiveEndTime1(String workid,String mortgageno) {
		return findLiveEndTime(workid, mortgageno, null);
	}
	@Override
	public Date findLiveEndTime2(String workid) {
		return findLiveEndTime(workid, null, null);
	}
	
	

	@Override
	public Date findLiveEndTime3(String workid, String type) {
		return findLiveEndTime(workid, null, type);
	}
	
	
	
	@Override
	public List<Liveinfo> isAlive(String workid) {
		
		LiveinfoExample example = new LiveinfoExample();
		example.createCriteria().andWorkidEqualTo(workid).andIsliveEqualTo("Y");
		
		List<Liveinfo> liveinfos = liveinfoMapper.selectByExample(example);
		return liveinfos;
	}

	@Override
	public List<Liveinfo> findLiveinfoAlive() {
		LiveinfoExample example = new LiveinfoExample();
		example.createCriteria().andIsliveEqualTo("Y");
		List<Liveinfo> liveinfos = liveinfoMapper.selectByExample(example);
		
		return liveinfos;
	}

	@Override
	public String getPlayAddress(String record_url) throws Exception{
		try {
			//查询阿里云直播配置信息
			Exchannel exchannel = exchannelMapper.selectByPrimaryKey(MessageDetail.LIVE_ID);
			if(exchannel==null){
				throw new Exception("阿里云直播配置信息为空！");
			}
		//构建签名字符串
		
		
		String excuteString1 = record_url.substring(record_url.indexOf("/")+2);
		System.out.println(excuteString1);
		String bucketName = excuteString1.substring(0, excuteString1.indexOf("."));
		System.out.println(bucketName);
		String  excuteString2= excuteString1.substring(excuteString1.indexOf(".")+1);
		System.out.println(excuteString2);
		String endpoint = excuteString2.substring(0, excuteString2.indexOf("/"));
		System.out.println(endpoint);
		String objectName = excuteString2.substring(excuteString2.indexOf("/")+1);
		
		String accessKeyId  = exchannel.getAccesskeyid();
		String accessKeySecret = exchannel.getAccesskeysecret();
		
		//创建OSS实例
		OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
		
		
		//有效时间半小时
		Date validTime = new Date(new Date().getTime()+1800*1000);
		
		
		//生成最终URL
		URL url= ossClient.generatePresignedUrl(bucketName, objectName, validTime);
		ossClient.shutdown();
		
		return url.toString();
	} catch (Exception e) {
		log.error(e);
		throw e;
	}
		

	}
	
	private String getStreamName(String workid,String mortgageno){
		return workid+"_"+mortgageno;
	}

	@Override
	public Set<String> findLiveinfoListByWorkid(String workid) {
		LiveinfoExample example = new LiveinfoExample();
		example.createCriteria().andWorkidEqualTo(workid);
		List<Liveinfo> liveinfos = liveinfoMapper.selectByExample(example);
		Set<String> mortgagenos = new HashSet<>();
		if(liveinfos.size()>0){
			for (Liveinfo liveinfo : liveinfos) {
				if(!Util.isBlank(liveinfo.getMortgageno())){
					mortgagenos.add(liveinfo.getMortgageno());
				}
				
			}
		}
		return mortgagenos;
	}

	@Override
	public String getLiveAddress() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findTypeByWorkid(String workid) {
		Map<String, String> map = new HashMap<>();
		map.put("workid", workid);
		return liveinfoExMapper.findByWorkid(map);
	}

	@Override
	public Liveinfo findByWorkidAndType(String workid, String type) {
		LiveinfoExample example = new LiveinfoExample();
		example.createCriteria().andWorkidEqualTo(workid).andTypeEqualTo(type);
		List<Liveinfo> liveinfos = liveinfoMapper.selectByExample(example);
		if(!liveinfos.isEmpty()){
			return liveinfos.get(0);
		}
		return null;
	}

	@Override
	public List<Liveinfo> findListByWorkidAndType(String workid, String type) {
		LiveinfoExample example = new LiveinfoExample();
		example.createCriteria().andWorkidEqualTo(workid).andTypeEqualTo(type);
		List<Liveinfo> liveinfos = liveinfoMapper.selectByExample(example);
		
		return liveinfos;
		
	}

	

	
	
	/*private String getAuthString(String time) {
        if (!time.isEmpty() && !mPrivacyKey.isEmpty()) {
            long tempTime = (System.currentTimeMillis() + Integer.valueOf(time))/1000;
            String tempprivacyKey = String.format(mMd5String, getUri(mPushUrl), tempTime, 0, 0, mPrivacyKey);
            String auth = String.format(mAuthString, tempTime, 0, 0, getMD5(tempprivacyKey));
            mTempUrl = mPushUrl + auth;
        } else {
            mTempUrl = mPushUrl;
        }
        return mPushUrl;
//        return mTempUrl;
    }*/
		
}
