package com.grape.service;


import java.util.List;

import com.grape.model.db.Exchannel;

public interface ExchannelService {
	
	Exchannel findExchannelByChannelno(String channelno);
	
	/**
	 * 查询所有开启的评估公司
	 * @return
	 */
	List<Exchannel> findExchannelList();
}
