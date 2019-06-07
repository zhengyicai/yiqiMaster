/* 
 * 文件名：DateUtils.java  
 * 版权：Copyright 2016-2016 炎宝网络科技  All Rights Reserved by
 * 修改人：邱深友  
 * 创建时间：2016年11月25日
 * 版本号：v1.0
*/
package com.qzi.cms.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO
 * @author qsy
 * @version v1.0
 * @date 2016年11月25日
 */
public class DateUtils {
	public static final String DATE_TIME_FORMAT1="yyyy-MM-dd|HH:mm:ss";
	public static final String DATE_TIME_FORMAT2="yyyy-MM-dd HH:mm:ss";
	public static final String DATE_TIME_FORMAT3="yyyy/MM/dd HH:mm:ss";
	public static final String DATE_TIME_FORMAT4="yyyyMMddHHmmss";
	public static final String DATE_TIME_FORMAT5="yyyyMMdd HH:mm:ss";
	public static final String DATE_TIME_FROMAT6="yyyy-MM-dd-HH";
	public static final String DATE_TIME_FORMAT7="yyyyMMddHHmmssSSS";
	public static final String DATE_TIME_FORMAT8="yyyy年MM月dd日";
	
	public static final String DATE_FORMAT1="yyyy-MM-dd";
	public static final String DATE_FORMAT2="yyyyMMdd";
	public static final String DATE_FORMAT3="yyyy.MM.dd";
	public static final String DATE_FORMAT4="yyyy/MM/dd";
	
	/**
	 * 格式化当前日期
	 * @param pattern 格式化类型
	 * @return 格式化后的日期字符
	 */
	public static String formatDateTime(String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(new java.util.Date());
		return now;
	}
	
	/**
	 * 格式化指定日期
	 * @param pattern 格式化类型
	 * @param date 日期类型
	 * @return 格式化后的日期字符
	 */
	public static String formatDateTime(String pattern,Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String now = sdf.format(date);
		return now;
	}
	
	/**
	 * 格式化指定日期
	 * @param pattern 格式化类型
	 * @param time 日期long类型
	 * @return 格式化后的日期字符
	 */
	public static String formatDateTime(String pattern, long time) {
		return formatDateTime(pattern, new Date(time));
	}

}
