package com.cn.hx.wwj.common.core.utils.validate;

import java.util.regex.Pattern;

/**
 * 正则表达式验证
 * 
 * @author zhuqiuyou
 * 
 */
public class RegularUtil {

	/**
	 * @param regular 正则表达式
	 * @param str 需要验证的语句
	 * @return 返回boolbean值:匹配返回true
	 */
	public static Boolean validatePattern(String regular, String input) {
		Pattern p = Pattern.compile(regular);
		return p.matcher(input).matches();
	}
}
