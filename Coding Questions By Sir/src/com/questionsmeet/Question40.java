package com.questionsmeet;
//write code to swap 2 string without using third variable
public class Question40 {

	public static void main(String[] args) {
		
		String s1 = "Kaustubh";
		String s2 = "Ghavte";
		
		System.out.println("Before:");
		System.out.println("s1 >> " + s1);
		System.out.println("s2 >> " + s2);
		int s1Length = s1.length();
	
		s1 = s1 + s2;
		
		s2 = s1.substring(0,s1Length);
		s1 = s1.substring(s1Length);
		
		System.out.println("After:");
		System.out.println("s1 >> " + s1);
		System.out.println("s2 >> " + s2);
	}
	
}
