package com.questionsmeet;
//WAP for reverse string
public class Question15 {
	
	public static String revString(String str) {
		String revString = "";
		for(int i = str.length()-1;i>=0;i--) {
			revString = revString + str.charAt(i);
		}
		return revString;
	}
	
	public static void main(String[] args) {
		
		String str = "I am Kaustubh";
		String ans = revString(str);
		System.out.println("Original : " + str);
		System.out.println("Reverse : " + ans);
	}

}
