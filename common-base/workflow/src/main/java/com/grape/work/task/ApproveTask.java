package com.grape.work.task;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.workflow.Execution;

@Component
@Scope("prototype")
public class ApproveTask extends AbstactRuleTask{

	@Override
	public TaskResult handle(Execution execution) {
		return handle2(execution, "2");
	}

}
