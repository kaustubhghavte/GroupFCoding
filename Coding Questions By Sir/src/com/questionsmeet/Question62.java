package com.questionsmeet;
/*
WAP for pattern 

**
*
**
*
**
*
**
***

*/
public class Question62 {
	
	public static void main(String[] args) {
		
		int num = 8;
		int star = 0;
		for(int i = 1 ; i<= num;i++) {
			
			if(i == num) {
				star = 3;
			}else if (i%2 == 0) {
				star = 1;
			}else if(i%2 != 0) {
				star = 2;
			}
			
			for(int j = 1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
