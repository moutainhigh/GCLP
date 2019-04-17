package com.grape.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.controller.reponse.FlowHandleResponse;
import com.grape.controller.request.RiskapprovalRequest;
import com.grape.controller.request.RiskapprovalformRequest;
import com.grape.model.db.Mortgagestate;
import com.grape.model.db.MortgagestateExample;
import com.grape.model.db.Riskapproval;
import com.grape.model.db.RiskapprovalExample;
import com.grape.model.db.Riskapprovalform;
import com.grape.model.mapper.base.MortgagestateMapper;
import com.grape.model.mapper.base.RiskapprovalMapper;
import com.grape.model.mapper.base.RiskapprovalformMapper;
import com.grape.service.RiskapprovalService;
import com.grape.util.Util;
@Service
public class RiskapprovalServiceImpl implements RiskapprovalService{
	private Logger log = LoggerFactory.getLogger(RiskapprovalServiceImpl.class);
	@Autowired
	private MortgagestateMapper mortgagestateMapper;
	@Autowired
	private RiskapprovalformMapper riskapprovalformMapper;
	@Autowired
	private RiskapprovalMapper riskapprovalMapper;
	@Override
	public void insertRiskApprovalform(RiskapprovalformRequest req, FlowHandleResponse res) {
		Riskapprovalform risk = new Riskapprovalform();
		try {
			Util.transferFields(req, risk);
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		List<Mortgagestate> list = req.getList();
		for(int i=0;i<list.size();i++){
			Mortgagestate mort = new Mortgagestate();
			String mortgagestate = list.get(i).getMortgagestate();
			String mortgageid = list.get(i).getMortgageid();
			String mortgagenote = list.get(i).getMortgagenote();
			mort.setMortgageid(mortgageid);
			mort.setMortgagenote(mortgagenote);
			mort.setMortgagestate(mortgagestate);
			mort.setChgdt(new Date());
			mort.setWorkid(req.getWorkid());
			mort.setId(Util.getID());
			mort.setLogid(res.getLogid());
			mortgagestateMapper.insertSelective(mort);
		}
		risk.setChgdt(new Date());
		risk.setLogid(res.getLogid());
		risk.setId(Util.getID());
		riskapprovalformMapper.insertSelective(risk);
		
	}
	@Override
	public void insertRiskApproval(RiskapprovalRequest req, FlowHandleResponse res) {
		Riskapproval risk = new Riskapproval();
		List<Mortgagestate> mortgagestates = new ArrayList<Mortgagestate>();
		mortgagestates = req.getMortgagestates();
		if(mortgagestates!=null && !mortgagestates.isEmpty()){
			for(Mortgagestate mortgagestate:mortgagestates){
				String imagelist = mortgagestate.getCheckstateimage();
				String[] imagename = imagelist.split(",");
				if(imagename.length>0){
					for(int i=0;i<imagename.length;i++){
						Mortgagestate mortstate = new Mortgagestate();
						try {
							Util.transferFields(mortgagestate, mortstate);
							mortstate.setCheckstateimage(imagename[i]);
						} catch (Exception e) {
							e.printStackTrace();
						}
						mortstate.setChgdt(new Date());
						mortstate.setLogid(res.getLogid());
						mortstate.setId(Util.getID());
						mortgagestateMapper.insertSelective(mortstate);
					}
				}
			}
		}
		try {
			Util.transferFields(req, risk);
			risk.setId(Util.getID());
		} catch (Exception e) {
			log.info("转换实体类出错"+e);
		}
		risk.setChgdt(new Date());
		if(res!=null){
			risk.setLogid(res.getLogid());
		}
		riskapprovalMapper.insertSelective(risk);
		
	}
	@Override
	public List<Riskapproval> selectRiskapproval(String id) {
		RiskapprovalExample example = new RiskapprovalExample();
		example.createCriteria().andLogidEqualTo(id);
		return riskapprovalMapper.selectByExample(example);
	}
	@Override
	public Riskapprovalform selectRiskapprovalform(String id) {
		
		return riskapprovalformMapper.selectByPrimaryKey(id);
	}
	@Override
	public List<Mortgagestate> selectMortgagestateByLogid(String id) {
		MortgagestateExample example = new MortgagestateExample();
		example.createCriteria().andLogidEqualTo(id);
		return mortgagestateMapper.selectByExample(example);
	}

}
