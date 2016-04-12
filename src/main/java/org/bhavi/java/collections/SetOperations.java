package org.bhavi.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	public static void main(String[] args){
		Set<Integer> intset = new HashSet<Integer>();
		intset.add(5);
		intset.add(9);
		intset.add(19);
		intset.add(3);
		intset.add(35);
		
		System.out.println(intset);
		//loop through integer set
		for(Integer num :intset){
			System.out.println(num);
			}
		//Is set is Empty?
		if(intset.isEmpty()){
			System.out.println("It is Empty");
			}else{
				System.out.println("It is not empty");
			}
		//Does set contain a given item ?:
		if(intset.contains(89)){
			System.out.println("yes the number is in the set");
			}else{
				System.out.println("No it is not in a set");
			}
		
	}

}
