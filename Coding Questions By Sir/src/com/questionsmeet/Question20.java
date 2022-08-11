package com.questionsmeet;

public class Question20 {
	
	public static void main(String[] args) {
		
		B1 b1 = new B1();
		
		b1.m1(15);
		
	}

}

class A1{
	
	public void m1(Integer i) {
		System.out.println("Class-A");
	}
	
}

class B1 extends A1{
	
	public void m1(String s) {
		System.out.println("Class-B");
	}
	
}