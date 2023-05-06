package com.javaprograms;

public class InterfaceExampleECE implements InterfaceCollege, CollegeOfficeDetails {
	
	//so, here we have called two parents with the help of interface (one child inheriting from two sets of parents - multiple inheritance)

	@Override
	public void StudentDetails() {
		
		System.out.println("Print the ECE Student Details");
		
	}

	@Override
	public void StudentResults() {
		
		System.out.println("Print the ECE Student Results");
		
	}

	@Override
	public void OfficeDetails() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[])
	{
		
	}
}
