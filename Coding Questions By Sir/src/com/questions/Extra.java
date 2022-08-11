package com.questions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Extra {
	
	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<Integer>();
		
		//l.add(15000);
		l.add(25000);
		l.add(25000);
		l.add(25000);
		l.add(25000);
		//l.add(5000);
		//l.add(1000);
		//l.add(8000);
		
		Collections.sort(l);
		System.out.println(l);
		
		int a = l.get(l.size()-1);
		
		if(a == l.get(l.size()-2)) {
			find2E(l,a);
			
		}else {
			System.out.println(l.get(l.size()-2));
		}
	}

	static int b = 3;//4
	private static void find2E(List<Integer> l, int a) {
		if(a == l.get(l.size()-b)) {
			if(b<l.size()) {
				b++;
				find2E(l, a);
				
			}else {
				System.out.println("All No are same");
			}
		}else {
			System.out.println(l.get(l.size()-b));
		}
		
	}

}
