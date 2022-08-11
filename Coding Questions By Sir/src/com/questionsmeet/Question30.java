package com.questionsmeet;

import java.util.Arrays;

//Reverse of array
public class Question30 {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60};
		
		int revArr[] = new int[arr.length];
		
		int j = 0;
		for(int i = arr.length-1;i>=0;i--) {
			revArr[j++] = arr[i];
		}
		
		for(int i:revArr) {
			System.out.print(i + " ");
		}
		
	}

}
