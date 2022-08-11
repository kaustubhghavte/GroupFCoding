package com.questionsmeet;

import java.util.ArrayList;
import java.util.List;

/*
 * There are two string arraylist one with a,b,c,d and another with c,d,e,
 * Write a program to find common element in two list
 */
public class Question39 {
	
	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("c");
		l2.add("d");
		l2.add("e");
		
	//by loop
		/*for(int i = 0; i<l1.size();i++) {
			int count = 0;
			for(int j = 0; j<l2.size();j++) {
				if(l1.get(i).equalsIgnoreCase(l2.get(j))) {
					count++;
				}
			}
			if(count >0) {
				System.out.println(l1.get(i));
			}
		}*/
		
		List<String> common = new ArrayList<String>(l1);
		
		common.retainAll(l2);
		
		System.out.println(common);
		
	}

}
