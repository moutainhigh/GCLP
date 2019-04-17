package com.grape.service;

import java.util.List;

import com.grape.controller.request.AccessRuleFormRequest;
import com.grape.controller.request.AccessRuleRequest;
import com.grape.controller.request.AccessRuleStateRequest;
import com.grape.controller.request.IdRequest;
import com.grape.model.db.Accessrule;

public interface AccessRuleService {

	List<Accessrule> selectAccessRule(AccessRuleRequest req);

	void insertAccessRule(AccessRuleFormRequest req);

	void deleteAccessRule(IdRequest req);

	Accessrule selectAccessRuleById(IdRequest req);

	void updateAccessRule(AccessRuleFormRequest req);

	void activeAccessRule(AccessRuleStateRequest req);

	Integer selectAccessRuleCount(AccessRuleRequest req);

}
