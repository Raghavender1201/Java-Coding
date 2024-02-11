package com.codingquestions;

public class SecondLargestNumOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,3,2};
		System.out.println(secondLargestNum(arr));

	}
	
	public static int secondLargestNum(int[] arr) {
		int temp=0;
		int temp1=0;
		for(int n: arr) {
			if(n>temp) {
				temp=n;
			}
		}
		for(int n: arr) {
			if(n==temp) {
				break;
			}else if(n>temp1){
				temp1=n;
			}
		}
		return temp1;
	}

}
