package week3.Day1;

import org.college.College;

public abstract class University {
	
	public void Pg() {
		System.out.println("I am Pg class implemented in the abstract method");
		
	}
	
	public abstract void ug();
	
	public static void main(String[] args) {
		College Co = new College();
		Co.Pg();
		Co.ug();
	}
}
