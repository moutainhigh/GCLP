package com.grape.security;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Util {
	private static long tmpID = 0;
	static Logger logger = LogManager.getLogger(Util.class);
	private static final int YEAR_SIZE = 4;
	private static final int MONTH_SIZE = 2;
	private static final int DATE_SIZE = 2;
	private static final int DATE_SPLIT_SIZE = 1;
	private static final int MAX_HOURS = 23;
	private static final int MAX_MINUTES = 59;
	private static final int MAX_SECONDS = 59;
	private static String formatstr = "yyyy-MM-dd";
	private static final String webSign = "90"; 

	public static String getDate(Date today) {
		String todayStr = "";
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
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

	public synchronized static String getID() {
		long ltime = 0;
		ltime = Long.valueOf(new SimpleDateFormat("yyMMddHHmmssSSS")
				.format(new Date()).toString()).longValue() * 10000;
		if (tmpID < ltime) {
			tmpID = ltime;
		} else {
			String id = String.valueOf(tmpID);
			String subid = id.substring(17,19);
			Integer flg = Integer.parseInt(subid);
			if(flg+1 > 99)
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					logger.info("getId方法休眠被打断",e);
				}
			tmpID = tmpID + 1;
			ltime = tmpID;
		}

		String templtime = String.valueOf(ltime);
		String subltime1 =templtime.substring(0,15);
		String subltime2 = templtime.substring(17,19);
		templtime = subltime1+webSign+subltime2;
		return String.valueOf(templtime);
	}

	public static Map<?,?> getOrgMap(List<Map<?,?>> list) {
		Map<Object,Object> orgDropdown = new LinkedHashMap<Object,Object>();
		orgDropdown.put("self", "本机构");
		orgDropdown.put("suball", "全部下属机构");
		for (int i = 0; i < list.size(); i++) {
			Map<?,?> map = list.get(i);
			orgDropdown.put(map.get("BNKNO"), map.get("SHORTNM")+"["+map.get("BNKNO")+"]");
		}
		return orgDropdown;
	}


	public static String outObj(Object obj) {
		String ret = "";
		if (obj != null) {

			ret = ((String) obj).trim();
			if (((String) obj).trim().equalsIgnoreCase("null"))
				ret = "";

		}
		return ret;
	}
	public static boolean isBlank(Object object) {
		if (object == null || "".equals(object) || "".equals(object.toString().trim()) || ((String) object).trim().equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}

	public static String fillSeqno(final String str) {
		//final int length = WorkItem.APPNO_SIZE;
		final int length = 10;
		String tmp = "";
		if (outObj(str).length() > 0) {
			for (int i = 0; i < length; i++) {
				tmp += "0";
			}
			return (tmp + str).substring(str.length());
		} else
			return str;
	}
	public static int compare(String date1, String date2) {
		SimpleDateFormat d = new SimpleDateFormat("yyyyMMdd");
		try {
			return d.parse(date1).compareTo(d.parse(date2));
		} catch (ParseException e) {
			return 0;
		}
	}

	/**
	 * 返回 日期 在 +或者-  月数 后的日期
	 * @param date 日期
	 * @param num  月数
	 * @return
	 */
	public static String addMonth(String date, int num) {
		String d1 = date.substring(0, 4);
		String d2 = date.substring(4, 6);
		String d3 = date.substring(6, 8);
		GregorianCalendar mortgage = new GregorianCalendar(
				Integer.parseInt(d1), Integer.parseInt(d2) - 1, Integer
				.parseInt(d3));
		mortgage.add(Calendar.MONTH, num);
		Date d = mortgage.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String s = format.format(d);
		return s;
	}

	/**
	 * 返回 日期 在 +或者-  天数 后的日期
	 * @param date 日期
	 * @param amount 天数
	 * @return
	 */
	public static String addDays(String date, int amount) {
		GregorianCalendar c = new GregorianCalendar(Integer.parseInt(date
				.substring(0, 4)), Integer.parseInt(date.substring(4, 6)) - 1,
				Integer.parseInt(date.substring(6, 8)));
		c.add(GregorianCalendar.DAY_OF_MONTH, amount);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return format.format(c.getTime());
	}


	/**
	 * <p>返回两个日期之间的单位间隔数</p>
	 * @param a java.util.Date
	 * @param b java.util.Date
	 * @return int 间隔数
	 */
	public static int dateDiff(java.util.Date a, java.util.Date b) {
		int tempDifference = 0;
		int difference = 0;
		Calendar earlier = Calendar.getInstance();
		Calendar later = Calendar.getInstance();

		if (a.compareTo(b) < 0) {
			earlier.setTime(a);
			later.setTime(b);
		} else {
			earlier.setTime(b);
			later.setTime(a);
		}

		while (earlier.get(Calendar.YEAR) != later.get(Calendar.YEAR)) {
			tempDifference = 365 * (later.get(Calendar.YEAR) - earlier
					.get(Calendar.YEAR));
			difference += tempDifference;

			earlier.add(Calendar.DAY_OF_YEAR, tempDifference);
		}

		if (earlier.get(Calendar.DAY_OF_YEAR) != later
				.get(Calendar.DAY_OF_YEAR)) {
			tempDifference = later.get(Calendar.DAY_OF_YEAR)
					- earlier.get(Calendar.DAY_OF_YEAR);
			difference += tempDifference;

			earlier.add(Calendar.DAY_OF_YEAR, tempDifference);
		}

		return difference;
	}

	public static boolean isDateStringValid(String date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		if (date == null)
			return false;
		else {
			try {
				return date.equals(format.format(format.parse(date)));
			} catch (ParseException e) {
				return false;
			}
		}
	}

	//计算两个日期之间的天数
	public static int daysOfTwo(Date beginDate, Date endDate) {
		int diff = dateDiff(beginDate, endDate);
		return endDate.before(beginDate) ? -diff : diff;
	}

	public static final String timestamp2String(Timestamp ts) {
		if (ts == null) {
			return null;
		} else {
			return new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS").format(ts);
		}
	}
	/**
	 * 返回datetime1到datetime之间的秒数
	 * @param date1 日期yyyyMMdd
	 * @param time1 时间HHmmss
	 * @param date2 日期yyyyMMdd
	 * @param time2 时间HHmmss
	 * @return long
	 */
	public static final long datetimeBetween(String date1, String time1,
			String date2, String time2) {
		return getTime(date1, time1) - getTime(date2, time2);
	}

	/**
	 * 根据参数返回，距离公元1970年1月1号 到参数时间的秒数
	 * @param date1 日期yyyyMMdd
	 * @param time1 时间HHmmss
	 * @return long
	 */
	public static final long getTime(String date1, String time1) {
		String d11 = date1.substring(0, 4);
		String d12 = date1.substring(4, 6);
		String d13 = date1.substring(6, 8);
		String t11 = time1.substring(0, 2);
		String t12 = time1.substring(2, 4);
		String t13 = time1.substring(4, 6);
		GregorianCalendar mortgage1 = new GregorianCalendar(Integer
				.parseInt(d11), Integer.parseInt(d12) - 1, Integer
				.parseInt(d13), Integer.parseInt(t11), Integer.parseInt(t12),
				Integer.parseInt(t13));
		return mortgage1.getTimeInMillis();
	}

	/**
	 * 返回首页，重新登录
	 * <ul>历史记录
	 *      <li>lijl - 1.0 - 2015年6月9日</li>
	 * </ul>
	 * .
	 * @param httpres
	 * @param contextPath
	 * @throws IOException
	 */
	public static void backToSomeWhere(HttpServletResponse httpres,String title, String msg,String url) throws IOException{
		httpres.setContentType("text/html;charset=UTF-8");
		PrintWriter print = httpres.getWriter();
		print.println("<html>");
		print.println("<head>");
		print.println("<title>"+title+"</title>");
		print.println("<script>");
		print.println("alert('"+msg+"');");
		print.println("if(window.top){");
		print.println("window.top.location.href='"+url+"';");
		print.println("}else{");
		print.println("window.location.href='"+url+"';");
		print.println("}");
		print.println("</script>");
		print.println("</head>");
		print.println("<body/>");
		print.println("</html>");
		print.close();
	}

	public static boolean checkedIsOneMonth(Date date1,Date date2)
	{
		if(dateDiff(date1, date2)<=31)
			return true;
		return false;
	}

	/**
	 * 结束日期
	 * <ul>
	 * 历史记录
	 * <li>lijl - 1.0 - 2015年6月2日</li>
	 * </ul>
	 * .
	 * 
	 * @param dateStr
	 * @return 日期对象
	 */
	public static Object maxDate(String dateStr) {
		Calendar cal = Calendar.getInstance();
		cal.setLenient(true);
		cal.set(Integer.parseInt(dateStr.substring(0, YEAR_SIZE)),
				Integer.parseInt(dateStr.substring(YEAR_SIZE + DATE_SPLIT_SIZE, YEAR_SIZE + DATE_SPLIT_SIZE + MONTH_SIZE)) - 1,
				Integer.parseInt(dateStr.substring(YEAR_SIZE + DATE_SPLIT_SIZE + MONTH_SIZE  + DATE_SPLIT_SIZE, YEAR_SIZE + DATE_SPLIT_SIZE + MONTH_SIZE + DATE_SPLIT_SIZE + DATE_SIZE)), MAX_HOURS, MAX_MINUTES, MAX_SECONDS);
		cal.set(Calendar.MILLISECOND, 999);
		return cal.getTime();
	}

	/**
	 * 开始日期
	 * <ul>
	 * 历史记录
	 * <li>lijl - 1.0 - 2015年6月2日</li>
	 * </ul>
	 * .
	 * 
	 * @param dateStr
	 * @return 日期对象
	 * @throws ParseException
	 */
	public static Object minDate(String dateStr) throws ParseException {
		DateFormat df = new SimpleDateFormat(formatstr);
		df.setLenient(true);
		return df.parse(dateStr);
	}


}
