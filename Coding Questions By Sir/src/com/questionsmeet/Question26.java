package com.questionsmeet;
/*
 * what is output?
Public static void m1 (object obj)
Public static void m1 (string str)
Main()
m1(null)

ans: String Class method will invoke

 */
public class Question26 {
	
	public static void m1(Object obj) {
		System.out.println("Object Method");
	}
	
	public static void m1(String str) {
		System.out.println("String Method");
	}
	
	/*public static void m1(Integer ch[]) {
		System.out.println("Array Method");
	}*/
	
	public static void main(String[] args) {
		
		//m1((Object)null);
		m1(null);
	}

}
