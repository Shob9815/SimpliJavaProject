package com.javaprograms;

public class InterfaceExampleComputerScience implements InterfaceCollege {
	
	//we use implements keyword here to call the methods in interface and then it gives error so we need to add unimplemented methods

	@Override
	public void StudentDetails() {
		
		System.out.println("Student Details of CSE");
		
	}

	@Override
	public void StudentResults() {
		 
		System.out.println("Student Results of CSE");
		
	}
	
	public static void main(String args[])
	{
		
	}

}
