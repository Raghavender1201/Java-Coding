package com.codingquestions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificDateFormat {

	public static void main(String[] args) {
		String pattern = "dd-MM-yyyy";
		System.out.println(dateFormat(pattern));

	}
	
	public static String dateFormat(String pattern) {
		
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		Date date = new Date();
		return df.format(date);
	}

}
