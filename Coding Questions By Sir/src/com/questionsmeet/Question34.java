package com.questionsmeet;

/*
 * Write a method to return the square of a number without using 
multiplication (*) operator or Math class or any inbuilt functionality.
The input number can be an Integer or a Float.

 */

public class Question34 {

	public static float square(float num) {
		if (num < 0) num = -num;
		
		float result = num;
		
		for(int i = 1; i<num;i++) {
			result = result + num;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		float num = 5;
		
		float result = square(num);
		
		System.out.println(num + " ^2 = " + result);
		
	}

}
