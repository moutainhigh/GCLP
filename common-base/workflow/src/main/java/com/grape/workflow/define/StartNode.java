package com.grape.workflow.define;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.grape.model.db.Nodepage;
import com.grape.model.db.Noderole;
import com.grape.model.db.Productnode;

@Component()
@Scope("prototype")
public class StartNode extends Executable{
	private String to;
	private Map<String,StartTo> starttos = new HashMap<String,StartTo>();
	
	public void init(Map<String,Menu> menumap,Productnode productnode,List<Nodepage> nodepages,List<Noderole> noderoles) throws Exception {
		super.init(menumap,productnode,nodepages,noderoles);
		this.to = productnode.getTonode();
//		this.starttos = new HashMap<String,StartTo>();
//		Iterator<Element> it = element.elementIterator("startto");
//		StartTo startto = null;
//		Element el = null;
//		String key;
//		while (it.hasNext()) {
//			el = it.next();
//			startto = new StartTo(el);
//			key = startto.getName();
//			if(key==null){
//				throw new Exception(this.getName()+"的指向节点名称为空");
//			}
//			starttos.put(key,startto);
//		}
		validRole();
	}

	public String getTo() {
		return to;
	}

//	public Map<String,StartTo> getStartTo(){
//		return starttos;
//	}

	private void validRole() throws Exception {
		if(null != getRoles()){
			if(!getRoles().contains(Workflow.ALL_OF_ROLE)){
				for (int i = 0; i < roles.size(); i++) {
					if(!Workflow.getInstance().getRoles().contains(roles.get(i))){
						throw new Exception("节点："+this.getId()+"，找不到的角色："+roles.get(i));
					}
				}
			}
		}else{
			for(StartTo startto:starttos.values()){
				if(startto.getRoles()!=null && !Workflow.getInstance().getRoles().contains(startto.getRoles())){
					throw new Exception("节点："+this.getId()+"，找不到的角色："+startto.getRoles());
				}
			}
		}
	}
	
	
	public StartTo getStartTo(String transName){
		return starttos.get(transName);
	}

	@Override
	public List<String> getRoles(String transName) {
		return getStartTo(transName).getRoles();
	}
}
