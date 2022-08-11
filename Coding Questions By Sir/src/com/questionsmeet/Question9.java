package com.questionsmeet;

import java.util.ArrayList;
import java.util.List;

//How can u write dynamically from 1 to 10 elements without using integrator or for loops 
//or any types of loops
public class Question9 {
	
	static List<Integer> l = new ArrayList<>();
	
	static void addNo(int a) {
		if(a>0) {
			addNo(a-1);
			l.add(a);
		}
		return;
	}

	public static void main(String[] args) {
		addNo(10);
		System.out.println(l);
	}
	
}
