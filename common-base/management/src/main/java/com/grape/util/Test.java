package com.grape.util;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * @描述 测试工具类
 * @参数
 * @返回值
 * @创建人 zyh
 * @创建时间 2018/11/13 13:30
 */
public class Test {

    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.MONTH, -1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date startDate = cal.getTime();
        cal.roll(Calendar.DAY_OF_MONTH, -1);
        Date endDate = cal.getTime();
        System.out.println(startDate + "///" + endDate);
    }
}
