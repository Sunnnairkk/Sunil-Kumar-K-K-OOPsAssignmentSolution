/* 
 * OOPsAssignmentSolution - Assignment 1
 * 
 * Sunil Kumar K K
 */
package com.greatlearning.model;

import com.greatlearning.model.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment admindepartment = new AdminDepartment();
		
		System.out.println("Welcome to Admin Department");
		System.out.println(admindepartment.getTodaysWork());
		System.out.println(admindepartment.getWorkDeadline());
		System.out.println(admindepartment.isTodayAHoliday()+"\n\n");
		
		
		HrDepartment hrdepartment = new HrDepartment();
		
		System.out.println("Welcome to HR Department");
		System.out.println(hrdepartment.doActivity());
		System.out.println(hrdepartment.getTodaysWork());
		System.out.println(hrdepartment.getWorkDeadline());
		System.out.println(hrdepartment.isTodayAHoliday()+"\n\n");
		
		
		TechDepartment techdepartment = new TechDepartment();

		System.out.println("Welcome to Tech Department");
		System.out.println(techdepartment.getTodaysWork());
		System.out.println(techdepartment.getWorkDeadline());
		System.out.println(techdepartment.getTechStackInformatioin());
		System.out.println(techdepartment.isTodayAHoliday());
		
		
	}
	
}
	/*Required Output

Welcome to Admin Department
Complete your documents submission
Complete by EOD 
Today is not a Holiday

 Welcome to HR Department
team Lunch
Fill today’s timesheet and mark your attendance
Complete by EOD 
Today is not a Holiday


 Welcome to Tech Department
Complete coding of Module 1
Complete by EOD 
 Core Java 
Today is not a Holiday

	 */


