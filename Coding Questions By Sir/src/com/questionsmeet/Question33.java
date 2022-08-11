package com.questionsmeet;
//java code to print repeated char for a string
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question33 {
	
	private static void charOccurMap(String str) {
		
		char strChar[] = str.toLowerCase().toCharArray();
		
		Map<Character, Integer> occurance = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i<strChar.length;i++) {
			if(occurance.containsKey(strChar[i])) {
				occurance.put(strChar[i], (occurance.get(strChar[i]) + 1));
			}else {
				occurance.put(strChar[i], 1);
			}
		}
		
		System.out.println(occurance);
	}
	
	private static void charOccurArray(String str) {
		char[] strChar = str.toLowerCase().toCharArray();
		
		Arrays.sort(strChar);
		
		int j = 0;
		for(int i = 0;i<strChar.length-1;i++) {
			if(strChar[i] != strChar[i+1]) {
				strChar[j++] = strChar[i]; 
			}
		}
		
		strChar[j++] = strChar[strChar.length-1];
		
		for(int k = 0; k<j;k++) {
			int count = 0;
			for(int l=0;l<str.length();l++) {
				char n = str.toLowerCase().charAt(l);
				if(strChar[k] == n) {
					count++;
				}
			}
			System.out.println("\"" + strChar[k] + "\"" + " :: " + count);
		}
	}
	
	public static void main(String[] args) {
		String str = "Kaustubhkaustubh";
		charOccurMap(str);
		charOccurArray(str);
	}

}
