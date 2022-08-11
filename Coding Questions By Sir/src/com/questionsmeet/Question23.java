package com.questionsmeet;
/*
 * WAP for below Pattern
111111
111122 
111333 
114444 
155555 
666666

 */
public class Question23 {
	
	public static void main(String[] args) {
		
		int num = 6;
		int end = num;//6
		
		for(int i = 1 ; i<=num ; i++) {
			for(int j = 1; j<=num ; j++) {
				if(j == end) {
					for(int k = end; k<=num ; k++) {
						System.out.print(i);
					}
					end--;
					break;
				}else {
					System.out.print(1);
				}
			}
			System.out.println();
		}
		
	}

}
