package com.questionsmeet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * if we have a collection of employee with salary find 2nd highest
 */
public class ExtraQuestion1 {
	
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(15000);
		list.add(20000);
		list.add(20000);
		list.add(20000);
		list.add(20000);
		list.add(8000);
		list.add(5000);
		list.add(4000);
		
		Collections.sort(list);
		
		int a = list.get(list.size()-1);//20000
		
		if(a == list.get(list.size()-2)) {//20000 == 20000
			find2nd(list,a);//list,20000
		
		}else {
			System.out.println(a);
		}

	}
	
	static int b=3;
	private static void find2nd(List<Integer> list,int a) {
		if(a == list.get(list.size()-b)) {//20000 == 15000
			if(b<list.size()-1) {
				b++;
			}else {
				System.out.println("All value are Same");
				return;
			}
			find2nd(list,a);
		}else {
			System.out.println(list.get(list.size()-b));
		}
	}

}
