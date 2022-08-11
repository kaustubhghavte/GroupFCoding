package com.questionsmeet;

public class Question5 {
	
	public static void main(String[] args) {
		
		int input = 6;
		/*int one = input;
		
		int half;
		if(input % 2 == 0) {
			half = 0;
		}else {
			half = (input/2)+1;
		}
		
		for(int i = 1;i<=input;i++) {
			for(int j = 1;j<=input;j++) {
				if(j == i) {
					System.out.print(1);
					if(i == half) {
						one--;
					}
				}else if(j == one) {
					System.out.print(1);
					one--;
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}*/
		
		int start = 1;
		int end = input;
		
		for(int i = 1 ; i<=input; i++) {
			for(int j = 1 ; j<=input; j++) {
				if(j == start || j == end) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			start++;
			end--;
			System.out.println();
		}
		
	}
}
