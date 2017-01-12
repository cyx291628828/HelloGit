package com.pc.util;

import java.text.DecimalFormat;

/**
 * 
 * @version 1.0
 * @author 荆州吴彦祖
 * @param df:DecimalFormat;
 * 
 * 数字转换成各种格式的字符串 ex: 123.000;
 * 						 000123;
 * 						 000123.000; 
 */
public class NumTransString {

	private DecimalFormat df;
	//保留N位小数点并且转换成字符串  例如0.0000
	
	public String save0NDecimalToString(int n,long num){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < n; i++) {
			sb.append("0");
		}
		 df= new DecimalFormat("##0."+sb.toString());
		return df.format(num);
	}
	
	/*
	 * 前者保留m位后者保留n位  ex 000123.0000
	 */
	public String saveM0NDeclimalToString(int m,int n,long num){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <m; i++) {
			sb.append("0");
		}
		sb.append(".");
		for (int i = 0; i < n; i++) {
			sb.append("0");
		}
		df = new DecimalFormat(sb.toString());
		return df.format(num);
	}
	
	public String saveM0DecimalToString(int m,long num){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < m; i++) {
			sb.append("0");
		}
		df = new DecimalFormat(sb.toString());
		return df.format(num);
	}
	
	
}
