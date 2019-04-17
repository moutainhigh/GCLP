package com.grape.service;

import com.grape.model.db.Mattersattention;

public interface MattersAttentionservice {

	Mattersattention selectMattersattention(String workid);

	void insertMattersattention(Mattersattention mattersAttention) ;

}
