package com.grape.context;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.context.SecurityContextHolder;


import com.grape.controller.bean.MessageDetail;

import com.grape.controller.reponse.bean.FGGQueryPriceBean;
import com.grape.controller.reponse.bean.MortgageAssessinfo;
import com.grape.controller.reponse.bean.ChannelAssessinfo;
import com.grape.controller.reponse.bean.SLQueryPriceResponseBean;
import com.grape.model.db.Assessmodel;
import com.grape.model.db.Buildingproperty;
import com.grape.model.db.Callhist;
import com.grape.model.db.Doctask;
import com.grape.model.db.Exchannel;
import com.grape.model.db.Exqueryhist;
import com.grape.model.db.Houseassess;
import com.grape.model.db.Image;
import com.grape.model.db.Mortgagematch;
import com.grape.model.db.Organization;
import com.grape.model.db.Person;
import com.grape.model.db.Product;
import com.grape.model.db.Verifyopinion;
import com.grape.model.mapper.base.OrganizationMapper;
import com.grape.model.mapper.base.PersonMapper;
import com.grape.service.CallhistService;
import com.grape.service.DoctaskService;
import com.grape.service.ExchannelService;
import com.grape.service.ExqueryhistService;
import com.grape.service.FangguguService;
import com.grape.service.HouseassessService;
import com.grape.service.ImageService;
import com.grape.service.MortgagematchService;
import com.grape.service.ShilianService;
import com.grape.service.VerifyopinionService;
import com.grape.task.ValuationTask;
import com.grape.tool.Util;

import lombok.extern.log4j.Log4j;
@Log4j
@Configuration
public class ServerContext {
	@Autowired
	HouseassessService houseassessService;
	@Autowired
	ShilianService shilianService;
	
	@Autowired
	FangguguService fangguguService;
	@Autowired
	ExchannelService exchannelService;
	@Autowired
	ExqueryhistService exqueryhistService;
	@Autowired
	VerifyopinionService verifyopinionService;
	
	@Autowired
	MortgagematchService mortgagematchService;
	@Autowired
	CallhistService callhistService;
	
	@Autowired
	ImageService imageService;
	@Autowired
	DoctaskService doctaskService;
	
	@Autowired
	PersonMapper personMapper;
	@Autowired
	OrganizationMapper organizationMapper;
	
	/**
	 * 评估信息保存
	 * @param workid 流水号
	 * @param channel 评估渠道
	 * @param unitprice 评估单价
	 * @param totalprice 评估总价
	 * @param mortgageno 抵押物编号
	 * @param valuetype 估价类型
	 * @param assessaddress 评估地址
	 * @throws Exception
	 */
	public void saveHouseassess(String workid,String channel,BigDecimal unitprice,BigDecimal totalprice,
			String mortgageno,String valuetype,String assessaddress) throws Exception{
		Houseassess houseassess = new Houseassess();
		
		houseassess.setWorkid(workid);   
		houseassess.setChannel(channel);
		houseassess.setAssessOnlinePrice(unitprice);
		houseassess.setAssessOnlineTotal(totalprice);
		houseassess.setMortgageno(mortgageno);
		houseassess.setValuetype(valuetype);
		houseassess.setAssessaddress(assessaddress);
		houseassess.setChgdt(new Date());
		
		houseassess.setChgtl(ServerContext.getworkerid());
		
		houseassessService.houseassessAddOrUpdate(houseassess);
	}
	
	/**
	 * 获取当前登录用户
	 * @return
	 */
	public static String getworkerid(){
		return SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
	}
	
	/**
	 * 设置返回评估信息
	 * @param unitprice
	 * @param totalprice
	 * @param channel
	 * @param address
	 * @param filename
	 * @return
	 */
	public ChannelAssessinfo getChannelAssessinfo(BigDecimal unitprice,BigDecimal totalprice,String channel,String address,String filename){
		ChannelAssessinfo returnPriceBean = new ChannelAssessinfo();
		
		returnPriceBean.setAssessprice(unitprice);
		
		returnPriceBean.setAssesstotal(totalprice);
		
		returnPriceBean.setChannel(channel);
		
		returnPriceBean.setHouseaddress(address);
		
		returnPriceBean.setFilename(filename);
		
		return returnPriceBean;
	 }
	
