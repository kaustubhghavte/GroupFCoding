package com.questionsmeet;
/*
 * String str=" java is Object oriented programming language”; , 
 * Write code to remove extra space
 */
public class Question43 {
	
	public static void main(String[] args) {
		
		String str = " java  is Object    oriented   programming	 language";
				
		String s1 = str.replaceAll("\\s+"," ").trim();
		
		System.out.println(s1);
	}

}
