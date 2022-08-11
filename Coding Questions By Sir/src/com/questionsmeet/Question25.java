package com.questionsmeet;

import java.util.ArrayList;
import java.util.List;

public class Question25 {
	
	/*
	 * 25.	8 unique balls are there. Comparable weighing machine is there.
	 * Among 8 balls, 7 weighs same and one is heavier. 
	 * Find at least for how many times you will use weighing machine to find heavier ball.
	 * 
	 * Ans:
	 * 
	 * Weight 4 balls so 2 set will form // 1 NOS
	 * 
	 * then find whose weight is max between to set
	 * 
	 * then take that set and again make 2 set that is of size 2
	 * 
	 * then weight and then find max weight set // 2 NOS
	 * 
	 * again make 2 set of size 1
	 * 
	 * weight the balls then u get maximum weight ball //3 NOS
	 * 
	 * So you need to use 3 time the weighing machine
	 */
	
	/*
	 * 
	 * list - 8 balls
	 * 
	 * 0 - 3 - 1 set
	 * 4-7 - 2 set
	 * 1 set > 2 set weight - 1
	 * 1 set = 0 - 3
	 * 0-1 - 3 set
	 * 2-3 - 4set
	 * 3 set > 4 set weight - 2
	 * 0 > 1 weight - 3
	 */

	public static void main(String[] args) {
		
		int timesWeight=0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(50);
		list.add(50);
		list.add(50);
		list.add(50);
		list.add(50);
		list.add(51);
		list.add(50);
		list.add(50);
		
		int set1Size = list.size()/2;
		
		//System.out.println(set1Size);
		
		//for set 1
		int weightSet1 = 0;
		for(int i = 0; i<set1Size;i++) {
			weightSet1 = weightSet1 + list.get(i);
			//System.out.println(1);
		}
		//for set 2
		int weightSet2 = 0;
		for(int i = set1Size; i<list.size();i++) {
			weightSet2 = weightSet2 + list.get(i);
			//System.out.println(2);
		}
		
		timesWeight++;
		if(weightSet1 > weightSet2) {
			
			//for set 3
			int weightSet3 = 0;
			for(int j = 0; j<set1Size/2;j++) {
				//System.out.println(3);
				weightSet3 = weightSet3 + list.get(j);
			}
			
			//for set 4
			int weightSet4 = 0;
			for(int j = set1Size/2; j<set1Size;j++) {
				weightSet4 = weightSet4 + list.get(j);
				//System.out.println(4);
			}
			//System.out.println(weightSet3 + " " + weightSet4);
				timesWeight++;
				if(weightSet3 > weightSet4) {
					//System.out.println(5);
					timesWeight++;
					if(list.get(0) > list.get((set1Size/2)-1)) {
						//System.out.println(6);
						System.out.println(list.get(0) + " of Index " + 0 + " high" + " No of Weight = " + timesWeight);
					}else {
						System.out.println(list.get((set1Size/2)-1)+" of Index " + ((set1Size/2)-1) + " high" + " No of Weight = " + timesWeight);
					}
					
					
				}else {
					timesWeight++;
					if(list.get(set1Size/2) > list.get(set1Size-1)) {
						//System.out.println(6);
						System.out.println(list.get(set1Size/2) + " of Index " + (set1Size/2) + " high" + " No of Weight = " + timesWeight);
					}else {
						System.out.println(list.get(set1Size-1) + " of Index " + (set1Size-1) + " high" + " No of Weight = " + timesWeight);
					}
					
				}
//---------------------------------------------------------------------------------------------			
		}else {
			
			//for set 3
			int weightSet3 = 0;
			for(int j = set1Size; j<set1Size+2;j++) {
				//System.out.println(3);
				weightSet3 = weightSet3 + list.get(j);
			}
			
			//for set 4
			int weightSet4 = 0;
			for(int j = set1Size+2; j<list.size();j++) {
				weightSet4 = weightSet4 + list.get(j);
				//System.out.println(4);
			}
			//System.out.println(weightSet3 + " " + weightSet4);
				timesWeight++;
				if(weightSet3 > weightSet4) {
					//System.out.println(5);
					timesWeight++;
					if(list.get(set1Size) > list.get(set1Size+(2/2))) {
						//System.out.println(6);
						System.out.println(list.get(set1Size) + " of Index " + set1Size + " high" + " No of Weight = " + timesWeight);
					}else {
						System.out.println(list.get(set1Size+(2/2))+" of Index " + (set1Size+(2/2)) + " high" + " No of Weight = " + timesWeight);
					}
					
					
				}else {
					timesWeight++;
					if(list.get(set1Size+2) > list.get(list.size()-1)) {
						//System.out.println(6);
						System.out.println(list.get(set1Size+2) + " of Index " + (set1Size+2) + " high" + " No of Weight = " + timesWeight);
					}else {
						System.out.println(list.get(list.size()-1) + " of Index " + (list.size()-1) + " high" + " No of Weight = " + timesWeight);
					}
					
				}
		}
		
	}
}
