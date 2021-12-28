package com.jcg.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	private static void iterateListUsingForEach() {
		List<String> cList = new ArrayList<String>();
		cList.add("India");
		cList.add("Australia");
		cList.add("Singapore");
		cList.add("USA");
		
		cList.forEach(cName -> System.out.println(cName));
		
		
	}
	private static void iterateHashMapUsingForEach() {
		Map<String,String> days = new HashMap<String,String>();
		days.put("1", "Sunday");
		days.put("2", "Monday");
		days.put("3", "Tuesday");
		days.put("4", "Wednesday");
		
		days.forEach((k , v) -> {System.out.println(k + ":" + v);});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     iterateListUsingForEach();
    System.out.println();
    
    iterateHashMapUsingForEach();
	}
}
