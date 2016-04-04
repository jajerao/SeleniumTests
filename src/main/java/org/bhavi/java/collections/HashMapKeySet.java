package org.bhavi.java.collections;

import java.util.HashMap;

public class HashMapKeySet {
	public static void main(String[] args){
		HashMap<String,Integer> studentMap = new HashMap<String,Integer>();
		studentMap.put("sru", 70);
		studentMap.put("indu", 90);
		studentMap.put("vasu", 60);
		studentMap.put("naren", 65);
		
		//Loop throgh using KeySet..***
		for(String key :studentMap.keySet()){
		System.out.println(key + ":"+ studentMap.get(key));	
		}
	}
}
