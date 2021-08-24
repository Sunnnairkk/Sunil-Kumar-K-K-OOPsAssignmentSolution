package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {

	String departmentName() {
		return "Admin Department";
	}
	
	String getTodaysWork() {
		return "Complete your Document Submission";
		
	}
	
	String getWorkDeadline() {
		return "Complete by EOD";
		
	}
	
}

