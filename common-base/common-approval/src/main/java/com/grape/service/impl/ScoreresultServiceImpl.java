/*package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.ScoreresultResponse;
import com.grape.controller.request.ScoreresultRequest;
import com.grape.model.db.Custscore;
import com.grape.model.mapper.base.CustscoreMapper;
import com.grape.model.mapper.external.CustscoreExMapper;
import com.grape.model.mapper.external.DoctaskExMapper;
import com.grape.model.mapper.external.ScoreresultExMapper;
import com.grape.service.ScoreresultService;

@Service
public class ScoreresultServiceImpl implements ScoreresultService{

	@Autowired
	private ScoreresultExMapper scoreresultExMapper ;
	
	@Autowired
	private CustscoreExMapper custscoreExMapper ;
	
	@Autowired
	private CustscoreMapper custscoreMapper ;
	
	@Autowired
	private DoctaskExMapper doctaskExMapper ;

	@Override
	public ScoreresultResponse selectMax(ScoreresultRequest req) {
		ScoreresultResponse res = scoreresultExMapper.selectMax(req);
		String custgrade = res.getCustgrade() ;
		String pledgegrade = res.getPledgegrade() ;
		String workid = req.getWorkid() ;
	
			for (Custscore custscore : CustscoreAll) {
			 if(custgrade.compareTo(custscore.getStartcustgrade()) > 0) {				 
			 }
			}
		
			for(int id = 0 ; id < custscoreExMapper.selectCountid() ; id ++) {}
			
			Custscore custscore = custscoreMapper.selectByPrimaryKey(String.valueOf(1)) ;
			Custscore custscore2 = custscoreMapper.selectByPrimaryKey(String.valueOf(2)) ;
			Custscore custscore3 = custscoreMapper.selectByPrimaryKey(String.valueOf(3)) ;
			Custscore custscore4 = custscoreMapper.selectByPrimaryKey(String.valueOf(4)) ;
			Custscore custscore5 = custscoreMapper.selectByPrimaryKey(String.valueOf(5)) ;
			Custscore custscore6 = custscoreMapper.selectByPrimaryKey(String.valueOf(6)) ;
			
			
			if(custgrade.compareTo(custscore.getStartcustgrade()) >= 0 && custgrade.compareTo(custscore.getEndcustgrade()) < 0) {	
				if(pledgegrade.compareTo(custscore.getStartmortgrade()) >= 0 && pledgegrade.compareTo(custscore.getStartmortgrade())< 0) {
					String custlevel = custscore.getCustleavel() ;
					doctaskExMapper.updateByworkid(workid, custlevel);
				} else if(custgrade.compareTo(custscore2.getStartcustgrade()) >= 0 && custgrade.compareTo(custscore2.getEndcustgrade()) <= 0) {
					String custlevel = custscore2.getCustleavel() ;
					doctaskExMapper.updateByworkid(workid, custlevel);
				} else {
					String custlevel = custscore3.getCustleavel() ;
					doctaskExMapper.updateByworkid(workid, custlevel);
				}
			 } else if (custgrade.compareTo(custscore4.getStartcustgrade()) >= 0 && custgrade.compareTo(custscore4.getEndcustgrade()) < 0) {
				 if(pledgegrade.compareTo(custscore.getStartmortgrade()) >= 0 && pledgegrade.compareTo(custscore.getStartmortgrade())< 0) {
						String custlevel = custscore4.getCustleavel() ;
						doctaskExMapper.updateByworkid(workid, custlevel);
				 } else {
					 String custlevel = custscore5.getCustleavel() ;
						doctaskExMapper.updateByworkid(workid, custlevel);
				 }
			 } else {
				 String custlevel = custscore6.getCustleavel() ;
					doctaskExMapper.updateByworkid(workid, custlevel);
			 }
		
		
		
		return null ;
	}
	
}
*/