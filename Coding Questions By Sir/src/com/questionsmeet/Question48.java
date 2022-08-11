package com.questionsmeet;

import java.util.ArrayList;
import java.util.List;

/*
 * replace element as "abcdef" who multple of by 3,5

 */
public class Question48 {

	public static void main(String[] args) {

		//If element in List
		List<String> list = new ArrayList<String>();

		list.add("90");
		list.add("3");
		list.add("10");
		list.add("3");
		list.add("15");

		List<Integer> list2 = new ArrayList<Integer>();
		for(String str : list) {
			list2.add(Integer.parseInt(str));
		}
	
		int length = list.size();
		for(int i=0;i<length;i++) {
			int num = list2.get(i);
			if((num%3 == 0)&&((num%5 == 0))){
				list.set(i, "abcdef");
			}
		}
		System.out.println(list);
		
		/*//If element in Array
		String[] arr = {"90","3","10","3","15"};
		
		for(int i=0;i<arr.length;i++) {
			int num = Integer.parseInt(arr[i]);
			if((num%3 == 0)&&(num%5 == 0)) {
				arr[i] = "abcdef";
			}
		}
		for(String o : arr) {
			System.out.print(o + ",");
		}*/
	}

}