	/**
	 * 世联评估
	 * @param workid 流水号
	 * @param citycode 城市编码
	 * @param mortgageno 抵押物编号
	 * @param houseaddress 抵押物地址
	 * @param floorarea 建筑面积
	 * @return 渠道评估信息
	 * @throws Exception
	 */
	 public ChannelAssessinfo shilian(String workid,String citycode,String mortgageno,String houseaddress,
			 String floorarea) throws Exception{
			
			SLQueryPriceResponseBean queryPriceResponseBean;
			String queryid = Util.getID();
			ChannelAssessinfo returnPriceBean;
			try {
				int citycode_int = Integer.parseInt(citycode);
				float floorarea_float = new Float(floorarea);
				//查看评估标志是否开启
				Exchannel exchannel = exchannelService.findExchannelByChannelno(MessageDetail.SHILIAN_ID);
				if(exchannel!=null&&exchannel.getOpenflg().equals("Y")){
					
				//	queryPriceResponseBean = shilianService.findSLQueryPrice("SHILIAN1234567892", citycode, "中银花园", "龙华区东环一路香缇雅苑",floorarea);
					queryPriceResponseBean = shilianService.findSLQueryPrice(exchannel,queryid,workid,citycode_int,houseaddress,floorarea_float);
					if(queryPriceResponseBean!=null){
						BigDecimal unitprice = queryPriceResponseBean.getUnitPrice();
						BigDecimal totalprice = unitprice.multiply(new BigDecimal(floorarea));
						
						int returncode = queryPriceResponseBean.getReturnCode();
						
						//根据返回码判断世联返回数据的类型
						/*if(returncode==15){
							//保存评估信息
							this.saveHouseassess(workid, MessageDetail.SHILIAN_ID, unitprice, totalprice, mortgageno, "1","1");

							//表示等待人工给价，启动线程一定时间后查询人工给价结果
							Thread thread = new Thread(new ValuationTask(workid, mortgageno, MessageDetail.SHILIAN_ID, queryid));
							thread.start();

							throw new Exception(MessageDetail.PRICE_WAIT+":"+queryPriceResponseBean.getRemark());
						}else if(returncode==18){
							//更新评估流水状态
							
							//表示人工判断无法估价
							throw new Exception(MessageDetail.PRICE_QUERY_FAIL+":"+queryPriceResponseBean.getRemark());
						}else if(returncode==17){
							if(queryPriceResponseBean.getRemark().equals("估价成功")){
								//保存评估信息
								this.saveHouseassess(workid, MessageDetail.SHILIAN_KEY, unitprice, totalprice, mortgageno,"1","0");
								
								ChannelAssessinfo returnPriceBean = this.getChannelAssessinfo(unitprice, totalprice, MessageDetail.SHILIAN_KEY, null, null);

								return returnPriceBean;
							}else{
								//保存评估信息
								this.saveHouseassess(workid, MessageDetail.SHILIAN_KEY, unitprice, totalprice, mortgageno, "1","1");

								//表示等待人工给价，启动线程一定时间后查询人工给价结果
								Thread thread = new Thread(new ValuationTask(workid, mortgageno, MessageDetail.SHILIAN_KEY, queryid));
								thread.start();

								throw new Exception(MessageDetail.PRICE_WAIT);
							}
						}else{
							
							
							//保存评估信息
							this.saveHouseassess(workid, MessageDetail.SHILIAN_KEY, unitprice, totalprice, mortgageno,"9",null);
							
							ChannelAssessinfo returnPriceBean = this.getChannelAssessinfo(unitprice, totalprice, MessageDetail.SHILIAN_KEY, null, null);
							 
							
							
							return returnPriceBean;
						}*/
						if(queryPriceResponseBean.getRemark().equals("估价成功")){
							//保存评估信息
							this.saveHouseassess(workid, MessageDetail.SHILIAN_KEY, unitprice, totalprice, mortgageno,"1",houseaddress);

						}/*else{
							//保存评估信息
							this.saveHouseassess(workid, MessageDetail.SHILIAN_KEY, unitprice, totalprice, mortgageno,"1",null);

						}*/
						returnPriceBean = this.getChannelAssessinfo(unitprice, totalprice, MessageDetail.SHILIAN_KEY, null, null);
						
					}else{
						
						//如果没有返回则评估价格先设为0
						//this.saveHouseassess(workid, MessageDetail.SHILIAN_KEY, new BigDecimal(0), new BigDecimal(0), mortgageno,"1",null);
						
						returnPriceBean = this.getChannelAssessinfo(new BigDecimal(0), new BigDecimal(0), MessageDetail.SHILIAN_KEY, null, null);
						
					}
				}else{
					throw new Exception(MessageDetail.SHILIAN_OPEN_FAIL);
				}

			} catch (Exception e) {
				
				//如果没有返回则评估价格先设为0
				//this.saveHouseassess(workid, MessageDetail.SHILIAN_KEY, new BigDecimal(0), new BigDecimal(0), mortgageno,"1",null);
				
				returnPriceBean = this.getChannelAssessinfo(new BigDecimal(0), new BigDecimal(0), MessageDetail.SHILIAN_KEY, null, null);
				log.error(e);
				
				//throw new Exception(e.getMessage()==null?MessageDetail.SHILIAN_QUERY_FAIL:e.getMessage());
			}
			
			return returnPriceBean;
	    }
	 
	
	 /**
	  * 
	  * @param workid 流水号
	  * @param citycode 城市编码
	  * @param mortgageno 抵押物编号
	  * @param housetype 房屋类型
	  * @param floorarea 建筑面积
	  * @param communityid 房估估查询id
	  * @return
	  * @throws Exception
	  */
	 public ChannelAssessinfo fanggugu(String workid,String citycode,String mortgageno,
				String housetype,String floorarea,String communityid) throws Exception{
			FGGQueryPriceBean queryPriceBean;
			ChannelAssessinfo returnPriceBean;
			
			try {
				Exchannel exchannel = exchannelService.findExchannelByChannelno(MessageDetail.FANGGUGU_ID);
				
				//查看评估标志是否开启
				if(exchannel!=null&&exchannel.getOpenflg().equals("Y")){
					
					queryPriceBean = fangguguService.getFGGQueryPricAgain(exchannel, workid, citycode, mortgageno, housetype, new Float(floorarea),communityid);
					if(queryPriceBean!=null){
						BigDecimal unitprice = new BigDecimal(queryPriceBean.getPrice());
						BigDecimal totalprice =unitprice.multiply(new BigDecimal(floorarea));
						
						List<Mortgagematch> mortgagematchs = mortgagematchService.findMortgagematchByMatchflag(mortgageno, "Y");
						String address = null;
						if(mortgagematchs.size()>0){
							address = mortgagematchs.get(0).getHouseaddress();
						}
						
						//如果评估价不为0
						if(unitprice.compareTo(new BigDecimal(0))>0){
							//保存评估信息
							this.saveHouseassess(workid, MessageDetail.FANGGUGU_KEY, unitprice, totalprice, mortgageno, "1",address);
						
						}
						
						
						returnPriceBean = this.getChannelAssessinfo(unitprice, totalprice, MessageDetail.FANGGUGU_KEY, null, null);
				
						return returnPriceBean;
					}else{
						
						//如果没有返回则评估价格先设为0
					//	this.saveHouseassess(workid, MessageDetail.FANGGUGU_KEY, new BigDecimal(0), new BigDecimal(0), mortgageno, "1",null);
					
						
						returnPriceBean = this.getChannelAssessinfo(new BigDecimal(0), new BigDecimal(0), MessageDetail.FANGGUGU_KEY, null, null);
						
						
						//throw new Exception(MessageDetail.FANGGUGU_QUERY_FAIL);
					}
					
				}else{
					throw new Exception(MessageDetail.FANGGUGU_OPEN_FAIL);
				}
			} catch (Exception e) {
				//如果没有返回则评估价格先设为0
				//this.saveHouseassess(workid, MessageDetail.FANGGUGU_KEY, new BigDecimal(0), new BigDecimal(0), mortgageno, "1",null);
			
				
				returnPriceBean = this.getChannelAssessinfo(new BigDecimal(0), new BigDecimal(0), MessageDetail.FANGGUGU_KEY, null, null);
				
				log.error(e);
				
				//throw new Exception(e.getMessage()==null?MessageDetail.FANGGUGU_QUERY_FAIL:e.getMessage());
				
			}
			
			return returnPriceBean;
	    }
	 
