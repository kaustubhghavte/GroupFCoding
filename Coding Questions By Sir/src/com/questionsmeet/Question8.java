package com.questionsmeet;
//string objects means pool and heap concepts, how much objects will be created from 
//1) String s=”amit” 2) String s=”amit” 3) String s=new string (”amit”);
public class Question8 {
	
	public static void main(String[] args) {
		
		String s1 = "amit";
		String s2 = "amit";
		String s3 = new String("amit");
		
		System.out.println(s1 == s2);//t
		System.out.println(s1 == s3);//f
		System.out.println(s2 == s3);//f
	}

}
