package org.bhavi.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {
	public static void main(String [] args){
		
	
	Map<Integer,String> hashMap= new HashMap<Integer,String>();
	Map<Integer,String> linkedMap= new LinkedHashMap<Integer,String>();
	Map<Integer,String> treeMap= new TreeMap<Integer,String>();
	
	//HashMap does not retain the order.no particular order.
	System.out.println("In HashMap : ");
	testMap(hashMap);
	
	//LinkedHashMap will give the order of keys as u added
	System.out.println("In LinkedMap : ");
	testMap(linkedMap);
	
	//Treemap sorts in the key in natural order
	System.out.println("In treeMap : ");
	testMap(treeMap);
	
	
	
	}
	public static void testMap(Map<Integer,String> map){
		map.put(1, "cat");
		map.put(8, "dog");
		map.put(10, "turtle");
		map.put(3, "cow");
		map.put(6, "rabbit");
		
		for(Integer key :map.keySet()){
			String value= map.get(key);
			System.out.println(key +":" + value );
			
		}
		
	}
}
