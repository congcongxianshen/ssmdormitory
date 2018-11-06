/**
 *
 */
package com.kj.base.utils;


import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.NumberFormat;

/**
 * 字符串工具类
 *
 * @Date 2018年4月18日
 */
public class StringUtil  {
	public static String exceptionToStr(Throwable e) {
		try {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw, true);
			pw.flush();
			sw.flush();
			pw.close();
			sw.close();
			return sw.toString();
		} catch (IOException e1) {
			e1.printStackTrace();
			return "打印日志异常";
		}
	}

	public static Integer nullToInteger(Object value) {
		return value == null || "null".equals(value.toString()) ? 0 : stringToInteger(value.toString());
	}

	public static Integer stringToInteger(String value) {
		Integer l;
		value = nullToString(value);
		if ("".equals(value)) {
			l = 0;
		} else {
			try {
				l = Integer.valueOf(value);

			} catch (Exception e) {
				l = 0;
			}
		}
		return l;
	}

	public static String nullToString(String value) {
		return value == null || "null".equals(value) ? "" : value.trim();
	}

	public static String getRate(double str) {
		NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMaximumFractionDigits(1);
		String s = nf.format(str);
		return s;
	}

	// 将NULL转换成空字符串
	public static String null2Str(Object value) {
		return value == null || "null".equals(value.toString()) ? "" : value.toString();
	}
}
