package com.questionsmeet;

import java.util.Arrays;

/*
 * Sum of square of odd no from array
 */

public class Question50 {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5,6,7,8};
		
		int result = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				int sq = arr[i] * arr[i];
				System.out.println(sq);
				result = result + sq;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of square of odd number : " + result);
		
	}
}
