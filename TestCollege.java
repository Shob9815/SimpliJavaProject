package com.javaprograms;

public class TestCollege {

	public static void main(String args[])
	{
		System.out.println(InterfaceCollege.CollegeName); //here we have called the String created in InterfaceCollege without creating an object, because it is static
		
		
		//here we create an object for an interface with respect to CSE implemented class
		InterfaceCollege cse = new InterfaceExampleComputerScience();
		
		cse.StudentDetails();
		cse.StudentResults();
		
		InterfaceCollege ece = new InterfaceExampleECE();
		
		ece.StudentDetails();
		ece.StudentResults();
		
	}
}
