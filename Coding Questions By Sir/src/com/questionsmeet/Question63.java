package com.questionsmeet;
//Swap no without 3rd variable like temp
public class Question63 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		swap(num1,num2);
		
	}

	private static void swap(int num1, int num2) {
		
		System.out.println("After Swap :  A : " + num1 + " B : " + num2 );
		num1 = num1 + num2;
		
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swap :  A : " + num1 + " B : " + num2 );
		
	}

}
