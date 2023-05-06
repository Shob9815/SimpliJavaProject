package com.javaprograms;

public class MethodOverloadingExample {
	
	//Polymorphism--- Method overloading is same method with different data types of arguments
	
	public int add(int a, int b) 
	{
		int c = a+b;
		return c; //in such methods we need to return the value
	}
	
	public double add(double a, double b)//double is for decimal value
	{
		double c = a+b;
		return c; //in such methods we need to return the value
	}
	
	public static void main(String args[])
	{
		MethodOverloadingExample e1 = new MethodOverloadingExample();
		
		System.out.println(e1.add(5, 4));
		System.out.println(e1.add(1.5, 2.5));
		
		
	}
	
	
	
}
