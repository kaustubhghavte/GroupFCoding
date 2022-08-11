package com.questionsmeet;
//WAP to find First non repeating character from String
public class Question56 {
	
	public static void main(String[] args) {
		
		String str = "kaustubhKaustubho";
		String strLower = str.toLowerCase();
		char a = findFirstNonRepeat(strLower);
		System.out.println(a);
		
	}

	private static char findFirstNonRepeat(String str) {
	
		for(int i=0;i<str.length();i++) {
			int count =0;
			for(int j = 0;j<str.length();j++) {
				if(str.charAt(i) == str.charAt(j) && i != j) {
					count++;
					break;
				}
			}
			if(count == 0) {
				return str.charAt(i);
			}
		}
		return '-';
	}

}
