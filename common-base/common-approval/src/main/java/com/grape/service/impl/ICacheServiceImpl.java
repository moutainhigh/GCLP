package com.grape.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grape.model.db.Codetable;
import com.grape.model.db.CodetableExample;
import com.grape.model.mapper.base.CodetableMapper;
import com.grape.service.ICacheService;
import com.grape.util.RedisUtils;

/** 
* @author cwc
* @version 创建时间：2018年12月26日 上午10:54:09  
*/
@Service
public class ICacheServiceImpl implements ICacheService{
	@Autowired
	private CodetableMapper codetableMapper;
	@Override
	public void initDictCache() {
		CodetableExample example = new CodetableExample();
		example.createCriteria();
		List<Codetable> codeTableList = codetableMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(codeTableList)) {
			for (Codetable codetable : codeTableList) {
				if (null != codetable) {
					if (StringUtils.isNotBlank(codetable.getCoddes())
							&& StringUtils.isNotBlank(codetable.getCodtyp())) {
						RedisUtils.set(codetable.getCodtyp(),
								codetable.getCoddes());
					}
				}
			}
		}
	}

}
