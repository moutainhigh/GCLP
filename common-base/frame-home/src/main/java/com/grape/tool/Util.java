package com.grape.tool;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.grape.model.mapper.PageBean;

import lombok.extern.log4j.Log4j;

@Log4j
public class Util {
	private static long tmpID = 0;
//	static Logger logger = LogManager.getLogger(Util.class);
	private static final int YEAR_SIZE = 4;
	private static final int MONTH_SIZE = 2;
	private static final int DATE_SIZE = 2;
	private static final int DATE_SPLIT_SIZE = 1;
	private static final int MAX_HOURS = 23;
	private static final int MAX_MINUTES = 59;
	private static final int MAX_SECONDS = 59;
	private static String formatstr = "yyyy-MM-dd";
	private static final String tranSign = "91";

	public static String getDate(Date today) {
		String todayStr = "";
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		todayStr = format.format(today);
		return todayStr;
	}

	public static String getDateTen(Date today) {
		String todayStr = "";
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		todayStr = format.format(today);
		return todayStr;
	}

	public static String getDateBigEight(Date today) {
		String todaystr = "";
		SimpleDateFormat format = new SimpleDateFormat("YYYYMMDD");
		todaystr = format.format(today);
		return todaystr;
	}

	public static String getDate() {
		Date today = new Date();
		return (getDate(today));
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

	public static String getTimemill() {
		Calendar calendar = Calendar.getInstance();
		return (getTimeMill(calendar));
	}

	public static String getTimeMill(Calendar calendar) {
		String now = "";

		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int mill = calendar.get(Calendar.MILLISECOND);
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

		return now + fillSeqno(""+mill,3);
	}

	public synchronized static String getID() {
		long ltime = 0;
		ltime = Long.valueOf(new SimpleDateFormat("yyMMddHHmmssSSS").format(new Date()).toString()).longValue() * 10000;
		if (tmpID < ltime) {
			tmpID = ltime;
		} else {
			String id = String.valueOf(tmpID);
			String subid = id.substring(17, 19);
			Integer flg = Integer.parseInt(subid);
			if (flg + 1 > 99)
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					log.info("getId方法休眠被打断", e);
					
				}
			tmpID = tmpID + 1;
			ltime = tmpID;
		}

		String templtime = String.valueOf(ltime);
		String subltime1 = templtime.substring(0, 15);
		String subltime2 = templtime.substring(17, 19);
		templtime = subltime1 + tranSign + subltime2;
		return String.valueOf(templtime);
	}

	/**
	 * 判断影像文件的格式是否正确
	 * 
	 * @param fileName
	 *            文件名
	 * @return
	 */
	public static boolean isImageType(String fileName, String imageType) {
		// String imageType = null;
		// imageType = getParameter("IMAGE", "type");
		boolean isImageType = false;
		String[] imageTypeList = imageType.split(",");
		for (int i = 0; i < imageTypeList.length; i++) {
			if (!fileName.toLowerCase().endsWith(imageTypeList[i])) {
				continue;
			} else {
				return isImageType = true;
			}
		}
		return isImageType;
	}

	public static String outObj(Object obj) {
		String ret = "";
		if (obj != null) {
			if (obj instanceof String) {
				ret = ((String) obj).trim();
				if (((String) obj).trim().equalsIgnoreCase("null")) {
					ret = "";
				}
			} else {
				return obj.toString();
			}
		}
		return ret;
	}

