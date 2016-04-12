package org.bhavi.java.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateElementsinList {
	public static void getRepeatedElements(List<String> x) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s : x) {
			if (map.get(s) != null) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + "," + map.get(key));
			}
		}
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("California");
		list.add("Texas");
		list.add("Chicago");
		list.add("California");
		list.add("Chicago");

		getRepeatedElements(list);
		
		//String s = "abc.edf.dfdf.dfdjd.ffdf";
		//String[] a = s.split(".");
	}
	
	

}
