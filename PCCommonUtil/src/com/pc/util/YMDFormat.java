package com.pc.util;

/**
 * @author ˧�������ľ���������
 * @version 1.0
 */
public class YMDFormat {
	
	public YMDFormat() {
		
	}
	public String CYM(String date) {
		String y = date.substring(0, 4);
		String m = date.substring(4, 6);
		return y+"��"+m+"��";
	}
	
	public String CYMD(String date){
		String y = date.substring(0, 4);
		String m = date.substring(4, 6);
		String d =date.substring(6, 8);
		return y+"��"+m+"��"+d+"��";
	}
}
