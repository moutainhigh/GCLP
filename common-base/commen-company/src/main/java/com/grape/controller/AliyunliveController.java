package com.grape.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grape.controller.bean.MessageDetail;
import com.grape.controller.bean.StatusCode;
import com.grape.controller.reponse.ErrorEntity;
import com.grape.controller.reponse.LiveAddressListResponse;
import com.grape.controller.reponse.LiveAddressResponse;
import com.grape.controller.reponse.LiveinfoResponse;
import com.grape.controller.reponse.MortgagenoGetResponse;
import com.grape.controller.reponse.PlayAddressResponse;
import com.grape.controller.reponse.PushAddressResponse;
import com.grape.controller.reponse.RecordContentInfoListResponse;
import com.grape.controller.reponse.RecordContentInfoResponse;
import com.grape.controller.reponse.Response;
import com.grape.controller.reponse.RestfulResponse;
import com.grape.controller.reponse.bean.AddressInfo;
import com.grape.controller.reponse.bean.LiveAddressInfo;
import com.grape.controller.reponse.bean.RecordIndexInfo;
import com.grape.controller.reponse.bean.RecordIndexInfoResult;
import com.grape.controller.reponse.bean.RecordIndexInfoResultContent;
import com.grape.controller.request.PlayRequest;
import com.grape.controller.request.WorkidRequest;
import com.grape.controller.request.LiveRequest;
import com.grape.controller.request.LiveRequest2;
import com.grape.controller.request.LiveinfoSaveRequest;
import com.grape.controller.request.LiveinfoUpdateRequest;
import com.grape.model.db.Codetable;
import com.grape.model.db.Liveinfo;
import com.grape.model.db.Mortgage;
import com.grape.model.db.Product;
import com.grape.model.db.Productnode;
import com.grape.service.AliyunliveService;
import com.grape.service.HuifawangService;
import com.grape.service.MortgagematchService;
import com.grape.service.ProductnodeService;
import com.grape.tool.AliyunSignUtil;
import com.grape.tool.Util;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;

@RestController
@Validated
@RequestMapping("/live")
@Log4j
public class AliyunliveController {

	@Autowired
	HuifawangService huifawangService;

	@Autowired
	AliyunliveService liveService;

	@Autowired
	MortgagematchService mortgageService;
	
	@Autowired
	ProductnodeService productnodeService;

