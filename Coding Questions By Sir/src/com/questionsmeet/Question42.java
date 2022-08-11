package com.questionsmeet;
//write code for method overloading

public class Question42 {
	
	public void method1(int a) {
		System.out.println("method-1 with int parameter");
	}
	
	public void method1(String str) {
		System.out.println("method-1 with String parameter");
	}
	public void method1(int a,String str) {
		System.out.println("method-1 with int & String parameter");
	}
	
	public void method1(String str, int a) {
		System.out.println("method-1 with String & int parameter");
	}
	
	public static void main(String[] args) {
		Question42 question42 = new Question42();
		question42.method1(50);
		question42.method1("String");
		question42.method1(50,"String");
		question42.method1("String",50);
	}


}
