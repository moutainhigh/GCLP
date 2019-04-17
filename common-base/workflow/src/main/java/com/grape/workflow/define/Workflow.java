package com.grape.workflow.define;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grape.WorkflowApplication;
import com.grape.model.db.Page;
import com.grape.model.db.Product;
import com.grape.service.PageService;
import com.grape.service.ProductService;
import com.grape.workflow.service.RoleService;
import com.grape.workflow.util.WorkUtil;
import com.grape.model.db.Workitem;

@Component
public final class Workflow{
	/**
	 * 流程实例
	 */
	private Map<String, Process> processes = new HashMap<String, Process>();;
	/**
	 * 表达式
	 */
	private Map<String, String> expressions = new HashMap<String, String>();;
	/**
	 * 角色
	 */
	private Set<String> roles;
	/**
	 * 状态
	 */
	private Map<Integer, String> states;
	/**
	 * 单例 Workflow instance
	 */
	private static Workflow instance_ = null;

	public final static String OPER_READ = "READ";
	public final static String OPER_START = "START";
	/**
	 * 检出
	 */
	public final static String OPER_CHECKOUT = "CHECKOUT";
	/**
	 * 取消检出
	 */
	public final static String OPER_CHECKIN = "CHECKIN";
	/**
	 * 退回
	 */
	public final static String OPER_FLOWBACK = "退回";
	/**
	 * 归还/返回
	 */
	public final static String OPER_RETURN = "归还任务";
	/**
	 * 授权
	 */
	public final static String OPER_GRANT = "授权";
	/**
	 * 转办
	 */
	public final static String OPER_TRANSFERTO = "转办";
	/**
	 * 申诉
	 */
	public final static String OPER_APPEAL = "申诉";
	/**
	 * 业务取消
	 */
	public final static String OPER_CANCEL = "业务取消";
	/**
	 * 复议
	 */
	public final static String OPER_REVIEW = "复议";
	/**
	 * 派单
	 */
	public final static String OPER_REASSIGN = "REASSIGN";
	public final static String STATE_READY = "1";
	public final static String STATE_HANDLE = "2";
	public final static String STATE_END = "0";
	
	//旧流程派单方式,保留
	public final static String ASSIGN_ROL = "ROL";
	public final static String ASSIGN_PRE = "PRE";
	public final static String ASSIGN_ONE = "ONE";
	//贷眼特色派单方式
	public final static String ASSIGN_SELECT = "S";//前端选择
	public final static String ASSIGN_USERID = "U";//默认业务员
	public final static String ASSIGN_USERASSIGN = "A";//专员派单
	public final static String ASSIGN_ROLES = "R";//角色共享
	
	public final static String ALL_OF_ROLE = "ALL";
	public final static String DEFAULT_FORK = "0";
	public final static String DEFAULT_BRANCH = "0";

	
	private static Logger logger = LoggerFactory.getLogger(Workflow.class);
	
	@Autowired
	private PageService pageService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private ProductService productService;

	public void init() throws Exception {
		instance_ = this;
		this.roles = roleService.getAllRoles();

		// 加载产品流程
		loadProcesses();

		String processesStr = "";
		Iterator<String> iter = processes.keySet().iterator();
		while (iter.hasNext()) {
			if (processesStr.length() > 0) {
				processesStr += ',';
			}
			processesStr += processes.get(iter.next()).getName();
		}
		logger.info("当前工作流装载了" + processes.size() + "个流程：" + processesStr);
	}

	protected Map<String, String> getExpressions() {
		return expressions;
	}

	protected Set<String> getRoles() {
		return roles;
	}

	protected static String transToExpr(String porinter) {
		String expr = porinter;
		if (porinter != null && porinter.startsWith("$")) {
			porinter = porinter.substring(1);
			expr = getInstance().getExpressions().get(porinter);
		}
		return expr;
	}

	public static Workflow getInstance() {
		if (instance_ == null)
			throw new IllegalStateException();

		return instance_;
	}

	public static Process getProcess(String processId) {
		return instance_.processes.get(processId);
	}

	public static Process getProcess(Workitem workItem) {
		return Workflow.getProcess(workItem.getWorkproc().getProcess());
	}

	public static Node getNode(Workitem workItem) {
		return getProcess(workItem).getNode(workItem.getNode());
	}

	public static Node getNode(String processId, String nodeId) {
		return getProcess(processId).getNode(nodeId);
	}

	public static boolean isStart(Node node) {
		return (node instanceof StartNode);
	}

	public static boolean isTask(Node node) {
		return (node instanceof TaskNode);
	}

	public static boolean isFork(Node node) {
		return (node instanceof ForkNode);
	}

	public static boolean isEnd(Node node) {
		return (node instanceof EndNode);
	}

	public static boolean isExecutable(Node node) {
		return (node instanceof Executable);
	}

	public static String getStateName(int stateId) {
		return instance_.states.get(stateId);
	}

	public Iterator<Entry<String, Process>> getProcessIterator() {
		return processes.entrySet().iterator();
	}

	public Map<String, Menu> readMenus(List<Page> pages) throws Exception {
		Map<String, Menu> menus = null;
		if (pages != null) {
			menus = new HashMap<String, Menu>();
			Menu menu = null;
			for (Page page : pages) {
				menu = new Menu(page);
				if (menu.getId().contains("#")) {
					throw new Exception("包含特殊字符#");
				}
				menus.put(menu.getId(), menu);
			}
		}
		return menus;
	}

	public void loadProcesses() throws Exception {
		List<Product> products = productService.getAllProduct();
		
		Map<String, Menu> menusMap = pageService.getMenuForPages();

		if(products!=null&&!products.isEmpty()){
			for (int i = 0; i < products.size(); i++) {
				Product product = products.get(i);

				Process process = WorkflowApplication.instance.getBean(Process.class);

				process.init(menusMap, product);
				
				processes.put(process.getId(), process);
			}
		}
		
	}

}
