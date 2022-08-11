package com.questionsmeet;
//What will be the o/p?
public class Question19 {
	
	public static void main(String[] args) {
		B b = new B();
		b.m1("");
	}

}

class A{
	
	public void m1(Object o) {
		System.out.println("Class-A");
	}
	
}

class B extends A{
	
	public void m1(String s) {
		System.out.println("Class-B");
	}
	
}
