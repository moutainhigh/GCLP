package com.grape.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @描述 :    金额工具类(分隔数字并保留小数点后2位有效数字)
 * @创建人 :  zyh
 * @包名 : com.grape.util
 * @创建时间 :  2018/11/27 11:06
 */
public class DecimalFormatTool {

    public static String formatBigDecimal(BigDecimal value) {
        return getFormat(value);
    }

    /**
     *@描述 自定义金额格式方法
     */
    public static String getFormat(BigDecimal value) {
        DecimalFormat decimalFormat = new DecimalFormat();
        // 将格式应用于格式化器
        decimalFormat.applyPattern("#,###,###,##0.00####");
        return decimalFormat.format(value.doubleValue());
    }
}
