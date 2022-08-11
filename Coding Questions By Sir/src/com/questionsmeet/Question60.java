package com.questionsmeet;
//pallindrome string programme?

public class Question60 {
	
	public static void main(String[] args) {
		
		String str = "ababa";
		boolean flag = isPalindrome(str);
		if(flag) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}
	
	private static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		boolean flag = true;
		while(start<end) {
			if(str.charAt(start++) != str.charAt(end--)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
