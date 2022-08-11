package com.questionsmeet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Sort by value in map collection
public class ExtraQuestion4 {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		map.put("Chetan", 5);
		map.put("Kaustubh", 1);
		map.put("Arati", 4);
		map.put("Tejas", 3);
		map.put("Ravi", 2);
		
		Set<Entry<String,Integer>> set =map.entrySet();
		
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		
		//System.out.println(list.size());
		
		boolean isSwap=true;
		
		while(isSwap) {
			
			isSwap=false;
			
			for(int i=0;i<list.size()-1;i++) {
				if(list.get(i).getValue() > list.get(i+1).getValue()) {
					
					isSwap=true;
					
					Entry<String,Integer> temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
				}
			}
		}
		
		map.clear();
		
		for(Entry<String,Integer> l:list) {
			map.put(l.getKey(), l.getValue());
		}
		
		System.out.println(map);
		
	}

}
