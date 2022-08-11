package com.questionsmeet;

public class Question2 {
	
	public static void main(String[] args) {
		String s1 = "JAvAhewa";
		String s2 = "Technology";
		String s5 = "JAvaTechnology";
		String s6 = "Java" + "Technology";
		String s4 = s1 + s2;
		String s3 = s1.concat(s2);
		
		System.out.println(s3);
		
		System.out.println(s3 == s5);//f
		System.out.println(s4 == s5);//f
		System.out.println(s6 == s5);//f
		
	
	}

}
