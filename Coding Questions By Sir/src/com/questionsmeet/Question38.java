package com.questionsmeet;

import java.util.ArrayList;
import java.util.List;


/*
 * if all the characters of str are present in the str1. Occurrence is not important
 * str = "abcde" str1 ="ahjdksbjcksjsejkop"
 */
public class Question38 {
	
	public static void main(String[] args) {
		String str = "abcde";
		String str1 = "ahjdksbjcksjsejkop";
		
		//by using loop
		/*boolean isPresent = false;
		for(int i = 0; i<str.length();i++) {
			isPresent = false;
			for(int j = 0;j<str1.length();j++) {
				if(str.charAt(i) == str1.charAt(j)) {
					isPresent = true;
					break;
				}
			}
			if(!isPresent) {
				break;
			}
		}
		
		if(isPresent) {
			System.out.println("Present");
		}else {
			System.out.println("Not");
		}*/
		
		//by using contains method of set
		
		char[] strArr = str.toCharArray();
		char[] str1Arr = str1.toCharArray();
		
		List<Character> strL = new ArrayList<Character>();
		List<Character> str1L = new ArrayList<Character>();
		
		for(char c : strArr) {
			strL.add(c);
		}
		
		for(char d : str1Arr) {
			str1L.add(d);
		}
		
		if(str1L.containsAll(strL)) {
			System.out.println("Present");
		}else {
			System.out.println("Not");
		}
	}

}
