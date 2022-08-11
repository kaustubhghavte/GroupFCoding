package com.questionsmeet;
//Program for reverse string
public class Question6 {
	
	public static void main(String[] args) {
		
		/*//Program for reverse string
		String str = "I am Kaustubh";
		String revStr = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			
			revStr = revStr + str.charAt(i);
		 
		}
		System.out.println(revStr);*/
		
		//Program for reverse word
		String str = "I am Java Developer ";
		String reverseStr = "";
		String[] strSplit = str.split(" ");
		
		for(String i : strSplit) {
			String reword = "";
			for(int j = i.length()-1; j>=0; j--) {
				reword = reword + i.charAt(j);
			}
			reverseStr = reverseStr + reword + " ";
		}
		System.out.println(reverseStr);
	}
}
