package com.grape.workflow.define;

import com.grape.model.db.Nodepage;
import com.grape.model.db.Page;

public class Menu {
	private final String id;
	private final String name;
	private final String url;
	private final String workOnly; // 只在工作列表才出现
	private final String target;

	public Menu(Page page) throws Exception {
		id = page.getPageid();
		name = page.getPagename();
		workOnly = null;
		target = null;
		url = null;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}
	
	public String getTarget(){
		return target;
	}

        public String getWorkOnly() {
                return workOnly;
        }
	
}
