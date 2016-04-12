package org.bhavi.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	//A set is a kind of collection that stores only unique elements.
	public static void main(String[] args){
		//HashSet does not retain order.
		//Set<String> set1 = new HashSet<String>();
		
		//LinkedHashSet remembers the order you add items in.
		Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet retains the natural order
		//Set<String> set1 = new TreeSet<String>();
		
		
		set1.add("cat");
		set1.add("dog");
		set1.add("bird");
		set1.add("ant");
		set1.add("lizard");
		//Adding duplicate items does nothing
		set1.add("dog");
		System.out.println(set1);
		
		//Loop through the Set
		for(String element:set1){
			System.out.println(element);
			}
		}
}
