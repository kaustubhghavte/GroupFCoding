package com.questionsmeet;

import java.util.Scanner;

public class Question36 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char a;
		do {
			
			System.out.println("Please Enter number >>");
			int num = scanner.nextInt();
			String twoDigitWord = toWord(num);
			System.out.println(twoDigitWord);
			System.out.println("Do you want to continue if yes enter 'y'");
			a = scanner.next().charAt(0);
		}while(a == 'y');
	}
	
	public static String toWord(int num) {
		String str = "";
		if(num<100) {
			str = twoNum(num);
		}else if(num>=100 && num<1000) {
			if(num%100 == 0) {
				str = twoNum(num/100)+ " hundred ";
			}else {
				
				str = twoNum(num/100)+ " hundred " + toWord(num%100);
			}
		}else if(num>=1000 && num<100000){
			if(num%1000 == 0) {
				str = twoNum(num/1000)+ " thousand ";
			}else {
				
				str = twoNum(num/1000)+ " thousand " + toWord(num%1000);
			}
			
		}else if(num>=100000 && num<10000000) {
			if(num%100000 == 0) {
				str = twoNum(num/100000)+ " lakh ";
			}else {
				
				str = twoNum(num/100000)+ " lakh " + toWord(num%100000);
			}
		}
		return str;
	}
	
	public static String twoNum(int num) {
		
		String uw[] = {"Zero","One","Two","Three","Four","Five","Six","Seven",
				   "Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen",
				   "Sixteen","Seventeen","Eighteen","Nineteen"};
	
		String tw[] = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy",
					"Eighty","Ninety"};
		
		
		String str = "";
		if(num <20) {
			str = uw[num];
		}else if(num>=20 && num<100) {
			if(num%10 == 0){
				str = tw[num/10];
			}else{
				str = tw[num/10] + "-" + uw[num%10];
			}
		}
		return str;
	}
}
