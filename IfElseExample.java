package com.javaprograms;

public class IfElseExample {
	
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		int c = 30;
		
		
	if(a>b)
	{
		System.out.println("A is greater than B");
	}
	
	if(a>c)
	{
		System.out.println("A if greater than C");
	}
	
	else if(a<b)
	{
		System.out.println("A is less than B");
	}
	
	else if(a<c)
	{
		System.out.println("A is less than C"); //if any one condition is satisfied, it will not execute the rest of the program, so the above condition is satisfied
	}
	
	else
	{
		System.out.println("All the Conditions are Satisfied");
	}
	
	//Nested if statement
	
	//we can write another if statement under if statement
	
	if(a<b)
	{
		System.out.println("Inside Nested If");
		
		if(a<c)
		{
			System.out.println("A is lesser than C in nested if");
		}
	}
	}

}
