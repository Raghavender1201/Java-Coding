package com.codingquestions;

public class RemoveWhiteSpacesInStrings {
	
	public static void main(String[] args) {
		String word = "My Name Is Raghu";
		System.out.println(removeWhiteSpaces(word));
	}
	public static String removeWhiteSpaces(String input) {
		char[] ch = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		System.out.println("jhghff");
		for(char character: ch) {
			if(!Character.isWhitespace(character)) {
				sb.append(character);
			}
		}
		
		return sb.toString();
	}
}
