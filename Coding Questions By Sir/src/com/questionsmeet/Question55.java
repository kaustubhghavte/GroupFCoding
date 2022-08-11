package com.questionsmeet;
/*
 * WAP for Find string is substring of second string or not 
String s= "meeting"
String s1= "meet"
 */
public class Question55 {
	
	public static void main(String[] args) {
		
		String s1 = "meeting";
		String s2 = "meet";
		
		
		if(isSubString(s1, s2)) {
			System.out.println("Substring");
		}else {
			System.out.println("Not Substring");
		}
	}
	
	private static boolean isSubString(String s1, String s2) {
		
		int s2Length = s2.length();
		
		for(int i = 0; i<s1.length()-(s2Length-1);i++) {
			if(s1.substring(i, s2Length+i).equalsIgnoreCase(s2)) {
				return true;
			}
		}
		return false;
	}

}
