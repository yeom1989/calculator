package com.okdevtv.tdd.hello;

import java.text.NumberFormat;

public class StringUtils {
	
	public static String comma(int number) {
		NumberFormat numberFormat = NumberFormat.getInstance();
		String str = numberFormat.format(number);

		return str;
	}
	
}
