package com.questionsmeet;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//If we have a linked list and it contains duplicate values how to remove it
public class Question37 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(50);
		list.add(10);
		list.add(80);
		list.add(60);
		list.add(50);
		
	
				
	/*	Collections.sort(list);
		//10 10 50 50 60 80
		for(int i = 0 ; i<list.size()-1;i++) {
			if(list.get(i) == list.get(i+1)) {
				list.remove(i+1);
			}
		}*/
		
		Collections.sort(list);
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		Integer first = itr.next();
		while(itr.hasNext()) {
			Integer second = itr.next();
			if(first == second) {
				itr.remove();
			}
			first = second;
		}
		
		System.out.println(list);
		
		
		
	}

}
