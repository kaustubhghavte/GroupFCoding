package com.questionsmeet;
//WAP for Prime Number
public class Question14 {
	
	/*public static int primeNo(int num) {
		
		int count = 0;
		for(int i = 1;i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return num;
		}else {
			return 0;
		}
		
	}*/
	
	public static int primeNo(int num) {
		boolean flag = true;
		
		for(int i=2;i<num;i++) {
			
			if(num%i == 0) {
				flag = false;
				break;
			}
			
		}
		if(flag && num >1) {
			return num;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		
		int num = 71;
		int ans = primeNo(num);
		if(ans == 0) {
			System.out.println(num + " is not Prime Number");
		}else {
			System.out.println(num + " is Prime Number");
		}
	
	}

}
