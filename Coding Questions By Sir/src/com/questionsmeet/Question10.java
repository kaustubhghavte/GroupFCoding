package com.questionsmeet;
//Second largest no. in array.
import java.util.Arrays;

public class Question10 {
	
	public static void main(String[] args) {
		
		int arr[] = {10,60,30,50,40,10,60};
		
		Arrays.sort(arr);
		
		for(int a : arr) {
			System.out.print(a);
		}
		System.out.println();
		int count = 0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] != arr[i-1]) {
				count++;
				if(count == 1) {
					System.out.println(arr[i-1]);
					break;
				}
				
			}
		}
	}

}