	public static boolean isBlank(Object object) {
		if (object == null || "".equals(object) || "".equals(object.toString().trim())
				|| ((String) object).trim().equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}

	public static String fillSeqno(final String str) {
		// final int length = WorkItem.APPNO_SIZE;
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
	
	public static String fillSeqno(final String str,int length) {
		// final int length = WorkItem.APPNO_SIZE;
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
	 *
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int compareDate(String date1, String date2) {
		if (StringUtils.isNotEmpty(date1) && StringUtils.isNotEmpty(date2)) {
			SimpleDateFormat d = new SimpleDateFormat("yyyyMMdd");
			try {
				return d.parse(date1).compareTo(d.parse(date2));
			} catch (ParseException e) {
				return 0;
			}
		}
		return -1;
	}

	public static Date string2date(String date) {
		return string2date(date, "yyyyMMdd");
	}

	public static Date string2date(String date, String pattern) {
		try {
			if (date == null || date.trim().length() == 0)
				return null;
			return new SimpleDateFormat(pattern).parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

	public static String date2string(Date date) {
		return date2String(date, "yyyyMMdd");
	}

	public static String date2String(Date date, String pattern) {
		if (date == null)
			return "";
		return new SimpleDateFormat(pattern).format(date);
	}

	/**
	 * 返回 日期 在 +或者- 月数 后的日期
	 * 
	 * @param date
	 *            日期
	 * @param num
	 *            月数
	 * @return
	 */
	public static String addMonth(String date, int num) {
		String d1 = date.substring(0, 4);
		String d2 = date.substring(4, 6);
		String d3 = date.substring(6, 8);
		GregorianCalendar mortgage = new GregorianCalendar(Integer.parseInt(d1), Integer.parseInt(d2) - 1,
				Integer.parseInt(d3));
		mortgage.add(Calendar.MONTH, num);
		Date d = mortgage.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String s = format.format(d);
		return s;
	}

	/**
	 * 返回 日期 在 +或者- 天数 后的日期
	 * 
	 * @param date
	 *            日期
	 * @param amount
	 *            天数
	 * @return
	 */
	public static String addDays(String date, int amount) {
		GregorianCalendar c = new GregorianCalendar(Integer.parseInt(date.substring(0, 4)),
				Integer.parseInt(date.substring(4, 6)) - 1, Integer.parseInt(date.substring(6, 8)));
		c.add(GregorianCalendar.DAY_OF_MONTH, amount);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		return format.format(c.getTime());
	}

	/**
	 * <p>
	 * 返回两个日期之间的单位间隔数
	 * </p>
	 * 
	 * @param a
	 *            java.util.Date
	 * @param b
	 *            java.util.Date
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
			tempDifference = 365 * (later.get(Calendar.YEAR) - earlier.get(Calendar.YEAR));
			difference += tempDifference;

			earlier.add(Calendar.DAY_OF_YEAR, tempDifference);
		}

		if (earlier.get(Calendar.DAY_OF_YEAR) != later.get(Calendar.DAY_OF_YEAR)) {
			tempDifference = later.get(Calendar.DAY_OF_YEAR) - earlier.get(Calendar.DAY_OF_YEAR);
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

	// 计算两个日期之间的天数
	public static int daysOfTwo(String beginDate, String endDate) {
		Date d1 = string2date(beginDate);
		Date d2 = string2date(endDate);
		int diff = dateDiff(d1, d2);
		return d2.before(d1) ? -diff : diff;
	}

	// 计算两个日期之间的天数
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
	 * 返回时间
	 * 
	 * @param dateTime
	 *            日期+时间 "yyyymmdd hhmmsss"
	 * @return
	 */
	public static final String getTime(String dateTime) {
		if (StringUtils.isEmpty(dateTime) || dateTime.length() < 15) {
			return "";
		} else {
			return dateTime.substring(9);
		}
	}

	/**
	 * 返回日期时间，之前或者之后的 num 分钟，<br>
	 * num为正数时表示 num 分钟之后，num为负数时表示 num 分钟之前，
	 * 
	 * @param dateTime
	 *            日期时间，格式为"yyyyMMdd HHmmss"
	 * @param num
	 *            分钟间隔
	 * @return String 日期+时间，格式 "yyyyMMdd HHmmss"
	 */
	public static final String addMinute(String dateTime, int num) {
		if (StringUtils.isEmpty(dateTime) || dateTime.length() < 15) {
			return "";
		}
		String d1 = dateTime.substring(0, 4);
		String d2 = dateTime.substring(4, 6);
		String d3 = dateTime.substring(6, 8);
		String d4 = dateTime.substring(9, 11);
		String d5 = dateTime.substring(11, 13);
		String d6 = dateTime.substring(13, 15);
		GregorianCalendar mortgage = new GregorianCalendar(Integer.parseInt(d1), Integer.parseInt(d2) - 1,
				Integer.parseInt(d3), Integer.parseInt(d4), Integer.parseInt(d5), Integer.parseInt(d6));
		mortgage.add(Calendar.MINUTE, num);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HHmmss");
		Date d = mortgage.getTime();
		return format.format(d);
	}

	/**
	 * 返回日期时间，之前或者之后的 num 分钟，<br>
	 * num为正数时表示 num 分钟之后，num为负数时表示 num 分钟之前，
	 * 
	 * @param dateTime
	 *            日期时间，格式为"yyyyMMdd HHmmss"
	 * @param num
	 *            分钟间隔
	 * @return String 时间，格式 "HHmmss"
	 */
	public static final String addMinuteGetTime(String dateTime, int num) {
		if (StringUtils.isEmpty(dateTime) || dateTime.length() < 15) {
			return "";
		}
		String d1 = dateTime.substring(0, 4);
		String d2 = dateTime.substring(4, 6);
		String d3 = dateTime.substring(6, 8);
		String d4 = dateTime.substring(9, 11);
		String d5 = dateTime.substring(11, 13);
		String d6 = dateTime.substring(13, 15);
		GregorianCalendar mortgage = new GregorianCalendar(Integer.parseInt(d1), Integer.parseInt(d2) - 1,
				Integer.parseInt(d3), Integer.parseInt(d4), Integer.parseInt(d5), Integer.parseInt(d6));
		mortgage.add(Calendar.MINUTE, num);
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HHmmss");
		Date d = mortgage.getTime();
		return format.format(d).substring(9);
	}

	/**
	 * 返回datetime1到datetime之间的秒数
	 * 
	 * @param date1
	 *            日期yyyyMMdd
	 * @param time1
	 *            时间HHmmss
	 * @param date2
	 *            日期yyyyMMdd
	 * @param time2
	 *            时间HHmmss
	 * @return long
	 */
	public static final long datetimeBetween(String date1, String time1, String date2, String time2) {
		return getTime(date1, time1) - getTime(date2, time2);
	}

	/**
	 * 根据参数返回，距离公元1970年1月1号 到参数时间的秒数
	 * 
	 * @param date1
	 *            日期yyyyMMdd
	 * @param time1
	 *            时间HHmmss
	 * @return long
	 */
	public static final long getTime(String date1, String time1) {
		String d11 = date1.substring(0, 4);
		String d12 = date1.substring(4, 6);
		String d13 = date1.substring(6, 8);
		String t11 = time1.substring(0, 2);
		String t12 = time1.substring(2, 4);
		String t13 = time1.substring(4, 6);
		GregorianCalendar mortgage1 = new GregorianCalendar(Integer.parseInt(d11), Integer.parseInt(d12) - 1,
				Integer.parseInt(d13), Integer.parseInt(t11), Integer.parseInt(t12), Integer.parseInt(t13));
		return mortgage1.getTimeInMillis();
	}

	public static boolean checkedIsOneMonth(Date date1, Date date2) {
		if (dateDiff(date1, date2) <= 31)
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
				Integer.parseInt(
						dateStr.substring(YEAR_SIZE + DATE_SPLIT_SIZE, YEAR_SIZE + DATE_SPLIT_SIZE + MONTH_SIZE)) - 1,
				Integer.parseInt(dateStr.substring(YEAR_SIZE + DATE_SPLIT_SIZE + MONTH_SIZE + DATE_SPLIT_SIZE,
						YEAR_SIZE + DATE_SPLIT_SIZE + MONTH_SIZE + DATE_SPLIT_SIZE + DATE_SIZE)),
				MAX_HOURS, MAX_MINUTES, MAX_SECONDS);
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

	public static String getFullName(String name1, String name2) {
		// version 2.1 add by 陶文亮 begin
		name1 = Util.outObj(name1);
		name2 = Util.outObj(name2);
		// version 2.1 add by 陶文亮 end
		name1 = name1.replaceAll("　", "").trim();
		name2 = name2.replaceAll("　", "").trim();
		String name = name1 + name2;
		if (!name1.matches("[\u0391-\uFFE5]+$")) {// 如果不匹配汉字
			name = name2 + " " + name1;// 英文姓名
		}
		return name;
	}

	// 获取指定空格数的字符串
	public static String getBlankStr(int n) {
		StringBuffer blankStr = new StringBuffer();
		for (int i = 0; i < n; i++) {
			blankStr = blankStr.append(" ");
		}
		return blankStr.toString();
	}

	// 字符串补充空格数
	public static String addRBlankStr(String src, int n) {
		StringBuffer blankStr = new StringBuffer();
		blankStr.append(src);
		int addlen = n - src.length();
		for (int i = 0; i < addlen; i++) {
			blankStr = blankStr.append(" ");
		}
		return blankStr.toString();
	}

	public static void setBeanFieldValue(Object bean, Map<String, ?> data) {
		Class<?> clasz = bean.getClass();
		Field field = null;

		Set<String> keys = data.keySet();
		Object value = null;
		for (String key : keys) {
			value = data.get(key);
			key = compileFieldName(key);

			try {
				field = clasz.getDeclaredField(key);
			} catch (NoSuchFieldException e) {
				continue;
			}

			try {
				field.setAccessible(true);
				field.set(bean, value);
			} catch (IllegalArgumentException e) {

				try {
					if (field.getDeclaringClass().equals(String.class)) {
						field.set(bean, Util.outObj(value));
					} else {
						field.set(bean, new BigDecimal(Util.outObj(value)));
					}
				} catch (Exception ex) {
					log.info("convert value[" + value + "] to field[" + key + "] exception", e);
				}

			} catch (Exception e) {
				log.info("convert value[" + value + "] to field[" + key + "] exception", e);
			}
		}

	}

	public static String compileFieldName(String name) {
		if (name.contains(".")) {
			name = name.substring(name.indexOf(".") + 1);
		}
		if (!name.contains("_")) {
			return name.toLowerCase();
		} else {
			String[] temp = name.split("[_]");
			StringBuilder sb = new StringBuilder(temp[0].toLowerCase());
			for (int i = 1; i < temp.length; i++) {
				sb.append(temp[i].toUpperCase().charAt(0)).append(temp[i].toLowerCase().substring(1));
			}
			return sb.toString();
		}
	}

	public static String getTranSerialNo(String systemNo) {
		// 系统交易流水号，发起渠道号4+日期（8）+序号（20）
		return Util.addRBlankStr(systemNo, 4) + Util.getDate() + Util.getID() + "0";
	}
	
	public static PageBean intPageBean(String currentPage,String size){
		int currentPage2 = Integer.parseInt(currentPage);
		int size2 = Integer.parseInt(size);
		if(currentPage2>0){
			currentPage2-=1;
		}
		PageBean pageBean = new PageBean(currentPage2, size2);
		return pageBean;
		
	}
	
	public static void main(String[] args) {
		System.out.println(Util.getID());
	}

}
