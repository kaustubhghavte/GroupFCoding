package com.questionsmeet;

import java.util.ArrayList;
import java.util.List;

/*
 * write a program - We have ArrayList of employee- 
 * get the employee where name=abc, tell the all possible approaches 
 * to solve the problem (lambda expected)
 */
public class ExtraQuestion2 {
	
	public static void main(String[] args) {
		
		List<EmployeeQ_11> l = new ArrayList<EmployeeQ_11>();
		
		l.add(new EmployeeQ_11(1, "Kaustubh", "15000"));
		l.add(new EmployeeQ_11(2, "abc", "19000"));
		l.add(new EmployeeQ_11(3, "Jitesh", "50000"));
		l.add(new EmployeeQ_11(4, "Arati", "100000"));
		
		
		//By using Lambda Expression
		l.forEach(e -> {
			
			if(e.getName() == "abc") {
				System.out.println(e);
			}
			}
			);
		
		//by using for loop
		for(EmployeeQ_11 e : l) {
			if(e.getName() == "abc") {
				System.out.println(e);
			}
		}
		
	}

}
