package com.questionsmeet;
//Write code for reverse each word in a given string?
public class Question27 {
	
	public static String revWordString(String str) {
		
		String[] splitStr = str.split(" ");
		
		String revStr = "";
		for(int i=0;i<splitStr.length;i++) {
			String word = splitStr[i];
			String revWord = "";
			for(int j=word.length()-1; j>=0; j--) {
				revWord = revWord + word.charAt(j);	
			}
			
			revStr = revStr + revWord + " ";
		}
		
		return revStr;
		
	}
	
	public static void main(String[] args) {
		
		String ans = revWordString("I am Java Developer");
		
		System.out.println(ans);
	}

}
