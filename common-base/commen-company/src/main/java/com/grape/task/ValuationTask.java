package com.grape.task;

import org.springframework.beans.factory.annotation.Autowired;

import com.grape.controller.reponse.bean.SLQueryPriceResponseBean;
import com.grape.model.db.Houseassess;
import com.grape.service.HouseassessService;
import com.grape.service.ShilianService;

import lombok.extern.log4j.Log4j;

@Log4j
public class ValuationTask implements Runnable{
	
	private String workid;
	private String mortgageno;
	private String channel;
	private String queryid;
	
	public ValuationTask(String workid, String mortgageno, String channel,String queryid) {
		this.workid = workid;
		this.mortgageno = mortgageno;
		this.channel = channel;
		this.queryid = queryid;
	}
	@Autowired
	ShilianService shilianService;
	@Autowired
	HouseassessService houseasessService;
	@Override
	public void run() {
		//等待一定时间后执行，目前暂定半小时
		log.info("人工估价查询任务将在半小时候启动");
		try {
			Thread.sleep(30*60);
		} catch (InterruptedException e) {
			log.info("休眠任务半打断");
		}
		
		
		
		while(true){
			log.info("开始执行人工估价查询任务");
			try {
				SLQueryPriceResponseBean priceResponseBean= shilianService.findSLqueryPriceRecord(queryid,workid);
				if(priceResponseBean!=null){
					//更新抵押物评估信息
					Houseassess houseassess = houseasessService.findHouseassess(channel, workid,mortgageno);
					houseassess.setAssessOnlinePrice(priceResponseBean.getUnitPrice());
					houseassess.setAssessOnlineTotal(priceResponseBean.getTotalPrice());
					int returncode = priceResponseBean.getReturnCode();
					String remake = priceResponseBean.getRemark();
					if(returncode==15){
						//如果依旧是在等待人工给价状态，休眠10分钟后再次查询
						log.info("人工估价中，10分钟后再次查询...");
						Thread.sleep(10*60);
						continue;
					}else if(returncode==17){
						if(remake.equals("估价成功")){
							houseassess.setAssessprogress("0");
						}else{
							//如果依旧是在等待人工给价状态，休眠10分钟后再次查询
							log.info("人工估价中，10分钟后再次查询...");
							Thread.sleep(10*60);
							continue;
						}
					}else if(returncode==16){
						houseassess.setAssessprogress("0");
						
					}else if(returncode ==18){
						//人工判断无法估价
						houseassess.setAssessprogress("2");
					}
					houseasessService.houseassessUpdate(houseassess);
					log.info("人工估价查询任务执行完毕");
					break;
				}
			} catch (Exception e) {
				log.info("人工估价查询任务执行失败");
			}
		}
		
	}

}
