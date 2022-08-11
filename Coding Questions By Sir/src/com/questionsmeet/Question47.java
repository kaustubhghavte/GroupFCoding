package com.questionsmeet;
//Print 3rd 4th character in string="vijay"
public class Question47 {
	
	public static void main(String[] args) {
		
		String str = "vijay";
		
		//for printing character at 3
		printChar(str, 3);
		//for printing character at 4
		printChar(str, 4);
	}
	
	public static void printChar(String str,int position) {
		System.out.println(str.substring((position-1), position));
	}

}
