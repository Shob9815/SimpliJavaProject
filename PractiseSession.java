package com.javaprograms;

import java.nio.file.spi.FileSystemProvider;

public class PractiseSession {
	
	public void NormalMethod()
	{
		
		System.out.println("This is a normal method");
	}
	
	public int AddtwoNumbers()
	{
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
		
		return 9;
	}
	
	public int AddtwoValues (int a, int b)
	{
		int c = a+b;
		
		System.out.println(c);
		
		return 9;
	}
	
	public static void main(String args[])
	{
		
		PractiseSession obj1 = new PractiseSession();
		
		obj1.NormalMethod();
		obj1.AddtwoNumbers();
		obj1.AddtwoValues(100, 300);
	}
	
			

}
