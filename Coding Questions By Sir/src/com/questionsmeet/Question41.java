package com.questionsmeet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//add element into arrylist and remove duplicates
public class Question41 {

	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(50);
		
		/*//by iterator
		Collections.sort(list);
		Iterator<Integer> itr = list.iterator();
		
		Integer first = itr.next();
		
		while(itr.hasNext()) {
			Integer second = itr.next();
			if(first == second) {
				itr.remove();
			}
			first = second;
		}
		System.out.println(list);*/
		
		/*//by contains method 
		List<Integer> noDup = new ArrayList<Integer>();
		
		for(Integer i : list) {
			if(!noDup.contains(i)) {
				noDup.add(i);
			}
		}
		System.out.println(noDup);*/
		
		//by using set
		Set<Integer> nodup = new LinkedHashSet<Integer>(list);
		System.out.println(nodup);
		
	}
}
