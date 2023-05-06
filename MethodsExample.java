package com.javaprograms;

public class MethodsExample {
	
	int a =10;
	
	//normal method
	
	/*1) access specifier
	2) Return type
	3) Name for the method, it could be any name eg, print, NormalMethod, etc*/
	
	public void NormalMethod()
	
	//this method does not return anything, we can use datatypes as well here
	{
		System.out.println("Void Method is printed");
		
	}
	
	
	//Second method - Method with datatype and return
	
	/*1) access specifier
	2) Return type (Data type - eg, int, float, etc)
	3) Name for the method*/
	
	public int addtwoNumbers()
	{
		int a = 10;
		int b = 20;
		
		int c = a+b;
		
		System.out.println(c);
		return 114;
  // in this case we need to use return type, otherwise error will come, so it could be any integer 9 or 8 or anything
	}
	
	public int MaximumMarks()
	{
		return 100;
		
		//here we can just give return type and give syso in the main method using obj1
		
	}
	//Method with parameters
	
	public int addtwoValues(int a, int b)
	{
		int c = a+b;
		//c could be anything, any name, eg, int result = a+b;
		
		System.out.println(c);
		
		return c;
		// here return could be any integer as well
	}
	
	
	public static void main(String args[])
	{
		MethodsExample obj1 = new MethodsExample();
		
		obj1.NormalMethod();
		obj1.addtwoNumbers();
		
		obj1.addtwoValues(100, 200);
		
		System.out.println(obj1.a);
		System.out.println(obj1.MaximumMarks());
		
		//we can call the method in a new class by just giving the object name
	}
	

}