	 /**
	  * 线上评估单价计算，两家评估公司时使用
	  * @param price1 渠道评估单价1
	  * @param price2 渠道评估单价2
	  * @param lowervalue 下调值
	  * @param tonevalue 上调值
	  * @return
	  * @throws Exception
	  */
	 public BigDecimal onlinePrice2(BigDecimal price1,BigDecimal price2,BigDecimal lowervalue,BigDecimal tonevalue,float floatOnline) throws Exception{

			try {
				
				
				BigDecimal onlineprice = new BigDecimal(0);//线上评估单价
				BigDecimal channelprice1 = new BigDecimal(0);//渠道评估单价1
				BigDecimal channelprice2 = new BigDecimal(0);//渠道评估单机2
				//校验评估值是否为0，如果为0则系统单价取另一评估公司评估单价
				if(channelprice1.compareTo(price1)>=0){
					onlineprice = price2;
					return onlineprice;
				}else if(channelprice2.compareTo(price2)>=0){
					onlineprice = price1;
					return onlineprice;
				}else if(channelprice1.compareTo(price1)>=0&&channelprice2.compareTo(price2)>=0){
					return onlineprice;
				}
				//首先计算浮动值
				float floatrate ;
				int comparevalue = price1.compareTo(price2);//评估单价比较值
					if(comparevalue == 1){
						floatrate = Math.abs((price1.subtract(price2)).divide(price2, 5, BigDecimal.ROUND_HALF_UP).floatValue());
					}else{
						floatrate = Math.abs((price1.subtract(price2)).divide(price1, 5, BigDecimal.ROUND_HALF_UP).floatValue());
					}

					//如果浮率大于0.05，最大评估单价下调6%，最小评估价格上调1%后，与其他两值取其平均数
					
					if(floatrate>floatOnline){
						if(comparevalue==1){
							channelprice1 = price1.subtract(price1.multiply(lowervalue));
							channelprice2 = price2.add(price2.multiply(tonevalue));
						}else{
							channelprice1 = price1.add(price1.multiply(tonevalue));
							channelprice2 = price2.subtract(price2.multiply(lowervalue));
						}
		
						//系统评估单价取平均值
						onlineprice = (channelprice1.add(channelprice2)).divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
						
					}else{
						//当线上两个评估价格的浮动小于或等于5%，则：取线上评估值的均值
						onlineprice = (price1.add(price2)).divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
						
					}

				return onlineprice;
			
			} catch (Exception e) {
				log.error(e);
				throw new Exception(MessageDetail.PRICE_SYSTEM_FAIL);
			}

	    }
	 
