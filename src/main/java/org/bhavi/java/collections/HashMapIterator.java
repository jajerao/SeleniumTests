package org.bhavi.java.collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapIterator {
	
	
	
	public static void demoIterator(HashMap<Integer, String> map){
		
		Iterator<Integer> iterator =  map.keySet().iterator();
		while(iterator.hasNext()){
			//key
			Integer key = iterator.next();  //you cannot call next multiple times as it will jump to next pair
			System.out.println(key);
			//value
			System.out.println(map.get(key));
		}
		
	}
	public static void main(String[] args){
		HashMap<Integer,String> kidsMap = new HashMap<Integer,String>();
		kidsMap.put(3, "Bhavith");
		kidsMap.put(8, "Varnith");
		kidsMap.put(5, "Amulya");
		kidsMap.put(12, "Vardhan");
		demoIterator(kidsMap);
		
		
	}

}

