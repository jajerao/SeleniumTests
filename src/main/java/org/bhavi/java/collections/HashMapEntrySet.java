package org.bhavi.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEntrySet {
	public static void main(String[] args){
		
		Map<Integer,String> empMap = new HashMap<Integer,String>();
		//to add values in Hashmap:
		empMap.put(9, "Sachin");
		empMap.put(1, "Virat");
		empMap.put(2, "Nehra");
		empMap.put(7, "Dhoni");
		empMap.put(6, "Dravid");
		
		//to get values in Hashmap:
		String text = empMap.get(1);
		System.out.println(text);
		
		//To Loop through the HashMap with entrySet..****
		for( Map.Entry<Integer,String> entry : empMap.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
			
		}
		//Removing..u will get concurrentModificationError.
		HashMapEntrySet.removeCaptain(empMap);
		
	}
	
	//Remove Dhoni from team...***
	public static Map<Integer, String> removeCaptain(Map<Integer, String> someMap){
		for(Map.Entry<Integer, String> entry: someMap.entrySet()){
			if(entry.getValue().equals("Dhoni")){
				someMap.remove(entry.getKey());	
				break;
			}
		}
		return someMap;
		
	}

}
