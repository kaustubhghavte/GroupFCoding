package com.questionsmeet;

import java.util.Arrays;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

/*
 * WAP to find Not Common From String
String s= "nikhil";
String s1="nitesh";
 */
public class Question57 {
	
	public static void main(String[] args) {
		String s1 = "nikhil";
		String s2 = "nitesh";
	
		notCommonList(s1, s2);
	}

	/*//by using loop
	private static void notCommon(String s1, String s2) {
		for(int i=0;i<s1.length();i++) {
			int count = 0;
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.println(s1.charAt(i));
			}
		}
	}*/
	
	//By using list
	private static void notCommonList(String s1,String s2) {

		Character[] arr = new Character[s2.length()];
		
		for(int i=0;i<s2.length();i++) {
			arr[i] = s2.charAt(i);
		}
		
		List<Character> list = Arrays.asList(arr);
		
		for(int j = 0 ; j<s1.length();j++) {
			if(!list.contains(s1.charAt(j))) {
				System.out.println(s1.charAt(j));
			}
		}
	}
}
