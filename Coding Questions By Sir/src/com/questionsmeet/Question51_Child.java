package com.questionsmeet;

public class Question51_Child extends Question51_Parent{

	public void run()
	{
	    super.run();
	    System.out.println("child run");
	}

	public void walk()
	{
		super.walk();
	    System.out.println("child walk");
	}
}
