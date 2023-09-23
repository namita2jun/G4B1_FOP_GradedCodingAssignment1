package com.greatLearning.department;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		super.departmentName();
		return "Tech Department";
	}

	public String getTodaysWork() {

		String getTodaysWork = "Complete coding of module 1";
		return getTodaysWork;

	}

	public String getWorkDeadLine() {
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		 return "core Java";
	}
}
