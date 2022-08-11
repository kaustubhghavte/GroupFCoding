package com.questionsmeet;
//How to check whether character 'c' is present in the string="vijay"

public class Question46 {
	
	public static void main(String[] args) {
		char check = 'v';
		char lowCheck = '0';
		
		//to convert charcter to lower case
		if((check >= 'a' && check <= 'z') || (check >= 'A' && check <= 'Z')) {
			lowCheck = Character.toLowerCase(check);
		}
		
		String str = "vijay";
		
		boolean result = isPresent(str,lowCheck);
		if(result) {
			System.out.println("Character Present");
		}else {
			System.out.println("Not Present");
		}
	}

	private static boolean isPresent(String str,char check) {
		
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.toLowerCase().charAt(i) == check) {
				count++;
			}
		}
		
		if(count>0) {
			return true;
		}else {
			return false;
		}
		
	}

}
