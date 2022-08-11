package com.questionsmeet;
//String reverse program without using inbuilt methods.
public class Question32 {
	
	private static String revString(String str) {
		
		String revString = "";
		
		for(int i = str.length()-1;i>=0;i--) {
			revString = revString + str.charAt(i);
		}
		
		return revString;
		
	}
	
	public static void main(String[] args) {
		
		String str = "Kaustubh Ghavte";
		String ans = revString(str);
		System.out.println(ans);
	}

}
