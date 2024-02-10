package com.codingquestions;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
	int[] arr = {4,2,6,9,3,8,1};
	 //arraySort(arr);
	arraySorting(arr);

	}
	
	public static void arraySort(int[] arr) {
		
		Arrays.sort(arr);
		for(int n: arr) {
			System.out.println(n);
		}
		
	}
	public static void arraySorting(int[] arr) {
		int temp=0;
		for(int i=0; i<=arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {   
					temp=arr[i];      
					arr[i]=arr[j];   
					arr[j] = temp;  
				}
			}
			
		}
		for(int n: arr) {
			System.out.println(n);
		}
		
	}

}
