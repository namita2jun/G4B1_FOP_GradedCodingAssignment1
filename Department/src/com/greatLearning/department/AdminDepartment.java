package com.greatLearning.department;

import com.greatLearning.constants.Constants;

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {

		super.departmentName();
		return Constants.ADMIN_DEPARTMENT;
	}
	

	public String getTodaysWork() {

		return Constants.ADMIN_GETTODAYSWORK;
	}
	

	public String getWorkDeadLine() {

		return Constants.GETWORKDEADLINE;
	}

}
