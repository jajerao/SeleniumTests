package org.bhavi.java.algorithms;

public class SmallestNumberFromArray {
	public static int smallNumber(int[]x){
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<x.length;i++){
			if(x[i]<smallest){
				smallest = x[i];
				
			}
		}
		return smallest;
		}
	//now Adding values to array to pass it to find smallest no.from it.
	public static void main(String[] args){
		int[] number = new int[8];
		number[0]=145;
		number[1]= 36;
		number[2]= 40;
		number[3]= 37;
		number[4]= 34;
		number[5]= 25;
		number[6]= 67;
		number[7]= 58;
		//now to know the smallest number ..call the method implemented.
		smallNumber(number);
		System.out.println(smallNumber(number));
	}
	
	

}
