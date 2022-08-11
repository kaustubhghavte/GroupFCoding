package com.questionsmeet;
/*
 * Prog for Array it contain 1 to 20
replace element as "abc" who is multple of 3
replace element as "def" who is multple of5
 */
public class Question49 {
	
	public static void main(String[] args) {
		
		String[] arr = {"1","2","3","4","5","6","7","8","9","10",
						"11","12","13","14","15","16","17","18","19","20"};
		
		for(int i=0;i<arr.length;i++) {
			int num = Integer.parseInt(arr[i]);
			
			if(num%3==0 && num%5!=0) {
				arr[i] = "abc";
			}else if(num%5==0 && num%3!=0) {
				arr[i] = "def";
			}
			/*
			 * If interviewer ask to satisfy condition that if num is 
			 * multiplier both 3 and 5 both then replace with "NEW"
			 */
			/*else if(num%5==0 && num%3==0) {
				arr[i] = "NEW";
			}*/
		}
		
		for(String str : arr) {
			System.out.print(str + ",");
		}
		
	}

}
