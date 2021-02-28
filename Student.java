package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("The student name is Kalaivani");
	}
	
	public void studentDept() {
		System.out.println("The student dep is EEE");
	}
	
	public void studentId() {
		System.out.println("The student ID is 2326");
	}

	public static void  main(String[] args) {
		
		Student St = new Student();
		System.out.println("From 1st level College Class inheritence:");
		St.collegeName();
		St.collegecode();
		St.collegeRank();
		System.out.println("\n");
		
		System.out.println("From 2nd level Department Class inheritence:");
		St.deptName();
		System.out.println("\r\n");

		System.out.println("From subclass Class:");
		St.studentName();
		St.studentDept();
		St.studentId();
	}
	
}
