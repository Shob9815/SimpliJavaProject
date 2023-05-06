package com.javaprograms;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingExample {
	
     //Compilation error we can detect during writing the program and fix it
	//Checked exception happens during compilation time, in this scenario file IO is the exception thrown 
	public void OpenFile() throws FileNotFoundException, InterruptedException
	
	{
		//File is a class
		File file = new File("D://NewFile.txt");
		// method to open a file from a location, this file is a part of Java IO class so we have to import it
		
		//To read this file, we have to do this, ft is an object name, and we also have to import this file as well
		//import option not getting, manually doing it
		FileInputStream ft = new FileInputStream(file); //here it will ask for handling, so we will choose throws (it is used to throw one exception at one time)
		
		Thread.sleep(5000); // to hold the execution time for some time
		
		//it will again ask to handle it, so chose throws option
		
		//when we run this file, nothing will display not even any errors, this means it has been handled successfully
	}
	
	public static void main(String args[])
	{
		//in this scenario, we can check for errors after running the program
		//Runtime exception where the program stops abruptly without running the next set of codes (unchecked exception)
		//// to fix this error we will use try and catch block
		
		try {
	
			//In try block we give the code which we feel might throw an error during runtime
		
		int a = 10;
		int b = 0;
		
		int c = a/b; //it will throw error as we cannot divide any number from zero, execution will stop here and wont proceed further
		
		}
		
		catch(Exception anyname) //with catch -- we will catch the program and execute the program further
		{
			System.out.println(anyname);
		}
		
		//Finally block gets executed even if the error occurs or not 
		finally
		{
			System.out.println("Finally Code - Executing Code Even After Exception");
			
			System.out.println("The line of code after error");
			
			int d = 10+10;
			System.out.println(d);
		}
		
		//how to use throw 
		
		int e = 5; //now if we change this to 20, it will throw an exception
		int f = 10;
		
		if(e>f)
		{
			throw new ArithmeticException("E is greater than F");
		}
		
		else
		{
			System.out.println("E is lesser than F");
		}
		
		
	}
}