	 /**
	  * 计算线上业务评估单价，支持多家评估公司
	  * @param pricelist  渠道评估单价列表
	  * @param lowervalue 下调值
	  * @param tonevalue 上调值
	  * @param floatOnline 浮率
	  * @return 业务评估单价
	  * @throws Exception
	  */
	 public BigDecimal onlinePrice(List<BigDecimal> pricelist,BigDecimal lowervalue,BigDecimal tonevalue,float floatOnline) throws Exception{

			try {
				
				BigDecimal onlineprice = new BigDecimal(0);//线上评估单价
				BigDecimal cachetotal =  new BigDecimal(0);//线上评估单价总和
				BigDecimal maxprice = Util.getMaxBigDecimal(pricelist);//渠道最大评估单价
				BigDecimal minprice = Util.getMinBigDecimal(pricelist);;//渠道最小评估单价
				
				
				//首先计算浮动值
				float floatrate ;
				floatrate = Math.abs((maxprice.subtract(minprice)).divide(minprice, 5, BigDecimal.ROUND_HALF_UP).floatValue());
				
					//当线上三个价格中，最大评估单价与最小评估单价的浮动大于0%，则：最大评估单价下调15%后，与其他两值取其平均数。
					
					if(floatrate>floatOnline){
						
						//移除最大单价
						List<BigDecimal> pricelist2 = Util.deleteMaxBigDecimal(pricelist);
						//最大单价下调15%
						BigDecimal maxprice2 = maxprice.subtract(maxprice.multiply(lowervalue));
						//计算单价总和
						cachetotal = cachetotal.add(maxprice2);
						for (BigDecimal bigDecimal : pricelist2) {
							cachetotal = cachetotal.add(bigDecimal);
						}
						//系统评估单价取平均值
						onlineprice = (cachetotal).divide(new BigDecimal(pricelist.size()+1), 5, BigDecimal.ROUND_HALF_UP);
						
					}else{
					
						for (BigDecimal bigDecimal : pricelist) {
							cachetotal = cachetotal.add(bigDecimal);
							
						}
						//系统评估单价取平均值
						onlineprice = (cachetotal).divide(new BigDecimal(pricelist.size()), 5, BigDecimal.ROUND_HALF_UP);
						
					}

				return onlineprice;
			
			} catch (Exception e) {
				log.error(e);
				throw new Exception(MessageDetail.PRICE_SYSTEM_FAIL);
			}

	    }
	 /**
	  * 风控评估单价计算
	  * @param onlinePrice 线上评估单价
	  * @param generalPrice 一般成交价
	  * @param quickPrice 快速成交价
	  * @param lowervalue 
	  * @param tonevalue
	  * @return
	  * @throws Exception
	  */
	 public BigDecimal controlPrice(BigDecimal onlinePrice,BigDecimal generalPrice,BigDecimal quickPrice,BigDecimal lowervalue,BigDecimal tonevalue,BigDecimal lowervalue2,BigDecimal tonevalue2,float floatBnG,float floatCnO) throws Exception{

			try {
				
				BigDecimal controlPrice = new BigDecimal(0);
				if(new BigDecimal(0).compareTo(onlinePrice)>=0||new BigDecimal(0).compareTo(quickPrice)>=0||new BigDecimal(0).compareTo(generalPrice)>=0){
					return controlPrice;
				}
				//1、求线下一般成交价和快速成交价的均价（A）
				BigDecimal priceA = new BigDecimal(0);
				
				priceA = (generalPrice.add(quickPrice)).divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
				//2、取A与业务评估单价的均值（B）
				BigDecimal priceB = new BigDecimal(0);
				priceB = (priceA.add(onlinePrice)).divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
				
				//3、D值计算如下：
				//1）当B值<一般成交价，且B值与一般成交价的浮动大于0%时，A值和业务评估单价中值高者下调0%，值低者上调0%后，取其两值平均数。
				//B与一般成交价比较值
				int compareBnGeneral = priceB.compareTo(generalPrice);
				//A与业务评估单价比较值
				int compaerAnOnline = priceA.compareTo(onlinePrice);
				//D值
				BigDecimal priceD = new BigDecimal(0);
				//B与一般成交价浮动数
				float floatBnGeneral = Math.abs((priceB.subtract(generalPrice)).divide(generalPrice, 5, BigDecimal.ROUND_HALF_UP).floatValue());
				
				if((compareBnGeneral==-1)){
					if(floatBnGeneral>floatBnG){
						//A值和业务评估单价中值高者下调0%，值低者上调0%后，取其两值平均数
						BigDecimal priceA2 = new BigDecimal(0);
						BigDecimal onlinePrice2 = new BigDecimal(0);
						if(compaerAnOnline==1){
							priceA2 =priceA.subtract(priceA.multiply(lowervalue));
							onlinePrice2 = onlinePrice.add(onlinePrice.multiply(tonevalue));
						}else{
							priceA2 =priceA.add(priceA.multiply(tonevalue));
							onlinePrice2 = onlinePrice.subtract(onlinePrice.multiply(lowervalue));
						}
						priceD = (priceA2.add(onlinePrice2)).divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
					}else{
						//直接取平均值
						priceD = (priceA.add(onlinePrice)).divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
					}
					
				}else if((compareBnGeneral==1||compareBnGeneral==0)){
					if(floatBnGeneral>floatBnG){
						//2）当B值>=一般成交价，且B值与一般成交价的浮动大于0%时，A值和业务评估单价中值高者下调0%，值低者上调0%后，取其两值平均数。（1.2规则一样，但是调动值不同）
						BigDecimal priceA2 = new BigDecimal(0);
						BigDecimal onlinePrice2 = new BigDecimal(0);
						if(compaerAnOnline==1){
							priceA2 =priceA.subtract(priceA.multiply(lowervalue2));
							onlinePrice2 = onlinePrice.add(onlinePrice.multiply(tonevalue2));
						}else{
							priceA2 =priceA.add(priceA.multiply(tonevalue2));
							onlinePrice2 = onlinePrice.subtract(onlinePrice.multiply(lowervalue2));
						}
						priceD = (priceA2.add(onlinePrice2)).divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
					}else{
						priceD = (priceA.add(onlinePrice)).divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
					}
					
				}
				
				//4、当D<一般成交价，取D；当D>=一般成交价，取一般成交价：（C）
				BigDecimal priceC = new BigDecimal(0);
				int compareDnGeneral = priceD.compareTo(generalPrice);
				if(compareDnGeneral==-1){
					priceC = priceD;
				}else{
					priceC = generalPrice;
				}
					//5、当C>业务评估单价，且C与业务评估单价的浮动率大于10%，取业务评估单价；
					 //  当C<=业务评估单价，且C与业务评估单价的浮动率小于或等于10%，取C 
					int compareCnOnline = priceC.compareTo(onlinePrice);
					float floatCnOnline = Math.abs((priceC.subtract(onlinePrice)).divide(onlinePrice, 5, BigDecimal.ROUND_HALF_UP).floatValue());
					if((compareCnOnline==1)){
						if(floatCnOnline>floatCnO){
							controlPrice = onlinePrice;
						}else{
							controlPrice = priceC;
						}
						
					}else if((compareCnOnline==-1||compareCnOnline==0)){
						if(floatCnOnline<=floatCnO){
							controlPrice = onlinePrice;
						}else{
							controlPrice = priceC;
						}
						
					}
				
				return controlPrice;
			} catch (Exception e) {
				log.error(e);
				throw new Exception(MessageDetail.PRICE_SYSTEM_FAIL);
			}
	    }
	 
	 
	 
