package org.bhavi.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise1 {
	public static void main(String[] args){
		
		List<Integer> ageList = new ArrayList<Integer>();
		
		ageList.add(10);
		ageList.add(15);
		ageList.add(23);
		ageList.add(38);
		
		System.out.println(ageList.size());
		
		System.out.println(ageList.get(3));
		 
			
		
		for(int j = 0; j<ageList.size(); j++){
			
			System.out.println(ageList.get(j));
		
		}
	}
	
	

}
