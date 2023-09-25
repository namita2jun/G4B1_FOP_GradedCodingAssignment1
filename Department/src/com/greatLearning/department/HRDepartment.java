package com.greatLearning.department;

import com.greatLearning.constants.Constants;

public class HRDepartment extends SuperDepartment {

	public String departmentName() {

		super.departmentName();
		return Constants.HR_DEPARTMENT;
	}
	

	public String getTodaysWork() {

		return Constants.HR_GETTODAYSWORK;
	}
	

	public String getWorkDeadLine() {

		return Constants.GETWORKDEADLINE;
	}
	

	public String doActivity() {

		return Constants.HR_DOACTIVITY;
	}

}
