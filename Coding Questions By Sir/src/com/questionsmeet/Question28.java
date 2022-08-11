package com.questionsmeet;

import java.util.Arrays;
import java.util.Collections;

//Write code for sorting given array?
public class Question28 {

	public static void main(String[] args) {
		
		int arr[] = {50,20,40,20,10,90};
		
		/*//By using Arrays class ascending order
		Arrays.sort(arr);*/
		
		/*//By using bubble swap ascending order
		boolean isSwap = true;
		while(isSwap) {
			isSwap = false;
			for(int i = 0; i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					isSwap = true;
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}*/
		
		/*//By using Arrays class descending order
		
		Integer arrInt[] = new Integer[arr.length];
		
		for(int i = 0 ; i<arr.length;i++) {
			arrInt[i] = arr[i];
		}
		
		Arrays.sort(arrInt,Collections.reverseOrder());*/
		
		//By using bubble swap descending order
		boolean isSwap = true;
		while(isSwap) {
			isSwap = false;
			for(int i = 0; i<arr.length-1;i++) {
				if(arr[i]<arr[i+1]) {
					isSwap = true;
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		//Printing Array
		for(int i:arr) {
			System.out.print(i + ",");
		}
		
	}
}
