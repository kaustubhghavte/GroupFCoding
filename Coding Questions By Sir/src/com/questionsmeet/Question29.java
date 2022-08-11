package com.questionsmeet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Employee Class have id,age,name sort it age wise
public class Question29 {
	
	public static void main(String[] args) {
		
		EmployeeQ_29 emp1 = new EmployeeQ_29(1, 26, "Kaustubh");
		EmployeeQ_29 emp2 = new EmployeeQ_29(2, 31, "Jitesh");
		EmployeeQ_29 emp3 = new EmployeeQ_29(3, 20, "Pooja");
		EmployeeQ_29 emp4 = new EmployeeQ_29(4, 39, "Sham");
		EmployeeQ_29 emp5 = new EmployeeQ_29(5, 40, "Rohit");
		
		List<EmployeeQ_29> list = new ArrayList<EmployeeQ_29>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		/*//sort by using Comparable in ascending order
		Collections.sort(list);*/
		
		/*//sort by using Comparator in ascending order
		Collections.sort(list, new SortByAgeQ_29());*/
		
		/*//sort by using Comparable in descending order
		Collections.sort(list,Collections.reverseOrder());*/
		
		/*//sort by using Comparator in descending order
		Collections.sort(list, new SortByAgeQ_29().reversed());*/
		
		System.out.println(list);
		
	}

}
