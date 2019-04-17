package com.grape.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Postloaninfo;
import com.grape.model.db.PostloaninfoExample;
import com.grape.model.db.Repayplan;
import com.grape.model.db.RepayplanExample;
import com.grape.model.db.Repaytoinfo;
import com.grape.model.db.RepaytoinfoExample;
import com.grape.model.mapper.base.PostloaninfoMapper;
import com.grape.model.mapper.base.RepayplanMapper;
import com.grape.model.mapper.base.RepaytoinfoMapper;
import com.grape.service.LoaninfoService;

@Service
public class LoaninfoServiceImpl implements LoaninfoService{

	@Autowired
	private RepaytoinfoMapper repaytoinfoMapper;
	
	@Autowired
	private PostloaninfoMapper postloaninfoMapper;
	
	@Autowired
	private RepayplanMapper repayplanMapper;
	
	@Override
	public Repaytoinfo getRepaytoinfo(String workid) {
		RepaytoinfoExample example = new RepaytoinfoExample();
		example.createCriteria().andWorkidEqualTo(workid).andIsfinilyflgEqualTo("1");
		List<Repaytoinfo> list = repaytoinfoMapper.selectByExample(example);
		if(list!=null&&!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void savePostloaninfo(Postloaninfo postloaninfo) {
		
		PostloaninfoExample example = new PostloaninfoExample();
		Postloaninfo temp = postloaninfoMapper.selectByPrimaryKey(postloaninfo.getWorkid());
		if(temp!=null){
			postloaninfoMapper.updateByPrimaryKeySelective(postloaninfo);
		}else{
			postloaninfoMapper.insert(postloaninfo);
		}
		
	}

	@Override
	public List<Repayplan> getLastRepayplan(String workid) {
		RepayplanExample example = new RepayplanExample();
		example.createCriteria().andWorkidEqualTo(workid);
		example.setOrderByClause(" repaydate asc ");
		return repayplanMapper.selectByExample(example);
	}

}
