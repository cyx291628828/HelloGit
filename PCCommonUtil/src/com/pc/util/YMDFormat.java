package com.pc.util;

/**
 * @author 帅过金城武的荆州吴彦祖
 * @version 1.0
 */
public class YMDFormat {
	
	public YMDFormat() {
		
	}
	public String CYM(String date) {
		String y = date.substring(0, 4);
		String m = date.substring(4, 6);
		return y+"年"+m+"月";
	}
	
	public String CYMD(String date){
		String y = date.substring(0, 4);
		String m = date.substring(4, 6);
		String d =date.substring(6, 8);
		return y+"年"+m+"月"+d+"日";
	}
}
