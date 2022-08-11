package com.questionsmeet;
/*
 * Program on ( 1,9,2,3,0,5,0,7,0,4,0,6) 
 * Print all non zero no first then all zero at one line
 */

public class Question45 {
	
	public static void main(String[] args) {
		
		int a[] = {1,9,2,3,0,5,0,7,0,4,0,6};
		
		sortnumz(a);
		
		for(int k : a) {
			System.out.print(k + ",");
		}
	}
	
	public static void sortnumz(int arr[]) {
		
		int count = 0;
		int j = 0;
		for(int i : arr) {
			if(i == 0) {
				count++;
			}else {
				arr[j++] = i;
			}
		}
		
		for(int i = 1; i<=count;i++) {
			arr[j++] = 0;
		}
	}

}
