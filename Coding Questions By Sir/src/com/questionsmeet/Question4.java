package com.questionsmeet;

public class Question4 {
	
	public static void main(String[] args) {
		
		int input = 4;
		
		for(int i=1;i<=input;i++) {
			for(int j =1;j<=input;j++) {
				if(j == i) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
		
	}

}
