package com.javaprograms;

public class TypeCastingExample {

	public static void main(String args[])
	{
		
	//how to covert one data type to other
		
		int a = 10;
		
		long b = a;
		
		System.out.println(b);
		
		float c = b;
		
		System.out.println(c);
		
		//these were lower to upper examples ie widening type casting
		
		//now examples of narrowing type casting, ie up casting
		
		double d = 100.2;
		
		int e = (int)d; ///syntax to convert from double to int, we can directly convert double to integer, it doesnt have to go with the flow
		
		System.out.println(e);
	}
	
}
