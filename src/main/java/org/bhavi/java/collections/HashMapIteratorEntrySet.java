package org.bhavi.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteratorEntrySet {
	public static void entrySetIterator(HashMap<Integer,String> map){
		Iterator<Map.Entry<Integer,String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
			Map.Entry<Integer, String> entry= entries.next();
			System.out.println(entry.getKey() +": "+ entry.getValue());
			
		}
		
	}
	public static void main(String [] args){
		HashMap<Integer,String> kidsMap = new HashMap<Integer,String>();
		kidsMap.put(3, "Bhavith");
		kidsMap.put(8, "Varnith");
		kidsMap.put(5, "Amulya");
		kidsMap.put(12, "Vardhan");
		entrySetIterator(kidsMap);
	}
	

}