	 /**
	  * 复估后计算综合评估价格
	  * @param workid 流水号
	  * @param mortgageno 抵押物编号
	  * @param floorarea 房屋面积
	  * @param houseAddress 房屋地址
	  * @param fuguflg 复估标志
	  * @return 综合评估价格信息
	  * @throws Exception
	  */
	 public MortgageAssessinfo ComprehensiveFugu(String workid,String mortgageno,String floorarea,String houseAddress,String mortgagename)throws Exception{
		try {
			
			List<Houseassess> houseassessess = houseassessService.findHouseassessList(workid, mortgageno);
			Assessmodel assessmodel = houseassessService.findAssessmodelDefault();
			Houseassess xitongAssess = null ;
			List<BigDecimal> pricelist = new ArrayList<>();
			List<ChannelAssessinfo> channelAssessinfos = new ArrayList<>();
			
			if (houseassessess.size() > 0) {
				for (Houseassess houseassess : houseassessess) {
					if (!houseassess.getChannel().equals(MessageDetail.XITONG_KEY)) {
						// 获取其他渠道的评估单价
						pricelist.add(houseassess.getAssessOnlinePrice());
						
						//渠道评估信息
						ChannelAssessinfo assessinfo = new ChannelAssessinfo();
						assessinfo.setAssessprice(houseassess.getAssessOnlinePrice());
						assessinfo.setAssesstotal(houseassess.getAssessOnlineTotal());
						//assessinfo.setHouseaddress(houseAddress);
						assessinfo.setChannel(houseassess.getChannel());
						assessinfo.setFilename(houseassess.getFilename());
						channelAssessinfos.add(assessinfo);
					}else{
						xitongAssess = houseassess;
					}
				}
			}
			if(xitongAssess!=null){
				// 首先计算线上评估价格
				BigDecimal onlinePrice = this.onlinePrice(pricelist, assessmodel.getLowervalueOnline(), assessmodel.getTonevalueOnline(),assessmodel.getFloatOnline());
				//计算风控评估价格
				BigDecimal controlPrice = this.controlPrice(onlinePrice, xitongAssess.getGeneralUnitPrice(), xitongAssess.getQuickUnitPrice(), assessmodel.getLowervalueBng(), 
						assessmodel.getTonevalueBng(),assessmodel.getLowervalueBng2(),assessmodel.getTonevalueBng2(),assessmodel.getFloatBng(),assessmodel.getFloatCno());
				
				//更新系统评估信息
				BigDecimal total = controlPrice.multiply(new BigDecimal(floorarea));
				
					//更新复估单价和总价
				xitongAssess.setAssessAgainPrice(controlPrice);
				xitongAssess.setAssessAgainTotal(total);
				
				xitongAssess.setChgdt(new Date());
				String workerid = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
				xitongAssess.setChgtl(workerid);
				houseassessService.houseassessUpdate(xitongAssess);
				ChannelAssessinfo onlineAssessinfo = new ChannelAssessinfo(null, MessageDetail.ONLINE_KEY,xitongAssess.getAssessOnlinePrice(), xitongAssess.getAssessOnlineTotal(),null);
				ChannelAssessinfo controlAssessinfo = new ChannelAssessinfo(null, MessageDetail.CONTROL_KEY,controlPrice, total,null);
				channelAssessinfos.add(onlineAssessinfo);
				channelAssessinfos.add(controlAssessinfo);
				 
				String	assesstime = String.valueOf(xitongAssess.getChgdt().getTime());
				
				//计算涨幅
				String gains = String.valueOf(this.getGains(workid,mortgageno));
				return new MortgageAssessinfo(mortgageno, mortgagename, assesstime,null,null, gains, channelAssessinfos,null);
				
			}else{
				log.info("系统评估信息为空！");

			}

			return null;
		} catch (Exception e) {
			throw e;
		}

	}
	 
