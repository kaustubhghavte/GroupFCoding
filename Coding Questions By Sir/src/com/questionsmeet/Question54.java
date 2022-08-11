package com.questionsmeet;
/*
 * Write a program to find triplet number
for e.g// int a[]={1,2,3,4,5,7}// here 1+2 = 3 is present in the array 
2+3= 5 is present in the array 3+4=7 present
in the array but 3+5= 8 not present in array so write code for it.
 */

public class Question54 {
	
	public static void main(String[] args) {
		
		Integer [] arr = {1,2,3,4,5,7};
		
		findTriplet(arr);
		
	}

	private static void findTriplet(Integer[] arr) {
		
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k = j+1;k<arr.length;k++) {
					int sum = arr[i] + arr[j];
					if(sum == arr[k]) {
						System.out.println("( "+arr[i]+", "+arr[j]+", "+arr[k]+ " )" + " : " + arr[i] + " + " + arr[j] + " = " + sum);
					}
				}
			}
		}
	}
}
