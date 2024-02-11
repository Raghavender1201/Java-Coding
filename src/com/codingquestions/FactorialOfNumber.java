package com.codingquestions;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(factorial(num));
		System.out.println(otherFactorialMethod(num));
	}
	
	public static int factorial(int num) {
		int res = 1;
		for(int i=0;i<num;i++) {
			res = res*(num-i);
		}
		return res;
	}
	
	public static int otherFactorialMethod(int num) {
		if(num==1) {
			return 1;
		}else {
			return num*otherFactorialMethod(num-1);
		}
	}
}