	@ApiOperation(value = "获取推流地址", httpMethod = "POST", notes = "返回推流地址", response = PushAddressResponse.class)
	@RequestMapping("/push_address")
	public Response push(@Validated @RequestBody LiveRequest req) {
		try {
			String pushAddress = liveService.getPushAddress(req.getWorkid(), req.getNodeid());
			if (!Util.isBlank(pushAddress)) {
				//保存直播信息
				Liveinfo liveinfo = new Liveinfo();
				liveinfo.setId(Util.getID());
				liveinfo.setWorkid(req.getWorkid());
				liveinfo.setMortgageno(req.getMortgageno());
				liveinfo.setNodeid(req.getNodeid());
				Productnode productnode = productnodeService.findByNodeid(req.getNodeid());
				if(productnode!=null){
					liveinfo.setType(productnode.getNodename());
				}

				liveinfo.setChgdt(new Date());
				String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
				liveinfo.setChgtl(workerid);
				liveService.saveLiveinfo(liveinfo);
				
				return new PushAddressResponse(pushAddress,liveinfo.getId());
			}

			return new ErrorEntity(StatusCode.FAIL, MessageDetail.PUSHADDRESS_FAIL);
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.PUSHADDRESS_FAIL);
		}

	}

	@ApiOperation(value = "获取直播地址", httpMethod = "POST", notes = "返回直播地址", response = LiveAddressResponse.class)
	@RequestMapping("/live")
	public Response live(@Validated @RequestBody WorkidRequest req) {
		try {

			// 查询是否正在直播，如果没有直接返回
			List<Liveinfo> liveinfos = liveService.isAlive(req.getWorkid());
			List<LiveAddressInfo> addressInfos = new ArrayList<>();
			if (liveinfos.size() > 0) {

				for (Liveinfo liveinfo : liveinfos) {
					LiveAddressInfo addressInfo = new LiveAddressInfo();
					String mortgageno = liveinfo.getMortgageno();
					if (!Util.isBlank(mortgageno)) {
						String liveAddress = liveService.getLiveAddress(req.getWorkid(), liveinfo.getNodeid());
						Mortgage mortgage = mortgageService.findMortgageById(mortgageno);
						addressInfo.setMortgageno(mortgageno);
						addressInfo.setMortgagename(mortgage.getMartgagename());
						addressInfo.setLiveaddress(liveAddress);
						addressInfos.add(addressInfo);
					}

				}
				return new LiveAddressResponse(addressInfos);
			} else {
				return new ErrorEntity(StatusCode.FAIL, MessageDetail.LIVE_NO);
			}

		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.LIVEADDRESS_FAIL);
		}

	}

	@ApiOperation(value = "获取直播地址", httpMethod = "POST", notes = "返回直播地址", response = LiveAddressResponse.class)
	@RequestMapping("/live_address")
	public Response live_address(@Validated @RequestBody WorkidRequest req) {
		try {

			// 查询是否正在直播，如果没有直接返回
			List<Liveinfo> liveinfos = liveService.isAlive(req.getWorkid());
			List<LiveAddressInfo> addressInfos = new ArrayList<>();
			if (liveinfos.size() > 0) {

				for (Liveinfo liveinfo : liveinfos) {
					LiveAddressInfo addressInfo = new LiveAddressInfo();
					String mortgageno = liveinfo.getMortgageno();
					
					if (!Util.isBlank(mortgageno)) {
						String liveAddress = liveService.getLiveAddress(req.getWorkid(), liveinfo.getNodeid());
						Mortgage mortgage = mortgageService.findMortgageById(mortgageno);
						addressInfo.setMortgageno(mortgageno);
						addressInfo.setMortgagename(mortgage.getMartgagename());
						addressInfo.setLiveaddress(liveAddress);
						addressInfos.add(addressInfo);
					}

				}
				return new LiveAddressResponse(addressInfos);
			} else {
				return new ErrorEntity(StatusCode.NULL_CONTENT, MessageDetail.LIVE_NO);
			}

		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.LIVEADDRESS_FAIL);
		}

	}

	@ApiOperation(value = "获取录制视频播放地址", httpMethod = "POST", notes = "返回播放地址", response = PlayAddressResponse.class)
	@RequestMapping("/play_address")
	public Response play_address(@Validated @RequestBody PlayRequest req) {
		try {

			String playurl = liveService.getPlayAddress(req.getUrl());
			if (!Util.isBlank(playurl)) {
				return new PlayAddressResponse(playurl);
			}
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.PLAYADDRESS_FAIL);
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.PLAYADDRESS_FAIL);
		}

	}

	@ApiOperation(value = "获取直播地址列表", httpMethod = "POST", notes = "返回直播地址", response = LiveAddressListResponse.class)
	@RequestMapping("/live_address_list")
	public Response live_address_list() {
		try {

			// 查询所有正在直播的流水
			List<Liveinfo> liveinfos = liveService.findLiveinfoAlive();
			List<AddressInfo> addressList = new ArrayList<>();
			if (liveinfos.size() > 0) {
				for (Liveinfo liveinfo : liveinfos) {
					String address = liveService.getLiveAddress(liveinfo.getWorkid(), liveinfo.getNodeid());
					AddressInfo liveAddress = new AddressInfo();
					liveAddress.setAddress(address);
					liveAddress.setWorkid(liveinfo.getWorkid());
					liveAddress.setMortgageno(liveinfo.getMortgageno());
					addressList.add(liveAddress);
				}

				return new LiveAddressListResponse(addressList);
			} else {
				return new ErrorEntity(StatusCode.NULL_CONTENT, MessageDetail.LIVE_NO);
			}

		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.LIVEADDRESS_FAIL);
		}

	}

	@ApiOperation(value = "保存直播信息", httpMethod = "POST", notes = "返回操作状态", response = LiveinfoResponse.class)
	@RequestMapping("/liveinfo_save")
	public Response liveinfo_save(@Validated @RequestBody LiveinfoUpdateRequest req) {
		try {
			Liveinfo liveinfo = liveService.findLiveinfoById(req.getId());
			if (liveinfo != null) {
				Date date = new Date();
				date.setTime(Long.parseLong(req.getLivestarttime()));
				liveinfo.setLiveperson(req.getLiveperson());
				liveinfo.setLivestarttime(date);
				liveinfo.setChgdt(new Date());
				String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
				liveinfo.setChgtl(workerid);
				liveinfo.setIslive("Y");
				liveService.updateLiveinfo(liveinfo);
				return new ErrorEntity(StatusCode.OK, MessageDetail.OPRATION_SUCCESS);
			} else {

				log.info("直播信息为空");
			}
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.OPRATION_FAIL);
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.OPRATION_FAIL);
		}

	}

	@ApiOperation(value = "更新直播信息", httpMethod = "POST", notes = "返回操作状态", response = RestfulResponse.class)
	@RequestMapping("/liveinfo_update")

	public Response liveinfo_update(@Validated @RequestBody LiveinfoUpdateRequest req) {
		try {
			log.info(req.getId() + "|" + req.getLiveendtime() + "|" + req.getLiveperson());
			Liveinfo liveinfo = liveService.findLiveinfoById(req.getId());
			if (liveinfo != null) {
				Date date = new Date();
				date.setTime(Long.parseLong(req.getLiveendtime()));
				liveinfo.setLiveendtime(date);
				liveinfo.setChgdt(new Date());
				String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
				liveinfo.setChgtl(workerid);
				liveinfo.setIslive("N");
				liveService.updateLiveinfo(liveinfo);
				return new ErrorEntity(StatusCode.OK, MessageDetail.OPRATION_SUCCESS);
			} else {

				log.info("直播信息为空");
			}
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.OPRATION_FAIL);
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.OPRATION_FAIL);
		}

	}

	@ApiOperation(value = "查询直播录制内容(抵押物)", httpMethod = "POST", notes = "返回抵押物下的直播录制内容", response = RecordContentInfoResponse.class)
	@RequestMapping("/record_content_info_list_1")
	public Response record_content_info_list_1(@Validated @RequestBody LiveRequest2 req) {
		try {

			// 查询直播开始和结束时间
			Date liveStartTime;
			Date liveEndTime;
			//可能节点名称会有改变
			Liveinfo liveinfo = liveService.findByWorkidAndType(req.getWorkid(), "下户尽调");
			if(liveinfo!=null){
				liveStartTime = liveService.findLiveStartTime(req.getWorkid(), req.getMortgageno(),liveinfo.getType());
				liveEndTime = liveService.findLiveEndTime(req.getWorkid(), req.getMortgageno(),liveinfo.getType());
			}else{
				
				//兼容以前的
				liveStartTime = liveService.findLiveStartTime1(req.getWorkid(), req.getMortgageno());
				liveEndTime = liveService.findLiveEndTime1(req.getWorkid(), req.getMortgageno());
			}
			

			if (liveStartTime == null || liveEndTime == null) {
				return new ErrorEntity(StatusCode.NULL_CONTENT, "无录制内容记录");
			}
			Calendar calendar1 = Calendar.getInstance();
			calendar1.setTime(liveStartTime);
			int startDay = calendar1.get(Calendar.DAY_OF_YEAR);
			
			Calendar calendar2 = Calendar.getInstance();
			calendar2.setTime(liveEndTime);
			calendar2.add(Calendar.DAY_OF_MONTH, 1);
			int endDay= calendar2.get(Calendar.DAY_OF_YEAR);

			// 由于阿里云只能查询4天之内的记录，所以以4天为周期查询
			int intervalTime = endDay- startDay; // 录制天数
			// 查询次数
			int intervalNo = intervalTime / 4;
			if (intervalTime % 4 > 0) {
				intervalNo++;
			}
			int startDate = Integer.parseInt(Util.getDate(liveStartTime));
			List<RecordIndexInfoResult> list = new ArrayList<>();
			for (int i = 0; i < intervalNo; i++) {
				// 计算UTC时间
				String startTime = AliyunSignUtil.getUTCTimeStr(AliyunSignUtil.strToDate(String.valueOf(startDate)));
				String endTime = AliyunSignUtil.getUTCTimeStr(AliyunSignUtil.strToDate(String.valueOf(startDate + 4)));
				RecordIndexInfoResult result = liveService.getRecordContentInfoList2(req.getWorkid(),
						liveinfo.getNodeid(), startTime, endTime);
				if (result != null) {
					
					//临时删除
					try {
						if("0000000031".equals(req.getWorkid())){
							List<RecordIndexInfo> recordIndexInfos = result.getRecordIndexInfoList().getRecordIndexInfo();
							RecordIndexInfo cache = null;
							for (RecordIndexInfo recordIndexInfo : recordIndexInfos) {
								if("6ff02d89-df21-4531-97ed-32428cec198c".equals(recordIndexInfo.getRecordId())){
									cache = recordIndexInfo;
								}
								
							}
							if(cache!=null){
								recordIndexInfos.remove(cache);
								int totalnum = result.getTotalNum()-1;
								result.setTotalNum(totalnum);
							}
						}
					} catch (Exception e) {
						
					}
					
					
					list.add(result);
				}

			}
			return new RecordContentInfoResponse(list);
		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.RECORDCONTENTINFOLIST_FAIL);
		}

	}

	@ApiOperation(value = "查询直播录制内容(流水)", httpMethod = "POST", notes = "返回流水下的直播录制内容", response = RecordContentInfoListResponse.class)
	@RequestMapping("/record_content_info_list")
	public Response record_content_info_list(@Validated @RequestBody WorkidRequest req) {
		try {
			
			//正在上传的视频数量
			int uploadno = 0;
			
			List<RecordIndexInfoResultContent> list = new ArrayList<>();
			//查询出所有的直播类型
			List<String> livetypes = liveService.findTypeByWorkid(req.getWorkid());
			/*String type = null;
			if(!livetypes.isEmpty()){
				type = livetypes.get(0);
			}*/
			if(!livetypes.isEmpty()){
				
				for (String livetype : livetypes) {
					RecordIndexInfoResultContent content = new RecordIndexInfoResultContent();
					
					Liveinfo liveinfo = liveService.findByWorkidAndType(req.getWorkid(), livetype);
					
					
					
					Date liveStartTime = liveService.findLiveStartTime3(req.getWorkid(), livetype);
					Date liveEndTime = liveService.findLiveEndTime3(req.getWorkid(), livetype);

					if (liveStartTime == null || liveEndTime == null) {
						return new ErrorEntity(StatusCode.NULL_CONTENT, "无录制内容记录");
					}
					Calendar calendar1 = Calendar.getInstance();
					calendar1.setTime(liveStartTime);
					int startDay = calendar1.get(Calendar.DAY_OF_YEAR);
					
					Calendar calendar2 = Calendar.getInstance();
					calendar2.setTime(liveEndTime);
					calendar2.add(Calendar.DAY_OF_MONTH, 1);
					int endDay= calendar2.get(Calendar.DAY_OF_YEAR);

					// 由于阿里云只能查询4天之内的记录，所以以4天为周期查询
					int intervalTime = endDay- startDay; // 录制天数
					// 查询次数
					int intervalNo = intervalTime / 4;
					if (intervalTime % 4 > 0) {
						intervalNo++;
					}
					int startDate = Integer.parseInt(Util.getDate(liveStartTime));
					List<RecordIndexInfoResult> recordIndexInfoResultList = new ArrayList<>();
					
					for (int i = 0; i < intervalNo; i++) {
						// 计算UTC时间
						String startTime = AliyunSignUtil
								.getUTCTimeStr(AliyunSignUtil.strToDate(String.valueOf(startDate)));
						String endTime = AliyunSignUtil
								.getUTCTimeStr(AliyunSignUtil.strToDate(String.valueOf(startDate + 4)));
						RecordIndexInfoResult result = liveService.getRecordContentInfoList2(req.getWorkid(),
								liveinfo.getNodeid(), startTime, endTime);
						
						if(result!=null){
							recordIndexInfoResultList.add(result);
						}
					}
					content.setLivetype(livetype);
					content.setRecordIndexInfoResultList(recordIndexInfoResultList);
					
					//计算正在上传的视频数量
					List<Liveinfo> liveinfos = liveService.findListByWorkidAndType(req.getWorkid(), livetype);
					
					if(!liveinfos.isEmpty()){
						uploadno = liveinfos.size();
						//取出查询回来的视频结束时间
						List<Long> endtimes = new ArrayList<>();
						for (RecordIndexInfoResult recordIndexInfoResult : recordIndexInfoResultList) {
							List<RecordIndexInfo> recordIndexInfos = recordIndexInfoResult.getRecordIndexInfoList().getRecordIndexInfo();
							for (RecordIndexInfo recordIndexInfo : recordIndexInfos) {
								long endtime = AliyunSignUtil.UTCtoDate(recordIndexInfo.getEndTime()).getTime();
								endtimes.add(endtime);
							}
						}
						//取出查询回来的视频结束时间最大值
						if(!endtimes.isEmpty()){
							long endMaxTime = Util.getMaxLong(endtimes);
							
							//遍历直播记录，大于录制视频最大开始时间即是未上传完成的视频
							int uploadcacheno = 0;
							for (Liveinfo liveinfo2 : liveinfos) {
								Date enddate = liveinfo2.getLiveendtime();
								if(Util.isBlank(enddate.toString())){
									continue;
								}
								long liveendtime = enddate.getTime();
								if(endMaxTime<liveendtime){
									uploadcacheno++;
								}
							}
							uploadno = uploadcacheno;
						}												
					}
					content.setUploadno(uploadno);
					list.add(content);
					
					
				}
				return new RecordContentInfoListResponse(list);
			}else{
				
				//兼容之前没有分直播类型的
				Set<String> mortgagenos = liveService.findLiveinfoListByWorkid(req.getWorkid());
				if (mortgagenos.size() > 0) {
					
					for (String mortgageno : mortgagenos) {
						RecordIndexInfoResultContent content = new RecordIndexInfoResultContent();
						Mortgage mortgage = mortgageService.findMortgageById(mortgageno);
						// 查询直播开始和结束时间

						Date liveStartTime = liveService.findLiveStartTime1(req.getWorkid(), mortgageno);
						Date liveEndTime = liveService.findLiveEndTime1(req.getWorkid(), mortgageno);

						if (liveStartTime == null || liveEndTime == null) {
							return new ErrorEntity(StatusCode.NULL_CONTENT, "无录制内容记录");
						}
						Calendar calendar1 = Calendar.getInstance();
						calendar1.setTime(liveStartTime);
						int startDay = calendar1.get(Calendar.DAY_OF_YEAR);
						
						Calendar calendar2 = Calendar.getInstance();
						calendar2.setTime(liveEndTime);
						calendar2.add(Calendar.DAY_OF_MONTH, 1);
						int endDay= calendar2.get(Calendar.DAY_OF_YEAR);

						// 由于阿里云只能查询4天之内的记录，所以以4天为周期查询
						int intervalTime = endDay- startDay; // 录制天数
						// 查询次数
						int intervalNo = intervalTime / 4;
						if (intervalTime % 4 > 0) {
							intervalNo++;
						}
						int startDate = Integer.parseInt(Util.getDate(liveStartTime));
						List<RecordIndexInfoResult> recordIndexInfoResultList = new ArrayList<>();
						
						for (int i = 0; i < intervalNo; i++) {
							// 计算UTC时间
							String startTime = AliyunSignUtil
									.getUTCTimeStr(AliyunSignUtil.strToDate(String.valueOf(startDate)));
							String endTime = AliyunSignUtil
									.getUTCTimeStr(AliyunSignUtil.strToDate(String.valueOf(startDate + 4)));
							RecordIndexInfoResult result = liveService.getRecordContentInfoList2(req.getWorkid(),
									mortgageno, startTime, endTime);
							if (result != null) {
								
								//临时删除
								try {
									if("0000000031".equals(req.getWorkid())){
										List<RecordIndexInfo> recordIndexInfos = result.getRecordIndexInfoList().getRecordIndexInfo();
										RecordIndexInfo cache = null;
										for (RecordIndexInfo recordIndexInfo : recordIndexInfos) {
											if("6ff02d89-df21-4531-97ed-32428cec198c".equals(recordIndexInfo.getRecordId())){
												cache = recordIndexInfo;
											}
											
										}
										if(cache!=null){
											recordIndexInfos.remove(cache);
											int totalnum = result.getTotalNum()-1;
											result.setTotalNum(totalnum);
										}
									}
								} catch (Exception e) {
									
								}
								
								
								recordIndexInfoResultList.add(result);
							}

						}
						// RecordIndexInfoResult result =
						// liveService.getRecordContentInfoList(req.getWorkid(),
						// mortgageno);
						content.setMortgagename(mortgage.getMartgagename());
						content.setMortgageno(mortgageno);
						content.setRecordIndexInfoResultList(recordIndexInfoResultList);

						list.add(content);
					}

					return new RecordContentInfoListResponse(list);
				} else {
					return new ErrorEntity(StatusCode.NULL_CONTENT, "录制内容记录为空！");
				}
			}
			
			

		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, MessageDetail.RECORDCONTENTINFOLIST_FAIL);
		}
	

	}

	@ApiOperation(value = "获取抵押物id", httpMethod = "POST", notes = "返回抵押物编号", response = MortgagenoGetResponse.class)
	@RequestMapping("/mortgageno_get")
	public Response mortgageno_get(@Validated @RequestBody WorkidRequest req) {
		try {
			Mortgage mortgage = mortgageService.findFirstMortgageByWorkid(req.getWorkid());
			if (mortgage != null) {
				return new MortgagenoGetResponse(mortgage.getId());
			} else {
				return new ErrorEntity(StatusCode.NULL_CONTENT, "抵押物信息为空");
			}

		} catch (Exception e) {
			return new ErrorEntity(StatusCode.FAIL, "抵押物编号查询失败");
		}

	}
}
