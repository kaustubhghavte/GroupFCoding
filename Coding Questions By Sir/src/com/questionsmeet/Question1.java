package com.questionsmeet;

public class Question1 {
	
	/*public static void main(String[] args){
		try{
		System.out.println("1");
		int i=10/0;
		}
		catch(NullPointerException e){
			System.out.println("2");
		try{
			System.out.println("3");
		int i=20/0;
		}
		catch(ArithmeticException ae){
			System.out.println("4");
		ae.printStackTrace();
		}
		}
		}*/
	
	public static void main(String[] args){
		try{
		System.out.println("1");
		int i=10/0;
		}
		catch(ArithmeticException e){
			System.out.println("2");
		try{
			System.out.println("3");
		int i=20/0;
		}
		catch(ArithmeticException ae){
			System.out.println("4");
			System.out.println(ae.getMessage());
		}
		}
		}

}
