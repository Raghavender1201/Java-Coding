package com.codingquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IsTwoArraysEqual {

	public static void main(String[] args) {
		int[] arr1 = {2,3,5,7};
		int[] arr2 = {2,3,5,7};
		System.out.println(isSame(arr1,arr2));
		System.out.println(isSameAlternativeMethod(arr1,arr2));

	}
	
	public static boolean isSame(int[] arr1,int[] arr2) {
		boolean result = Arrays.equals(arr1, arr2);
		return result;
	}
	
	public static boolean isSameAlternativeMethod(int[] arr1,int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		List<Integer> l1 = IntStream.of(arr1).boxed().collect(Collectors.toList());
		List<Integer> l2 = IntStream.of(arr2).boxed().collect(Collectors.toList());
		for(Integer n: l1) {
			if(!l2.contains(n)) {
				return false;
			}
		}
		return true;
	}

}