	 /**
	  * 综合价格计算
	  * @param workid 流水号
	  * @param mortgageno 抵押物编号
	  * @param generalUnitPrice 一般成交价
	  * @param quickUnitPrice 快速成交价
	  * @return 综合评估价格
	  * @throws Exception
	  */
	 public BigDecimal Comprehensive(String workid,String mortgageno,BigDecimal generalUnitPrice,BigDecimal quickUnitPrice)throws Exception{
			try {
				
				List<Houseassess> houseassessess = houseassessService.findHouseassessList(workid, mortgageno);
				Assessmodel assessmodel = houseassessService.findAssessmodelDefault();
				List<BigDecimal> pricelist = new ArrayList<>();
				
				
				if (houseassessess.size() > 0) {
					for (Houseassess houseassess : houseassessess) {
						if (!houseassess.getChannel().equals(MessageDetail.XITONG_KEY)) {
							// 获取其他渠道的评估单价
							pricelist.add(houseassess.getAssessOnlinePrice());
							
						}
					}
				}
					// 首先计算线上评估价格
					BigDecimal onlinePrice = this.onlinePrice(pricelist, assessmodel.getLowervalueOnline(), assessmodel.getTonevalueOnline(),assessmodel.getFloatOnline());
					
					//计算风控评估价格
					BigDecimal controlPrice = this.controlPrice(onlinePrice, generalUnitPrice,quickUnitPrice, assessmodel.getLowervalueBng(), 
							assessmodel.getTonevalueBng(),assessmodel.getLowervalueBng2(),assessmodel.getTonevalueBng2(),assessmodel.getFloatBng(),assessmodel.getFloatCno());
					
					
					
					
					return controlPrice;
		
			} catch (Exception e) {
				throw e;
			}

		}
	 
	 /**
	  * 获取业务评估单价
	  * @param wrokid 流水号
	  * @param mortgageno 抵押物编号
	  * @return
	  * @throws Exception
	  */
	 public BigDecimal getOnlinePrice(Assessmodel assessmodel,String wrokid,String mortgageno)throws Exception{
			try {
				
				List<Houseassess> houseassessess = houseassessService.findHouseassessList(wrokid,mortgageno);
				
				List<BigDecimal> pricelist = new ArrayList<>();
				
				
				if (houseassessess.size() > 0) {
					for (Houseassess houseassess : houseassessess) {
						if (!houseassess.getChannel().equals(MessageDetail.XITONG_KEY)) {
							// 获取其他渠道的评估单价
							pricelist.add(houseassess.getAssessOnlinePrice());
							
						}
					}
				}
					// 首先计算线上评估价格
					BigDecimal onlinePrice = this.onlinePrice(pricelist, assessmodel.getLowervalueOnline(), assessmodel.getTonevalueOnline(),assessmodel.getFloatOnline());
					
					
					return onlinePrice;
		
			} catch (Exception e) {
				throw e;
			}

		}
	 
	 
	 
