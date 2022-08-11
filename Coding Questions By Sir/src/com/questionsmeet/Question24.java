package com.questionsmeet;
//“Abcdmadam” find maximum possible palindrome
public class Question24 {
	
	public static void getMaxPalindrome(String str) {
		String palin = "";
		for(int i = 0; i<str.length();i++) {
			for(int j = i+1; j<str.length();j++) {
				String temp = str.substring(i, j+1);
				if(temp.length() == str.length()) {
					continue;
				}
				
				StringBuilder subStr = new StringBuilder(temp);
				subStr.reverse();
				//System.out.println(temp + "::" + subStr);
				
				String revSubStr = new String(subStr);
				
				if(temp.equalsIgnoreCase(revSubStr)) {
					if(palin.length() < temp.length()) {
						palin = temp;
					}
				}
			}
		}
		System.out.println(palin);
	}
	
	public static void main(String[] args) {
		
		getMaxPalindrome("Abcdmadam");
		
	}

}
