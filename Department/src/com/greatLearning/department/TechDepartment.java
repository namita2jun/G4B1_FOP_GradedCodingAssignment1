package com.greatLearning.department;

import com.greatLearning.constants.Constants;

public class TechDepartment extends SuperDepartment {

	public String departmentName() {

		super.departmentName();
		return Constants.TECH_DEPARTMENT;
	}


	public String getTodaysWork() {

		return Constants.TECH_GETTODAYSWORK;
	}


	public String getWorkDeadLine() {

		return Constants.GETWORKDEADLINE;
	}


	public String getTechStackInformation() {

		return Constants.TECH_GETTECHSTACKINFO;
	}
}
