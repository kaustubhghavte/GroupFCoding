package com.questionsmeet;
//write program to check dublicate elements is array
public class Question52 {

	public static void main(String[] args) {
		
		int[] arr = {1,1,3,1,4,5,4};
		
		checkDuplicate(arr);
	}

	private static void checkDuplicate(int[] arr) {
		
		int count;
		for(int i=0;i<arr.length-1;i++) {
			count = 0;
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i] == arr[j]) {
					
					count++;
				}
			}
			if(count == 1) {
				System.out.println(arr[i]);
			}
		}
		
	}
	
}
