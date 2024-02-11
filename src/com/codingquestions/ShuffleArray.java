package com.codingquestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ShuffleArray {

	public static void main(String[] args) {
		int[] arr = {1,4,2,5,7,4};
		
		shuffleUsingCollections(arr);
		shuffleArraysUsingRandom(arr);
	}
	
	public static void shuffleUsingCollections(int[] arr) {
		List<Integer> list =  IntStream.of(arr).boxed().toList();
		ArrayList<Integer> aList = new ArrayList<>(list); 
		Collections.shuffle(aList);
		System.out.println(aList);
	}
	
	public static void shuffleArraysUsingRandom(int[] arr) {
		Random random = new Random();
		int index = random.nextInt(arr.length-1);
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
