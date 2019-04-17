package com.grape.workflow.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.grape.security.Util;

/**
 * 
 * 流程工具类
 * @author lijl
 * @version 1.0 - 2015年5月7日
 */
public class WorkUtil {
	
	private static Logger logger = LoggerFactory.getLogger(WorkUtil.class);
	
	//private static long tmpID = 0;
	
	private static Set<String> mOperator = new HashSet<String>();//判定算术运算的操作符
	static{
		mOperator.add("+");
		mOperator.add("-");
		mOperator.add("*");
		mOperator.add("/");
		mOperator.add(">");
		mOperator.add(">=");
		mOperator.add("<");
		mOperator.add("<=");
		mOperator.add("=");
		mOperator.add(":");
		mOperator.add("n");
		mOperator.add("u");
		mOperator.add("m");
	}

	private WorkUtil(){}
	
	/**
	 * 
	 * 将日期格式化成yyyyMMdd
	 * lijl
	 * 1.0 - 2015年5月7日
	 * @param today 日期
	 * @return
	 */
	public static String getDate(Date today) {
		String todayStr = "";
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		todayStr = format.format(today);
		return todayStr;
	}

	/**
	 * 
	 * 日期 如：20150101
	 * lijl
	 * 1.0 - 2015年5月7日
	 * @return
	 */
	public static String getDate() {
		Date today = new Date();
		return (getDate(today));
	}
    /**
     * 
     * 时间 如：120000
     * lijl
     * 1.0 - 2015年5月7日
     * @return
     */
	public static String getTime() {
		Calendar calendar = Calendar.getInstance();
		return (getTime(calendar));
	}

	private static String getTime(Calendar calendar) {
		String now = "";

		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);

		if (hour > 9)
			now = "" + hour;
		else
			now = "0" + hour;

		if (minute > 9)
			now += minute;
		else
			now += "0" + minute;

		if (second > 9)
			now += second;
		else
			now += "0" + second;

		return now;
	}

