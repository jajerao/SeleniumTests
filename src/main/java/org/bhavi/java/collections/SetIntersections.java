package org.bhavi.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetIntersections {
	public static void main(String[] args) {
		Set<String> nameString1 = new HashSet<String>();
		nameString1.add("ben");
		nameString1.add("kanak");
		nameString1.add("div");
		nameString1.add("veen");
		nameString1.add("Ram");

		// create another set with some common items....
		Set<String> nameString2 = new LinkedHashSet<String>();
		nameString2.add("Indu");
		nameString2.add("div");
		nameString2.add("veen");
		nameString2.add("pandu");
		nameString2.add("deepu");

		// finding out common in 2 sets:
		Set<String> intersection = new LinkedHashSet<String>(nameString1);
		intersection.retainAll(nameString2);
		System.out.println(intersection);
		
		//finding unique in set 1/////
		Set<String> unique = new HashSet<String>(nameString1);
		unique.removeAll(nameString2);
		System.out.println(unique);
	}
}
