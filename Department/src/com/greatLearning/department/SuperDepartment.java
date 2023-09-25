package com.greatLearning.department;

import com.greatLearning.constants.*;

public class SuperDepartment  {

	public String departmentName() {

		System.out.print("Welcome to ");
		return Constants.SUPER_DEPARTMENT;
	}
	

	public String getTodaysWork() {

		return Constants.SUPER_GETTODAYSWORK;
	}
	

	public String getWorkDeadLine() {

		return Constants.SUPER_GETWORKDEADLINE;
	}
	

	public String isTodayAHoliday() {

		return Constants.SUPER_ISTODAYAHOLIDAY;
	}
}
