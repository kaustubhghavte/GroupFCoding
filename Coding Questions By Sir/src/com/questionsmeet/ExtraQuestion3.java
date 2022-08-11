package com.questionsmeet;
/*
 * what if we modified emp_name while iterating?
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ExtraQuestion3 {
	
	public static void main(String[] args) {
		
		List<EmployeeQ_11> l = new ArrayList<EmployeeQ_11>();
		
		l.add(new EmployeeQ_11(1, "Kaustubh", "15000"));
		l.add(new EmployeeQ_11(2, "abc", "50000"));
		l.add(new EmployeeQ_11(3, "Jitesh", "5000"));
		l.add(new EmployeeQ_11(4, "Arati", "6000"));
		
		
		/*//By using Iterator
		Iterator<EmployeeQ_11> itr = l.iterator();
		
		while(itr.hasNext()) {
			EmployeeQ_11 e = itr.next();
			if(e.getId() == 2) {
				e.setName("Pushpa");
			}
		}*/
		
		/*//By using For each loop
		for(EmployeeQ_11 e : l) {
			if(e.getId() == 2) {
				e.setName("Pushpa");
			}
		}*/
		
		//By using for loop
		for(int i = 0;i<l.size();i++) {
			if(l.get(i).getId() == 2) {
				l.get(i).setName("Pushpa");
			}
		}
		
		System.out.println(l);
	}

}
