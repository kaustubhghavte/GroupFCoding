package com.questionsmeet;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//How to find middle elements of array if you don't know array size
public class Question59 {
	
	public static void main(String[] args) {
		
		Integer arr[] = {1,2,3,5,8,9,4};
		
	/*	Integer arr1[] = new Integer[arr.length];
		for(int i = 0;i<arr.length;i++) {
			arr1[i] = arr[i];
		}*/
		
		List<Integer> l = Arrays.asList(arr);
		System.out.println(l);
		//Collections.sort(l);
		System.out.println(l);
		LinkedList<Integer> l1 = new LinkedList<>(l);
		//System.out.println(l1);
		int last = l1.getLast();
		
		int p1 = 0;
		int p2 = 0;
		
		while(arr[p2]!=last) {//4
			p1++;
			p2 = p2 + 2;
			
		}
		System.out.println(arr[p1]);
		
	}

}
