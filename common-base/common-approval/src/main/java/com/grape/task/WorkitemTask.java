package com.grape.task;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.grape.model.db.Doctask;
import com.grape.model.db.Msgadditional;
import com.grape.model.db.Msgmaininfo;
import com.grape.model.db.MsgmaininfoExample;
import com.grape.model.db.Noderole;
import com.grape.model.db.NoderoleExample;
import com.grape.model.db.Productnode;
import com.grape.model.db.Userrole;
import com.grape.model.db.UserroleExample;
import com.grape.model.db.Workitem;
import com.grape.model.mapper.base.MsgadditionalMapper;
import com.grape.model.mapper.base.MsgmaininfoMapper;
import com.grape.model.mapper.base.NoderoleMapper;
import com.grape.model.mapper.base.UserroleMapper;
import com.grape.service.DoctaskService;
import com.grape.service.ProductnodeService;
import com.grape.service.WorkitemService;
import com.grape.util.Util;

@Component
public class WorkitemTask {
	@Autowired
	private WorkitemService workitemService;
	
	@Autowired
	private ProductnodeService productnodeService ;
	
	@Autowired
	private MsgmaininfoMapper msgmaininfoMapper ;
	@Autowired
	private NoderoleMapper noderoleMapper;
	@Autowired
	private MsgadditionalMapper msgadditionalMapper;
	@Autowired
	private DoctaskService doctaskService;
	@Autowired
	private UserroleMapper useroleMapper;
	
	//SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  

	@Scheduled(cron="0 0 17 * * ? ")//每天17点运行审批超时任务
	public void workitemSelect() {
		//获取每个节点的超时时间
		List<Productnode> listpro = productnodeService.selectProcessDate() ; 
		//消息主表
		Msgmaininfo msg = new Msgmaininfo() ;
		//消息状态表
		Msgadditional msgadd = new Msgadditional();
		for (Productnode productnode : listpro) {
			String node = productnode.getNodeid() ;
			//获取处于待处理或处理中状态的流水信息
			List<Workitem> workitem = workitemService.selectDate(node) ;
			if(workitem.size()>0){
				for(int i=0;i<workitem.size();i++){
					Date starttime = workitem.get(i).getStarttime() ;
					String procdate = productnode.getProcesstime();
					int protime=0;
					if(procdate!=null){
						protime = Integer.parseInt(procdate) ;
					}
					//获取审批开始时间加上节点规定审批时间后的时间
					Long date1 = starttime.getTime() + protime * 24 * 60 * 60 * 1000L ;
					//如果已经超时则发送消息
					if(new Date().getTime() > date1) {	
						if(productnode.getAssignmode().equals("S") || productnode.getAssignmode().equals("A") || productnode.getAssignmode().equals("U")){
							//如果该节点为需要选择审批人的节点（S）或者是按照有权审批人（A），则只对该审批人发送消息
							if(productnode.getAssignmode().equals("S") || productnode.getAssignmode().equals("A")){
								msg.setRecuser(workitem.get(i).getAuthuserid());
								msgadd.setEvaltime(workitem.get(i).getAuthuserid());
							}else{//如果节点为业务员审批（U），则从流水表查出该笔流水业务员员工号，给其插入
								Doctask doctask = doctaskService.queryByWorkid(workitem.get(i).getWorkid());								
								msg.setRecuser(doctask.getUserid());
								msgadd.setEvaltime(doctask.getUserid());
							}
							String id = Util.getID();
							msg.setId(id);
							msg.setContent("您有一个审批已超时，请尽快处理。");
							msg.setNode(productnode.getNodeid());
							msg.setMsgtype("05");
							msg.setWorkid(workitem.get(i).getWorkid());
							msg.setChgdt(new Date());
							msgadd.setId(Util.getID());
							msgadd.setRefid(id);
							msgadd.setState("0");
							msgadd.setChgdt(new Date());
							MsgmaininfoExample msgexample = new MsgmaininfoExample();
							msgexample.createCriteria().andWorkidEqualTo(workitem.get(i).getWorkid()).andNodeEqualTo(productnode.getNodeid()).andMsgtypeEqualTo("05").andRecuserEqualTo(workitem.get(i).getAuthuserid());
							List<Msgmaininfo> mainlist = msgmaininfoMapper.selectByExample(msgexample);
							//先判断该消息之前是否有发送过，如果发送过，且该消息还未处理，则不再发送，如果已点击消息则只更新消息状态
							if(!mainlist.isEmpty()){
								for(int m=0;m<mainlist.size();m++){
									String mainid = mainlist.get(m).getId();
									Msgadditional msgaddition = msgadditionalMapper.selectByPrimaryKey(mainid);
									if(msgaddition!=null){
										if(msgaddition.getState().equals("1")){
											msgaddition.setState("0");
											msgadditionalMapper.updateByPrimaryKey(msgaddition);
										}
									}
								}
							}else{
								msgadditionalMapper.insert(msgadd);
								msgmaininfoMapper.insert(msg) ;
							}
						}else if (productnode.getAssignmode().equals("R")){//如果该节点为按角色分配任务，则查出拥有该角色的所有审批人。
							NoderoleExample example = new NoderoleExample();
							example.createCriteria().andNodeidEqualTo(node);
							List<Noderole> list = noderoleMapper.selectByExample(example);
							if(!list.isEmpty()){
								String role = list.get(0).getRoleid();
								UserroleExample userexample = new UserroleExample();
								userexample.createCriteria().andRoleidEqualTo(role);
								List<Userrole> rolelist = useroleMapper.selectByExample(userexample);
								if(rolelist.size()>0){
									for(Userrole userrole:rolelist){
										Msgmaininfo msgmaininfo = new Msgmaininfo() ;
										Msgadditional msgadditional = new Msgadditional();
										String id = Util.getID();
										msgmaininfo.setId(id);
										msgmaininfo.setContent("您有一个审批已超时，请尽快处理。");
										msgmaininfo.setMsgtype("05");
										msgmaininfo.setNode(productnode.getNodeid());
										msgmaininfo.setWorkid(workitem.get(i).getWorkid());
										msgmaininfo.setRecuser(userrole.getWorkerid());
										msgmaininfo.setChgdt(new Date());
										msgadditional.setEvaltime(userrole.getWorkerid());
										msgadditional.setId(Util.getID());
										msgadditional.setRefid(id);
										msgadditional.setState("0");
										msgadditional.setChgdt(new Date());
										MsgmaininfoExample msgexample = new MsgmaininfoExample();
										msgexample.createCriteria().andWorkidEqualTo(workitem.get(i).getWorkid()).andNodeEqualTo(productnode.getNodeid()).andMsgtypeEqualTo("05").andRecuserEqualTo(userrole.getWorkerid());
										List<Msgmaininfo> mainlist = msgmaininfoMapper.selectByExample(msgexample);
										//先判断该消息之前是否有发送过，如果发送过，且该消息还未处理，则不再发送
										if(!mainlist.isEmpty()){
											for(int m=0;m<mainlist.size();m++){
												String mainid = mainlist.get(m).getId();
												Msgadditional msgaddition = msgadditionalMapper.selectByPrimaryKey(mainid);
												if(msgaddition!=null){
													if(msgaddition.getState().equals("1")){
														msgaddition.setState("0");
														msgadditionalMapper.updateByPrimaryKey(msgaddition);
													}
												}
											}
										}else{
											msgadditionalMapper.insert(msgadditional);
											msgmaininfoMapper.insert(msgmaininfo) ;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
