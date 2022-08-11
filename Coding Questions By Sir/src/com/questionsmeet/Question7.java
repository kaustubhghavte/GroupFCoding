package com.questionsmeet;
//swapping two numbers without using third variable
public class Question7 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Before : " + num1 + "&" + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After : " + num1 + "&" + num2);
	}
}
