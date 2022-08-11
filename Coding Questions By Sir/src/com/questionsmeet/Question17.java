package com.questionsmeet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/*
 * how to sort the data 
	(2, Programming) (3, Databases) (4, ETL) (1, Docker) (5, Cloud)

 */
public class Question17 {

	public static void main(String[] args) {
		
		/*//By using TreeMap
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(2, "Programming");
		map.put(3, "Database");
		map.put(4, "ETL");
		map.put(1, "Docker");
		map.put(5, "Cloud");
		
		System.out.println(map);*/
		
		/*//by bubble swap
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(2, "Programming");
		map1.put(3, "Database");
		map1.put(4, "ETL");
		map1.put(1, "Docker");
		map1.put(5, "Cloud");
		
		Map<Integer, String> Sortedmap = new LinkedHashMap<Integer, String>();
		Set<Integer> set= map1.keySet();
		List<Integer> list = new ArrayList<Integer>(set);
		
		boolean isSwap = true;
		while(isSwap) {
			isSwap = false;
			for(int i = 0; i<list.size()-1;i++) {
				if(list.get(i) > list.get(i+1)) {
					isSwap = true;
					Integer temp = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, temp);
				}
			}
		}
		for(Integer i : list) {
			Sortedmap.put(i, map1.get(i));
		}
		System.out.println(Sortedmap);*/
		
		//by Collections sort method
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(2, "Programming");
		map2.put(3, "Database");
		map2.put(4, "ETL");
		map2.put(1, "Docker");
		map2.put(5, "Cloud");
		
		
		Set<Integer> s= map2.keySet();
		List<Integer> l = new ArrayList<Integer>(s);
		
		Collections.sort(l);
		
		Map<Integer, String> Sortedmap1 = new LinkedHashMap<Integer, String>();
		
		for(Integer i : l) {
			Sortedmap1.put(i, map2.get(i));
		}
		
		System.out.println(Sortedmap1);
	}
}
