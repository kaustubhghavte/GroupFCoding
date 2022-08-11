package com.questionsmeet;
//Factorial of a Number
public class Question12 {
	
		public static int factorialNum(int num) {
			
			int fact = 1;
			
			for(int i = 1;i<=num;i++) {
				fact = fact * i;
			}
			return fact;
		}
		
		public static void main(String[] args) {
			
			int num = 5;
			
			int ans = factorialNum(num);
			
			System.out.println("Factorial of " + num + " is " + ans);
			
		}
		
}
