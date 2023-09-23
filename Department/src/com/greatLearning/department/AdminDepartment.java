package com.greatLearning.department;

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		super.departmentName();
		return "Admin Department";
	}

	public String getTodaysWork() {

		String getTodaysWork = "Complete your documents Submission";
		return getTodaysWork;

	}

	public String getWorkDeadLine() {
		return "Complete by EOD";
	}

}
