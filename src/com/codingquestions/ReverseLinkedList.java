package com.codingquestions;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		Collections.addAll(ll, 1,2,4,5,6,0,2);
		System.out.println(reverse(ll));
	}
	
	public static LinkedList<Integer> reverse(LinkedList<Integer> lList){
		LinkedList<Integer> reversedList = new LinkedList<>();
		Iterator<Integer> iter = lList.descendingIterator();
		while(iter.hasNext()) {
			reversedList.add((Integer) iter.next());
		}
		
		return reversedList;
	}
}
