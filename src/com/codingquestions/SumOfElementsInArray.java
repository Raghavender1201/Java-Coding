package com.codingquestions;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,5,7,3};
		System.out.println(sumOfArrayElements(arr));

	}
	
	public static int sumOfArrayElements(int[] arr) {
		int result=0;
		for(int n: arr) {
			result=result+n;
		}
		return result;
	}

}
