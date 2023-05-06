package com.javaprograms;

public class ConstructorExample {
	//normal method just for our understanding to differentiate from constructor
	public void print()
	{
		System.out.println("Normal Method");
	}
	
	//Constructor - default method for the class
	
	ConstructorExample() //for this type we can only give class name or it has to be our class name otherwise it will throw error  
	{
		System.out.println("This is a Constructor");
	}
	//constructor with parameters
	ConstructorExample(int a, int b)
	{
		int c = a+b;
		
		System.out.println(c);
		System.out.println("This is a parameterised constructor");
	}
	
	//Constructor overloading using the same constructor name
	//same constructor with different argument type is called constructor overloading ie, overloading with different set of parameters
	
	ConstructorExample(int a, String b)
	{
		System.out.println("Constructor Overloading");
		System.out.println("The roll number" +a);
		System.out.println("The name of the student" +b);
	}
	
	public static void main(String args[])
	{
		ConstructorExample c1 = new ConstructorExample();
		
		ConstructorExample c2 = new ConstructorExample(5,5); //here we have created an object for parameterized constructor and gven value, now we can run the program
		
		ConstructorExample c3 = new ConstructorExample (5, "Shobhna");//same object creation but with string argument
		
	//To call a constructor, we only need to create an object and we can directly call
		//if we add c1.print();, we can call print method then
	}

}