	 /**
	  * 
	  * @param xitong 
	  * @param generalUnitPrice
	  * @param quickUnitPrice
	  * @return
	  * @throws Exception
	  */
	 public Houseassess Comprehensive2(Houseassess xitong,BigDecimal generalUnitPrice,BigDecimal quickUnitPrice)throws Exception{
			try {
				
				List<Houseassess> houseassessess = houseassessService.findHouseassessList(xitong.getWorkid(), xitong.getMortgageno());
				Assessmodel assessmodel = houseassessService.findAssessmodelDefault();
				List<BigDecimal> pricelist = new ArrayList<>();
				
				
				if (houseassessess.size() > 0) {
					for (Houseassess houseassess : houseassessess) {
						if (!houseassess.getChannel().equals(MessageDetail.XITONG_KEY)) {
							// 获取其他渠道的评估单价
							pricelist.add(houseassess.getAssessOnlinePrice());
							
						}
					}
				}
					// 首先计算线上评估价格
					BigDecimal onlinePrice = this.onlinePrice(pricelist, assessmodel.getLowervalueOnline(), assessmodel.getTonevalueOnline(),assessmodel.getFloatOnline());
					xitong.setAssessOnlinePrice(onlinePrice);
					//计算风控评估价格
					BigDecimal controlPrice = this.controlPrice(onlinePrice, generalUnitPrice,quickUnitPrice, assessmodel.getLowervalueBng(), 
							assessmodel.getTonevalueBng(),assessmodel.getLowervalueBng2(),assessmodel.getTonevalueBng2(),assessmodel.getFloatBng(),assessmodel.getFloatCno());
					
					xitong.setAssessControlPrice(controlPrice);
					
					
					return xitong;
		
			} catch (Exception e) {
				throw e;
			}

		}
	 /**
	  * 更新评估信息风控价格
	  * @param controlPrice 风控评估单价
	  * @param floorarea 建筑面积
	  * @param workid 流水号
	  * @param mortgageno 抵押物编号
	  * @throws Exception
	  */
	 public void updateHouseassessForControl(BigDecimal controlPrice,String floorarea,String workid,String mortgageno) throws Exception{
		 Houseassess houseassess = houseassessService.findHouseassess(MessageDetail.XITONG_KEY, workid, mortgageno);
		 if(houseassess!=null){
			 houseassess.setAssessControlPrice(controlPrice);
			 BigDecimal total = controlPrice.multiply(new BigDecimal(floorarea));
			 houseassess.setAssessControlTotal(total);
			 houseassess.setChgdt(new Date());
			 houseassess.setChgtl(ServerContext.getworkerid());
			 houseassessService.houseassessUpdate(houseassess);
		 }
	 }
	 
	 public void updateMortgagematch(Mortgagematch mortgagematch) throws Exception{
		 List<Mortgagematch> Mortgagematchs = mortgagematchService.findMortgagematchByMatchflag(mortgagematch.getMortgageno(), "Y");
		 if(Mortgagematchs.size()>0){
			 for (Mortgagematch mortgagematch2 : Mortgagematchs) {
				mortgagematch2.setMatchflag("");
				mortgagematchService.updateMortgagematch(mortgagematch2);
			}
		mortgagematch.setMatchflag("Y");
		mortgagematchService.updateMortgagematch(mortgagematch);
		 }
	 }
	 
	 /**
	  * 计算涨幅
	  * @param workid 流水号
	  * @param mortgageno 抵押物编号
	  * @return
	  */
	 public String getGains(String workid,String mortgageno){
		
			Houseassess houseassess= houseassessService.findHouseassess(MessageDetail.XITONG_KEY, workid, mortgageno);
			String gains = "0";
			
			if(houseassess!=null){
				
				BigDecimal assesstotal = houseassess.getAssessControlTotal();
				
				BigDecimal fugutotal =  houseassess.getAssessAgainTotal();
				if(fugutotal==null||assesstotal==null){
					return gains;
				}else{
					gains = (fugutotal.subtract(assesstotal)).divide(assesstotal, 5, BigDecimal.ROUND_HALF_UP).toString();
				}
				
				
			}
			return gains;
	 }
	 
	 /**
	  * 计算快速成交价
	  * @param buildingproperties
	  * @return
	  */
	 public BigDecimal getQuickprice(List<Buildingproperty> buildingproperties){
		 	BigDecimal quickprice = new BigDecimal(0);// 快速成交价
			
			BigDecimal cacheQuickprice = new BigDecimal(0);// 临时快速成交总价
			
			if (buildingproperties.size() == 1) {
				quickprice = new BigDecimal(buildingproperties.get(0).getFastprice());
				
			} else if (buildingproperties.size() == 2) {

				for (Buildingproperty buildingproperty : buildingproperties) {
					cacheQuickprice = cacheQuickprice
							.add(new BigDecimal(buildingproperty.getFastprice()));
					
				}
				quickprice = cacheQuickprice.divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
				
			} else if (buildingproperties.size() > 2) {
				List<Double> quickprices = new ArrayList<>();
				
				for (Buildingproperty buildingproperty : buildingproperties) {
					quickprices.add(new Double(buildingproperty.getFastprice()));
					
				}

				// 去除最大值
				quickprices = Util.deleteMax(quickprices);
				

				for (Double double1 : quickprices) {
					cacheQuickprice = cacheQuickprice.add(new BigDecimal(double1));
				}
				quickprice = cacheQuickprice.divide(new BigDecimal(quickprices.size()), 5,
						BigDecimal.ROUND_HALF_UP);
				
			}
			return quickprice;
	 }
	 
