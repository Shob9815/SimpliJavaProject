package com.javaprograms;

public class SampleClass {
	
	public static void main(String args[])
	{
		
		MethodsExample obj1 = new MethodsExample();
		obj1.addtwoValues(100, 200);
		obj1.NormalMethod();
		
		StaticExample obj2 = new StaticExample();
		
		obj2.print();

		StaticExample.StaticPrint();
		//in order to call a static method in a different class we need to give class name and dot and select

}

}