package com.grape.util;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

/**
 * @描述 时间转换工具类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 13:37
 */
public class Util {

    private static long tmpID = 0;

    private static String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    private static String DEFAULT_TIME_FORMAT = "HH:mm:ss";

    private static final int YEAR_SIZE = 4;
    private static final int MONTH_SIZE = 2;
    private static final int DATE_SIZE = 2;
    private static final int DATE_SPLIT_SIZE = 1;
    private static final int MAX_HOURS = 23;
    private static final int MAX_MINUTES = 59;
    private static final int MAX_SECONDS = 59;

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

    public static String valueOfDate(Date today) {
        return valueOfDate(today, DEFAULT_DATE_FORMAT);
    }

    public static String valueOfDate(Date today, String fmt) {
        String todayStr;
        SimpleDateFormat format = new SimpleDateFormat(fmt);
        todayStr = format.format(today);
        return todayStr;
    }

    public static Date parseDate(String value) {
        return parseDate(value, DEFAULT_DATE_FORMAT);
    }

    public static Date parseDate(String value, String fmt) {
        if (value != null) {
            value = value.replaceAll("[\\D+]", "");
            try {
                if (value.length() == 8) {
                    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
                    return format.parse(value);
                } else if (value.length() == 14) {
                    SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
                    return format.parse(value);
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public static String getCurrentDate() {
        return valueOfDate(new Date(System.currentTimeMillis()));
    }

    public static String valueOfTime(Date today) {
        return valueOfTime(today, DEFAULT_TIME_FORMAT);
    }

    public static String valueOfTime(Date today, String fmt) {
        String todayStr;
        SimpleDateFormat format = new SimpleDateFormat(fmt);
        todayStr = format.format(today);
        return todayStr;
    }

    public static String getCurrentTime() {
        return valueOfTime(new Date(System.currentTimeMillis()));
    }

    public static String addMonth(String date, int num) {
        String d1 = date.substring(0, 4);
        String d2 = date.substring(4, 6);
        String d3 = date.substring(6, 8);
        GregorianCalendar mortgage = new GregorianCalendar(Integer.parseInt(d1), Integer.parseInt(d2) - 1, Integer.parseInt(d3));
        mortgage.add(Calendar.MONTH, num);
        Date d = mortgage.getTime();
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        String s = format.format(d);
        return s;
    }

    public static String addYear(String date, int num) {
        String d1 = date.substring(0, 4);
        String d2 = date.substring(4, 6);
        String d3 = date.substring(6, 8);
        GregorianCalendar mortgage = new GregorianCalendar(Integer.parseInt(d1), Integer.parseInt(d2) - 1, Integer.parseInt(d3));
        mortgage.add(Calendar.YEAR, num);
        Date d = mortgage.getTime();
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        String s = format.format(d);
        return s;
    }

    public static String addDay(String date, int num) {
        String d1 = date.substring(0, 4);
        String d2 = date.substring(4, 6);
        String d3 = date.substring(6, 8);
        GregorianCalendar mortgage = new GregorianCalendar(Integer.parseInt(d1), Integer.parseInt(d2) - 1, Integer.parseInt(d3));
        mortgage.add(Calendar.DATE, num);
        Date d = mortgage.getTime();
        SimpleDateFormat format = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        String s = format.format(d);
        return s;
    }

    public static boolean isBlank(Object object) {
        if (object == null || "".equals(object) || "".equals(object.toString().trim()) || ((String) object).trim().equalsIgnoreCase("null")) {
            return true;
        }
        return false;
    }

    public static String outObj(Object obj) {
        String ret = "";
        if (obj != null) {
            ret = obj.toString().trim();
            if (ret.equalsIgnoreCase("null")) {
                ret = "";
            }
        }
        return ret;
    }

    public static String getDate(Date today) {
        return getDate(today, null);
    }

    public static String getDate(Date today, String fmt) {
        if (fmt == null) {
            fmt = "yyyyMMdd";
        }
        String todayStr = "";
        SimpleDateFormat format = new SimpleDateFormat(fmt);
        todayStr = format.format(today);
        return todayStr;
    }

    public static String getDate() {
        Date today = new Date();
        return (getDate(today));
    }

    public static String getDate(String frmt) {
        Date today = new Date();
        String todayStr = "";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        todayStr = format.format(today);
        frmt = replaceAll(frmt, "yyyy", todayStr.substring(0, 4));
        frmt = replaceAll(frmt, "YYYY", todayStr.substring(0, 4));
        frmt = replaceAll(frmt, "MM", todayStr.substring(4, 6));
        frmt = replaceAll(frmt, "mm", todayStr.substring(4, 6));
        frmt = replaceAll(frmt, "DD", todayStr.substring(6, 8));
        frmt = replaceAll(frmt, "dd", todayStr.substring(6, 8));
        return frmt;
    }

    public static String getTime() {
        Calendar calendar = Calendar.getInstance();
        return (getTime(calendar));
    }

    public static String getTime(Calendar calendar) {
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

    public static String replaceAll(String srcString, String matcher, String replaceString) {
        String str = Pattern.compile(matcher).matcher(srcString).replaceAll(replaceString);
        return str;
    }

    public static Date maxDate(String dateStr) {
        Calendar cal = Calendar.getInstance();
        cal.setLenient(true);
        cal.set(Integer.parseInt(dateStr.substring(0, YEAR_SIZE)),
                Integer.parseInt(dateStr.substring(YEAR_SIZE + DATE_SPLIT_SIZE, YEAR_SIZE + DATE_SPLIT_SIZE + MONTH_SIZE)) - 1,
                Integer.parseInt(dateStr.substring(YEAR_SIZE + DATE_SPLIT_SIZE + MONTH_SIZE + DATE_SPLIT_SIZE, YEAR_SIZE + DATE_SPLIT_SIZE + MONTH_SIZE + DATE_SPLIT_SIZE + DATE_SIZE)), MAX_HOURS, MAX_MINUTES, MAX_SECONDS);
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }

    public static Date minDate(String dateStr) throws ParseException {
        DateFormat df = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        df.setLenient(true);
        return df.parse(dateStr);
    }

    public static String fillSeqno(final String str) {
        final int length = 10;
        String tmp = "";
        if (outObj(str).length() > 0) {
            for (int i = 0; i < length; i++) {
                tmp += "0";
            }
            return (tmp + str).substring(str.length());
        } else {
            return str;
        }
    }
    
   /* public static Map<String,Object> getOrgMap2(List<Organization> list) {
        Map<String,Object> orgDropdown = new LinkedHashMap<String,Object>();
		 orgDropdown.put("self", "本机构");
		 if(list!=null&&list.size()>0){
		     orgDropdown.put("suball", "全部下属机构");
		 }
		for (int i = 0; i < list.size(); i++) {
					Organization org = list.get(i);
					orgDropdown.put(org.getBnkno(), org.getShortnm()+"["+org.getBnkno()+"]");
		}
		return orgDropdown;
	}*/
    
   /* public static Map<String,String> getCodeTable(HttpServletRequest request,String codeTableName){
//		 ActionContext actionContext = ActionContext.getContext(); 
    	 Map<String, Map<String, String>> codeTableMap = (Map<String, Map<String, String>>)request.getServletContext().getAttribute(ActionContants.A_CODETABLE_MAP);
//		 Map<String, Map<String, String>> codeTableMap= (Map<String, Map<String, String>>) actionContext.getApplication().get(A_CODETABLE_MAP);
         return  (TreeMap<String, String>) codeTableMap.get(codeTableName);
	}*/

    public static String date2string(Date date) {
        return date2String(date, "yyyyMMdd");
    }

    public static String date2String(Date date, String pattern) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat(pattern).format(date);
    }

    public static void transferFields(Object source, Object target) throws Exception {
        Field[] fields = source.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            String name = fields[i].getName();
            fields[i].setAccessible(true);
            Field targetField = null;
            try {
                targetField = target.getClass().getDeclaredField(name);
            } catch (Exception e) {
                continue;
            }
            targetField.setAccessible(true);
            targetField.set(target, fields[i].get(source));
        }
    }

    public static BigDecimal getBigDecimal(Object value) {
        BigDecimal ret = null;
        if (value != null) {
            if (value instanceof BigDecimal) {
                ret = (BigDecimal) value;
            } else if (value instanceof String) {
                ret = new BigDecimal((String) value);
            } else if (value instanceof BigInteger) {
                ret = new BigDecimal((BigInteger) value);
            } else if (value instanceof Number) {
                ret = new BigDecimal(((Number) value).doubleValue());
            } else {
                throw new ClassCastException("Not possible to coerce [" + value + "] from class " + value.getClass() + " into a BigDecimal.");
            }
        }
        return ret;
    }
}
