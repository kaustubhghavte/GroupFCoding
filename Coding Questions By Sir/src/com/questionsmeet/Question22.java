package com.questionsmeet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//write duplicate occurrence of string in sentence print it's occurrence count
public class Question22 {
	
	//by array
	public static void getOccurancebyArray(String str) {
		str = str.toLowerCase();
		char[] strArr = str.toCharArray();
		
		Arrays.sort(strArr);
		int j = 0;
		for(int i = 0; i < strArr.length-1 ; i++) {
			if(strArr[i] != strArr[i+1]) {
				strArr[j++] = strArr[i]; 
			}
		}
		
		strArr[j++] = strArr[strArr.length-1];
		
		for(int k = 0; k<j ; k++) {
			int count = 0;
			char alph = strArr[k];
			for(int l = 0 ; l<str.length();l++) {
				if(alph == str.charAt(l)) {
					count++;
				}
			}
			System.out.println("\"" + alph + "\"" + "::" + count);
		}
	}
	
	public static void getOccurancebyMap(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		str = str.toLowerCase();
		
		char[] strArray = str.toCharArray();
		
		for(Character i : strArray) {
			if(!map.containsKey(i)) {
				map.put(i, 1);
			}else {
				map.put(i, map.get(i)+1);
			}
		}
		
		Set<Entry<Character, Integer>> maps = map.entrySet();
		
		for(Entry<Character, Integer> j : maps) {
			
			System.out.println("\"" + j.getKey() + "\"" + "::" + j.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		//getOccurancebyArray("KaustubhKaustubh");
		getOccurancebyMap("KaustubhKaustubh");
	}

}
