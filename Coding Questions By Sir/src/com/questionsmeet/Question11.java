package com.questionsmeet;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * 11.	If you have emp and empdto list and we need to filter emp object with greater 
 * than 15000 salary and we need to store result int empdto list , How you will do that
 */
public class Question11 {
	
	public static void main(String[] args) {
		
		List<EmployeeQ_11> empL = new ArrayList<>();
		
		empL.add(new EmployeeQ_11(1, "Kaustubh", "16000"));
		empL.add(new EmployeeQ_11(2, "Jitesh", "10000"));
		empL.add(new EmployeeQ_11(3, "Arati", "15000"));
		empL.add(new EmployeeQ_11(4, "Pushpa", "14000"));
		empL.add(new EmployeeQ_11(5, "Madhusudan", "18000"));
		
		List<EmployeeQ_11> empdto = new ArrayList<>();
		
		//by if statement
		/*for(EmployeeQ_11 emp : empL) {
			if(Integer.parseInt(emp.getSalary()) > 15000) {
				
				empdto.add(emp);
				
			}
		}*/
		
		//by stream and predicate
		Predicate<EmployeeQ_11> greaterEmp = emp -> Integer.parseInt(emp.getSalary()) > 15000;
		
		empdto = empL.stream().filter(greaterEmp).collect(Collectors.toList());
		
		System.out.println(empdto);
	}

}
