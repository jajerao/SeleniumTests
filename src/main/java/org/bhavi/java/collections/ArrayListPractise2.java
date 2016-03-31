package org.bhavi.java.collections;
//This is Example of how ArrayList is created and used from the method.

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise2 {
	public static void main(String[] args){
		//Creating the list for names.
		
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("Bhavith");
		nameList.add("Shanker");
		nameList.add("Indira");
		
		//print all the elements in the list
		//this method is static so calling using class reference
		ArrayListPractise2.printListElements(nameList);
		
		
		//removing the last element from the list
		//this method is non-static , so creating obj to call method
		//object is given as class name .
		ArrayListPractise2 arrayListPractise2 = new ArrayListPractise2();
		arrayListPractise2.removeLastElementFromList(nameList);
		
		//Adding Element into list.
		addElement(nameList);
		
		//creating the list for age.
		
		List<Integer> ageList = new ArrayList<Integer>();
		
		ageList.add(3);
		ageList.add(34);
		ageList.add(30);
		
		ArrayListPractise2.agesOfMembers(ageList);			
	}
	public static void printListElements(List<String> nList){
		
		for(int i = 0; i<nList.size();i++){
			System.out.println(nList.get(i));
		}
	}
	//remove last element in name list.
	public void removeLastElementFromList(List<String> rList){
		System.out.println("Size of the list before removing:" + rList.size());
		//removing element
		rList.remove(rList.size()-1);
		System.out.println("Size of the list after removing:" + rList.size());
	}
	//Adding one more element in name list.
	public static void addElement(List<String> aList){
		aList.add("Sydney");
		printListElements(aList);
	}
	public static void agesOfMembers(List<Integer>ages){
		
		for(int i = 0; i<ages.size();i++){
			System.out.println("Ages of family members : " + ages.get(i));
			
		}
	}
}
