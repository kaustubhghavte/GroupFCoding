package com.questionsmeet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * if i hava 10 lakh numbers in array then how to find duplicates?
 */
public class Question61 {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,10,30,50};
		
		findDuplicate(arr);
		
	
	}

	private static void findDuplicate(int[] arr) {
	Map<Integer, Integer> count = new LinkedHashMap<Integer,Integer>();
		
		for(Integer i : arr) {
			if(count.containsKey(i)) {
				count.put(i, count.get(i)+1);
				
			}else {
				count.put(i, 1);
			}
		}
		
		System.out.println(count);
		
		Set<Entry<Integer, Integer>> set = count.entrySet();
		
		
		System.out.println("Duplicate Elements are : ");
		for(Entry<Integer, Integer> e : set) {
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}
		
	}

}
