package com.grape.service;

import java.util.List;

import com.grape.model.db.Postloaninfo;
import com.grape.model.db.Repayplan;
import com.grape.model.db.Repaytoinfo;

public interface LoaninfoService {
	
	/**
	 * 获取最终批复结果
	 * @param workid 流水号
	 * @return 最终批复信息记录
	 */
	Repaytoinfo getRepaytoinfo(String workid);
	
	void savePostloaninfo(Postloaninfo postloaninfo);
	
	List<Repayplan> getLastRepayplan(String workid);

}
