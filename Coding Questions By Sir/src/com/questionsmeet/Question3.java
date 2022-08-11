package com.questionsmeet;

public class Question3 {
	
	public static void main(String[] args) {
		
		String str = "babaad";
		String palin = "";
		for(int i = 0; i<str.length();i++) {
			for(int j = i+1;j<str.length();j++) {
				String temp = str.substring(i, (j+1));//ba
				
				//skip if original string and sub string have same size
				if(temp.length() == str.length()) {
					continue;
				}
				
				StringBuilder temp1 = new StringBuilder(temp);//ba
				temp1.reverse();//ab
				String temp2 = new String(temp1);
				
				if(temp.equalsIgnoreCase(temp2)) {
					if(palin.length()<temp.length()) {
						palin=temp;
					}
				}
			}
		}
		System.out.println(palin);
	}
}
