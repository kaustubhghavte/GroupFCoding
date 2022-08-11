package com.questionsmeet;

import java.util.Comparator;

public class SortByAgeQ_29 implements Comparator<EmployeeQ_29>{

	@Override
	public int compare(EmployeeQ_29 emp1, EmployeeQ_29 emp2) {
		if(emp1.geteAge() == emp2.geteAge()) return 0;
		else if(emp1.geteAge()>emp2.geteAge()) return 1;
		else return -1;
	}

}
