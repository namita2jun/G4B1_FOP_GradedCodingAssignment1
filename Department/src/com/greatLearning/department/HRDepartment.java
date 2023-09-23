package com.greatLearning.department;

public class HRDepartment extends SuperDepartment {

	public String departmentName() {
		super.departmentName();
		return "Hr Department";
	}

	public String getTodaysWork() {

		String getTodaysWork = "Fill today’s timesheet and mark your attendance";
		return getTodaysWork;

	}

	public String getWorkDeadLine() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		 return "team Lunch";
	}
	

}
