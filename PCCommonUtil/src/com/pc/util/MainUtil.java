package com.pc.util;


public class MainUtil {
	public static void main(String[] args) {
		NumTransString nts = new NumTransString();
		String saveM0NDeclimalToString = nts.saveM0NDeclimalToString(3, 3, 333333);
		System.out.println(saveM0NDeclimalToString);
	}
}
