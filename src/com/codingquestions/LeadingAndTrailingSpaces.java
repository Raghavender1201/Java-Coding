package com.codingquestions;

public class LeadingAndTrailingSpaces {

	public static void main(String[] args) {
		String word = " My name is raghu ";
		removeSpaces(word);

	}
	
	public static String removeSpaces(String input) {
		System.out.println(input.length());
		String c = input.trim();
		System.out.println(c.length());
		String s = input.strip();
		System.out.println(s);
		System.out.println(s.length());
		
		return input;
	}
}