//	/**
//	 * 
//	 * 唯一的ID标识
//	 * lijl
//	 * 1.0 - 2015年5月7日
//	 * @return
//	 */
//	public synchronized static String getID() {
//		long ltime = 0;
//		ltime = Long.valueOf(
//				new SimpleDateFormat("yyMMddHHmmssSSS").format(new Date())
//						.toString()).longValue() * 10000;
//		if (tmpID < ltime) {
//			tmpID = ltime;
//		} else {
//			tmpID = tmpID + 1;
//			ltime = tmpID;
//		}
//		return String.valueOf(ltime);
//	}

	public static Object execute(String expression) throws ScriptException {

		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		return engine.eval(expression);
	}
	
	public static String replaceWithParams(Map<Object,Object> map, String expression) throws Exception {
		StringBuffer resultExpr = new StringBuffer("");
		Pattern pattern = Pattern.compile("\\{[^}]+\\}");
		Matcher matcher = pattern.matcher(expression);
		while (matcher.find()) {
			String group = matcher.group();
			group = group.substring(2, group.length() - 2).trim();
			String value = null;
			Object obj =  map.get(group);
			if(obj instanceof Integer || 
					obj instanceof Double || 
					obj instanceof Float || 
					obj instanceof Long ||
					obj instanceof Short ||
					obj instanceof Boolean
			){
				value = obj.toString();
			}else{
				value = "'" + obj + "'";
				matcher.appendReplacement(resultExpr, value);
			}
		}
		matcher.appendTail(resultExpr);
		return resultExpr.toString();
	}

	public static boolean executeExpression(Map<Object,Object> map, String expression) throws Exception {
		StringBuffer resultExpr = new StringBuffer("");
		Pattern pattern = Pattern.compile("\\{[^}]+\\}");
		Matcher matcher = pattern.matcher(expression);
		while (matcher.find()) {
			String group = matcher.group();
			group = group.substring(2, group.length() - 2).trim();
			String value = null;
			Object obj = null;
			
			if(group.startsWith("fn:")){
				String methodName = group.substring(3,group.lastIndexOf("("));
				String paramNames = group.substring(group.indexOf("(")+1,group.lastIndexOf(")"));
				String[] params = "".equals(paramNames)?null:paramNames.split(",");
				String[] values = null==params?null:new String[params.length];
				if(params!=null){
					for (int i = 0; i < params.length; i++) {
						String param = params[i].replaceAll("'", "");
						Object temp = map.get(param);
						if(temp!=null){
							values[i] = temp.toString();
						}else{
							values[i] = null;
						}
					}
					
					Method method = WorkUtil.class.getDeclaredMethod(methodName, new Class[]{String[].class});
					obj = method.invoke(null, new Object[]{values});
				}
			}else{
				obj = map.get(group);
			}
			
			if(obj instanceof Integer || 
					obj instanceof Double || 
					obj instanceof Float || 
					obj instanceof Long ||
					obj instanceof Short ||
					obj instanceof Boolean
			){
				value = obj.toString();
			}else{
				boolean isString = true;
				int groupStart = matcher.start();
				String operator = null;
				
				operator = findBeforeOperator(groupStart,expression);
				isString = !mOperator.contains(operator);
				if(isString){
					isString = operator.contains(":")?!operator.contains("num:"):true;
				}
				if(isString){
					int groupEnd = matcher.start()+group.length()+4;
					operator = findAfterOperator(groupEnd,expression);
					isString = !mOperator.contains(operator);
				}
				
				if(isString){
					value = "'" + obj + "'";
				}else{
					if(obj==null||"".equals(obj.toString().trim())){
						value = "0";
					}else{
						value = ""+obj;
					}
				}
				
			}
			
			if(value==null||"".equals(value)){
				throw new Exception("找不到对应的值："+group);
			}
			matcher.appendReplacement(resultExpr, value);
		}
		matcher.appendTail(resultExpr);
		try{
			Boolean result = (Boolean) execute(resultExpr.toString().replaceAll("(num:)", ""));
			return result.booleanValue();
		}catch(Exception e){
			logger.info("表达式："+resultExpr);
			throw e;
		}
	}
	
	private static String findBeforeOperator(int start, String expression) {
		start = start-1;
		if(start<0){
			return "";
		}else{
			String oper = expression.charAt(start)+"";
			if(mOperator.contains(oper)){
				return findBeforeOperator(start,expression)+expression.charAt(start);
			}else{
				return "";
			}
		}
	}
	
	private static String findAfterOperator(int end, String expression) {
		end = end+1;
		if(end>expression.length()){
			return "";
		}else{
			String oper = expression.charAt(end-1)+"";
			if(mOperator.contains(oper)){
				return expression.charAt(end-1)+findAfterOperator(end,expression);
			}else{
				return "";
			}
		}
	}

	public static Set<String> getExpressionRuleGroup(String expression) throws Exception {
		Pattern pattern = Pattern.compile("\\{[^}]+\\}");
		Matcher matcher = pattern.matcher(expression);
		Set<String> list = new HashSet<String>();
		while (matcher.find()) {
			String group = matcher.group();
			group = group.substring(2, group.length() - 2).trim();
			
			if(group.startsWith("fn:")){
				group = group.substring(group.indexOf("(")+1,group.lastIndexOf(")"));
				group = group.replaceAll("'", "");
				String[] temp = group.split(",");
				if(temp!=null){
					for (int i = 0; i < temp.length; i++) {
						if(temp[i].contains(".")){
							list.add(temp[i].substring(0, temp[i].indexOf(".")));
						}
					}
				}
			}else{
				if(group.contains(".")){
					list.add(group.substring(0, group.indexOf(".")));
				}
			}
			
		}
		return list;
	}
	
	public static String takeFirstVarName(String expression) throws Exception{
		String varname = null;
		Pattern pattern = Pattern.compile("(?<=\\{)(.*)(?=\\})");
		Matcher matcher = pattern.matcher(expression);
		if(matcher.find()){
			varname = matcher.group();
		}
		return varname;
	}
	
	/**
	 * 判断字符串是否为空  
	 * 
	 * lijl
	 * 1.0 - 2015年5月7日
	 * @param object
	 * @return
	 */
    public static boolean isBlank(Object object) {
        if (object == null || "".equals(object) || "".equals(object.toString().trim()) || ((String) object).trim().equalsIgnoreCase("null")) {
            return true;
        }
        return false;
    }
    
    private static long tmpID = 0;
    public synchronized static String getID() {
        long ltime = 0;
        ltime = Long.valueOf(new SimpleDateFormat("yyMMddHHmmssSSS").format(new Date()).toString()).longValue() * 10000;
        if (tmpID < ltime) {
            tmpID = ltime;
        } else {
            tmpID = tmpID + 1;
            ltime = tmpID;
        }
        return String.valueOf(ltime);
    }
    
    public static Map<Object, Object> getDataFromBean(String prefix, Object target) {
    	prefix = prefix==null?"":(prefix+".");
		Map<Object,Object> map = new HashMap<Object,Object>();
		if(target!=null){
			try{
				Class<?> clasz = target.getClass();
				Field[] fields = clasz.getDeclaredFields();
				for (Field field : fields) {
					field.setAccessible(true);
					map.put(prefix+field.getName(), field.get(target));
				}
			}catch(Exception e){
				logger.info("加载["+target+"]数据出错",e);
			}
		}
		return map;
	}
    
    public static Map<Object, Object> getDataFromBean(Object target) {
		return getDataFromBean(null, target);
	}
    
    public static String diffm(String[] value){
    	String m1 = assemblyMonthStr(value[0]);
    	String m2 = assemblyMonthStr(value[1]);
    	
    	Date day1 = Util.parseDate(m1, "yyyyMMdd");
    	Date day2 = Util.parseDate(m2, "yyyyMMdd");
    	
    	Integer monthNum = 0;
        Integer yearNumber = 0;
        Calendar startCalendar = Calendar.getInstance(); 
        Calendar endCalendar = Calendar.getInstance();
       
        startCalendar.setTime(day1); 
        endCalendar.setTime(day2);
       
        yearNumber = startCalendar.get(Calendar.YEAR) - endCalendar.get(Calendar.YEAR);
        monthNum = startCalendar.get(Calendar.MONTH) - endCalendar.get(Calendar.MONTH);
       
    	return ""+(yearNumber*12 + monthNum);
    }

	private static String assemblyMonthStr(String m1) {
		if(m1!=null){
			if(m1.contains(" ")){
				m1 = m1.substring(0, m1.indexOf(" "));
			}
			m1 = m1.replaceAll("\\D+", "");
			if(m1.length()==8){
				return m1;
			}
		}
		return null;
	}
	
	public static String formatDate(String[] value){
		Date day1 = Util.parseDate(assemblyMonthStr(value[0]), "yyyyMMdd");
		return Util.getDate(day1, "yyyy年MM月dd日");
	}
}
