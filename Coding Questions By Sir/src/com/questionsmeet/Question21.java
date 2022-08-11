package com.questionsmeet;
//WAP Fibboniccai Series program
 //0 1 1 2 3 5 8 . . .
public class Question21 {
	
	public static void fibboniSeries(int num) {
		
		int first = 0;
		int second = 1;
		System.out.print(first + ", " + second + ", ");
		
		for(int i = 3; i<=num; i++) {
			second = first + second;
			first = second - first; 
			
			System.out.print(second + ", ");
		}
		
	}
	
	public static void main(String[] args) {
		
		fibboniSeries(10);
		
	}

}
