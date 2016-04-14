package org.bhavi.java.algorithms;

public class LargestNumberFromArray {
	public static int largestNumber(int[] a){
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>largest){
				largest= a[i];
				}
			}
		return largest;
	}
	public static void main(String []args){
		int[] studentsAge = new int[5];
		studentsAge[0]= 5;
		studentsAge[1]=94;
		studentsAge[2]=812;
		studentsAge[3]=58;
		studentsAge[4]=43;
		System.out.println(largestNumber(studentsAge));
		
		
	}

}
