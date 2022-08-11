package com.questionsmeet;

import java.util.ArrayList;
import java.util.List;

//Conunt string char Palindrome
public class Question64 {

	public static void main(String[] args) {

		String str = "ababa";
		String sub = "";
		List<String> palList = new ArrayList<String>();
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				sub = str.substring(i, j + 1);
				StringBuilder subStr = new StringBuilder(sub);
				subStr.reverse();
				// System.out.println(sub + " || " + subStr);
				String subStrS = new String(subStr);
				if (sub.equalsIgnoreCase(subStrS)) {
					
					System.out.println(sub + " || " + subStr);
					
					if(!palList.contains(sub)) {
						palList.add(sub);
					}
					
				}
			}
		}

		System.out.println(palList);
		System.out.println("Total Palindrom : " + palList.size());
	}

}