	 /**
	  * 计算一般成交价
	  * @param buildingproperties
	  * @return
	  */
	 public BigDecimal getGeneralprice(List<Buildingproperty> buildingproperties){
		
			BigDecimal generalprice = new BigDecimal(0); // 一般成交价
			
			BigDecimal cacheGeneralprice = new BigDecimal(0); // 临时一般成交总价
			if (buildingproperties.size() == 1) {
				
				generalprice = new BigDecimal(buildingproperties.get(0).getRealprice());
			} else if (buildingproperties.size() == 2) {

				for (Buildingproperty buildingproperty : buildingproperties) {
					
					cacheGeneralprice = cacheGeneralprice
							.add(new BigDecimal(buildingproperty.getRealprice()));
				}
				
				generalprice = cacheGeneralprice.divide(new BigDecimal(2), 5, BigDecimal.ROUND_HALF_UP);
			} else if (buildingproperties.size() > 2) {
				
				List<Double> generalprices = new ArrayList<>();
				for (Buildingproperty buildingproperty : buildingproperties) {
				
					generalprices.add(new Double(buildingproperty.getRealprice()));
				}

				// 去除最大值
			
				generalprices = Util.deleteMax(generalprices);

				
				for (Double double1 : generalprices) {
					cacheGeneralprice = cacheGeneralprice.add(new BigDecimal(double1));
				}
				generalprice = cacheGeneralprice.divide(new BigDecimal(generalprices.size()), 5,
						BigDecimal.ROUND_HALF_UP);

			}
		return generalprice;
		 
	 }
	 
	 /**
	  * 保存外联接口查询查询记录
	  * @param id
	  * @param workid
	  * @param interfaceno
	  * @param successflag
	  * @param content
	  */
	 public void saveExqueryhist(String id,String workid,String interfaceno,String successflag,String content,String channelno) throws Exception{
			Exqueryhist exqueryhist = new Exqueryhist();
			if(Util.isBlank(id)){
				id = Util.getID();
			}
			exqueryhist.setId(id);
			exqueryhist.setWorkid(workid);
			exqueryhist.setChannelno(channelno);
			exqueryhist.setSuccessflag(successflag);
			exqueryhist.setInterfaceno(interfaceno);
			exqueryhist.setContent(content);
			exqueryhist.setChgdt(new Date());
			
			
			exqueryhist.setChgtl(ServerContext.getworkerid());
			exqueryhistService.insertExqueryhist(exqueryhist);
		}
	 
	 public void saveVerifyopinion(String workid,String phoneOpinion,String mortgageOpinion) throws Exception{
		 Verifyopinion verifyopinion = verifyopinionService.findVerifyopinionById(workid);
		 if(verifyopinion!=null){
			 if(!Util.isBlank(mortgageOpinion)){
				 verifyopinion.setMortgageopinion(mortgageOpinion); 
			 }
			 if(!Util.isBlank(phoneOpinion)){ 
				 verifyopinion.setPhoneopinion(phoneOpinion);
			 }
			 
			 verifyopinion.setChgdt(new Date());
			 verifyopinion.setChgtl(getworkerid());
			 verifyopinionService.update(verifyopinion);
		 }else{
			 Verifyopinion verifyopinion2 = new Verifyopinion();
			 verifyopinion2.setWorkid(workid);
			 
			 verifyopinion2.setMortgageopinion(mortgageOpinion); 
			
			
			 verifyopinion2.setPhoneopinion(phoneOpinion);
			
			 
			 verifyopinion2.setChgdt(new Date());
			 verifyopinion2.setChgtl(getworkerid());
			 verifyopinionService.insert(verifyopinion2);
		 }
		 
		 
		
	 }
	 
	 public void saveCallhist(String workid,String callid,String custname,String custphone,String custtype) throws Exception{
		 Callhist callhist = new Callhist();
		 callhist.setWorkid(workid);
		 callhist.setCallid(callid);
		 callhist.setCustname(custname);
		 callhist.setCustphone(custphone);
		 callhist.setCusttype(custtype);
		 callhist.setChgdt(new Date());
		
		 callhist.setChgtl(ServerContext.getworkerid());
		 callhistService.insert(callhist);
	 }
	 
	 public void saveImage(String workid,String filename,String nodeid){
		 Image image = new Image();
		 image.setImageid(Util.getID());
		 image.setWorkid(workid);
		 image.setNodeid(nodeid);
		 image.setImagename(filename);
		 image.setImagetype("PG01");
		 image.setChgdt(new Date());
		 image.setChgtl(getworkerid());
		 imageService.save(image);
	 }
	 
	 
	/**
	 * 房抵贷产品标志 
	 * @param workid 流水号
	 * @return
	 */
	public boolean getPRDFlag(String workid) {
		Doctask doctask = doctaskService.findByWorkid(workid);
		Product product = doctaskService.findProductByNo(doctask.getProductno());
		String producttype = product.getProducttype();
		if (("5".equals(producttype) && "ZQ002".equals(doctask.getProductno())) || "1".equals(producttype)) {

			return true;
		}
		return false;
	}
	
	/**
	 * 判断是否是渠道的人
	 * @return
	 */
	public boolean isChanneller(){
		
		
		Person person = personMapper.selectByPrimaryKey(getworkerid());
		if(person!=null){
			Organization organization = organizationMapper.selectByPrimaryKey(person.getOrganizationid());
			if(organization!=null){
				if("01".equals(organization.getOrgbelongsto())){
					return true;
				}
			}
		}
		return false;
		
	}
		
}
