package com.questionsmeet;

/*
 * Print numbers from 1 to 100 without using any loop or iterators or Stream.
Then modify the same program to print in reverse, from 100 to 1.

 */

public class Question35 {

	private static void print(int num) {
		if(num>0) {
			
			print(num-1);
			System.out.print(num + " ");
		}
		return;
	}
	
	public static void main(String[] args) {
		int input = 100;
		print(input);
	}
	
}
