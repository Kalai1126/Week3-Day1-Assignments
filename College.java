package org.college;

import week3.Day1.University;

public class College extends University {
	
	public void collegeName() {
		System.out.println("The CollegeName is : Vel's Srinivas College of Eng. & Tech");
	}

	public void collegecode() {
		System.out.println("The College code is 3160112");
	}
	
	public void collegeRank() {
		System.out.println("The CollegeRank is '2'");
	}

	@Override
	public void ug() {
		// TODO Auto-generated method stub
		System.out.println("I am UG method unimplemented in abstract class, but implemented in inherited College Class");
	}
}
