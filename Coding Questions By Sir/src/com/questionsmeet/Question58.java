package com.questionsmeet;

import java.util.Arrays;

/*
 * How you are going to sort array if it's containing 0,1,1,0,0,0,1,1,0
 */
public class Question58 {
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,1,0,0,0,1,1,0};//000001111
		
		int[] result = sort1_0(arr);
	
		System.out.println(Arrays.toString(result));
		
	}
	
	private static int[] sort1_0(int[] arr) {
		//int arr1[] = new int[arr.length];
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			
			while(arr[left] == 0 && left<right) {
				left++;
			}
			
			while(arr[right] == 1 && left<right){
				right--;
			}
			
			if(left<right) {
				arr[left] =0;
				arr[right] =1;
				left++;
				right--;
			}
		}
		
		return arr;
	}

}
