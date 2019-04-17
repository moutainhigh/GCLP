package com.grape.work.task;

import com.grape.workflow.Execution;

public interface WorkTask {
	
	public TaskResult handle(Execution execution);

}
