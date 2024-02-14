package com.codingquestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingTwoLists {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(3,1,5,6,2);
		List<Integer> list2 = Arrays.asList(9,2,5,7,2);
		ArrayList<Integer> aList1 = new ArrayList<>(list1);
		ArrayList<Integer> aList2 = new ArrayList<>(list2);
		//System.out.println(mergeLists(aList1,aList2));
		System.out.println(mergeListsUsingStreams(aList1,aList2));
		
	}
	
	public static List<Integer> mergeLists(List<Integer> aList1,List<Integer> aList2){
		aList1.addAll(aList2);
		return aList1;
	}
	
	public static List<Integer> mergeListsUsingStreams(List<Integer> aList1,List<Integer> aList2){
		List<Integer> mergedList = Stream.concat(aList1.stream(), aList2.stream()).collect(Collectors.toList());
		return mergedList;
	}
	
	
	

}
