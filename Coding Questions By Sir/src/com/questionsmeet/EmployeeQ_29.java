package com.questionsmeet;

public class EmployeeQ_29 implements Comparable<EmployeeQ_29>{
	
	private int eID;
	private int eAge;
	private String eName;
	
	public EmployeeQ_29(int eID, int eAge, String eName) {
		this.eID = eID;
		this.eAge = eAge;
		this.eName = eName;
	}

	public int geteID() {
		return eID;
	}

	public int geteAge() {
		return eAge;
	}

	public String geteName() {
		return eName;
	}

	@Override
	public String toString() {
		return "EmployeeQ_29 [eID=" + eID + ", eAge=" + eAge + ", eName=" + eName + "]";
	}

	@Override
	public int compareTo(EmployeeQ_29 emp) {
		if(this.eAge == emp.eAge) return 0;
		else if(this.eAge> emp.eAge) return 1;
		else return -1;
	}

}
