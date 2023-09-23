package com.greatLearning.Driver;

import java.util.Scanner;

import com.greatLearning.department.AdminDepartment;
import com.greatLearning.department.HRDepartment;
import com.greatLearning.department.SuperDepartment;
import com.greatLearning.department.TechDepartment;

public class Driver {

	/**
	 * @param This method is used for dynamic selection of departments by the user.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Super department");
		System.out.println("2. Admin department");
		System.out.println("3. Hr department");
		System.out.println("4.Tech department");

		Scanner sc = new Scanner(System.in);

		int option = sc.nextInt();

		switch(option) {
		case 1: {
			SuperDepartment sd = new SuperDepartment();
			System.out.println(sd.departmentName());
			System.out.println(sd.getTodaysWork());
			System.out.println(sd.getWorkDeadLine());
			System.out.println(sd.isTodayAHoliday());
			break;
		}
		case 2:{
			AdminDepartment adminDepartment = new AdminDepartment();
			System.out.println(adminDepartment.departmentName());
			System.out.println(adminDepartment.getTodaysWork());
			System.out.println(adminDepartment.getWorkDeadLine());
			System.out.println(adminDepartment.isTodayAHoliday());
			break;
		}
		case 3:{
			HRDepartment hrDepartment = new HRDepartment();
			System.out.println(hrDepartment.departmentName());
			System.out.println(hrDepartment.doActivity());
			System.out.println(hrDepartment.getTodaysWork());
			System.out.println(hrDepartment.getWorkDeadLine());
			System.out.println(hrDepartment.isTodayAHoliday());
			break;

		}
		case 4:{
			TechDepartment techDepartment = new TechDepartment();
			System.out.println(techDepartment.departmentName());
			System.out.println(techDepartment.getTodaysWork());
			System.out.println(techDepartment.getWorkDeadLine());
			System.out.println(techDepartment.getTechStackInformation());
			System.out.println(techDepartment.isTodayAHoliday());
			break;
		}
		default: {
			System.out.println("Please Enter Valid Option");

		}

		}
		sc.close();


	}

}
