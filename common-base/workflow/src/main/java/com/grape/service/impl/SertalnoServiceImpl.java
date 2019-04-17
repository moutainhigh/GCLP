package com.grape.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Sertalno;
import com.grape.model.mapper.base.SertalnoMapper;
import com.grape.service.SertalnoService;

@Service
public class SertalnoServiceImpl implements SertalnoService {
	
	@Autowired
	private SertalnoMapper sertalnoMapper;

	@Override
	public synchronized String genWorkid() throws Exception {
		
		String temp_task_seqno = "";
		Sertalno sertalno = sertalnoMapper.selectByPrimaryKey("WORKID");
        String task_seqno = sertalno.getSeqno();
        temp_task_seqno = "0000000000" + task_seqno;
        temp_task_seqno = temp_task_seqno.substring(temp_task_seqno.length() - 10, temp_task_seqno.length());
        Integer value = Integer.valueOf(task_seqno);
        
        sertalno.setSeqno(""+(++value));
        sertalnoMapper.updateByPrimaryKeySelective(sertalno);
        
		return temp_task_seqno;
	}

}
