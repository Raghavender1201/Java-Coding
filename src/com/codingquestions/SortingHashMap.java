package com.codingquestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingHashMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Apple",6);
		map.put("Banana",2);
		map.put("Carrot",4);
		map.put("DragonFruit",1);
		map.put("Egg",3);
		System.out.println(sortHashMap(map));

	}
	
	public static Map<String,Integer> sortHashMap(Map<String,Integer> hashMap){
		Map<String, Integer> sortedByValue = new LinkedHashMap<>();
		Set<Entry<String,Integer>> entrySet = hashMap.entrySet();
		List<Entry<String,Integer>> entryList = new ArrayList<>(entrySet);
		entryList.sort((x,y) -> x.getValue().compareTo(y.getValue()));
		
		for(Entry<String,Integer> entry: entryList) {
			sortedByValue.put(entry.getKey(), entry.getValue());
		}
		return sortedByValue;
	}

}
