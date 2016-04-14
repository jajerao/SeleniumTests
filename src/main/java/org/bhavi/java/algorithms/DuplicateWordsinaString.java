package org.bhavi.java.algorithms;

import java.util.HashMap;

public class DuplicateWordsinaString {
	public static void duplicateWordsinArray(String[] a) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) != null){
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key+","+map.get(key));

			}
		}
	}
	public static void main(String[] args){
		String[] animals = new String[7];
		animals[0]="donkey";
		animals[1]="dog";
		animals[2]="pig";
		animals[3]="donkey";
		animals[4]="pig";
		animals[5]="cat";
		animals[6]="donkey";
		//now, to find duplicates in this array..call the method implemented.
		duplicateWordsinArray(animals);
		
 	}
}
