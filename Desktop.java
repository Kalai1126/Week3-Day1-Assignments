package org.system;

import week3.Day1.Hardware;
import week3.Day1.Software;

public class Desktop extends Computer implements Hardware, Software{

	public void desktopSize() {
		
		System.out.println("The desktopSize is 15 inch");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop OS = new Desktop();
		OS.computerModel();
		OS. desktopSize();
		OS.hardwareResources();
		OS.softwareResources();
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("I am the software implemented through Multiple inheritence in Desktop class");
		
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("I am the Hardware implemented through Multiple inheritence in Desktop class");

	}

}
