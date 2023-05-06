package com.javaprograms;

class AutomationBatch
{
	//we can create multiple classes like this
	
	//blue color means global variable
	
	//String is a class name used for characters
	
	String patient1 = "Adarsh";
	String patient2 = "Anitha";
	String patient3 = "Grace";
	
	int a = 30;
	
	public void Marks()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
	}
	}

public class VariablesExample {
	
	////global variable
	int a = 10;
	
	int globalvariable = 20;
	
	//method
	public void print()
	
	{
		////local variable
		int a = 20;
		
		System.out.println("***Print Method***");
		System.out.println("Print Method");
		
		System.out.println("Local Variable:" +a);
		
		System.out.println("Global Variable:" +globalvariable);
		 
}
	public void print1()
	
	{
		
		System.out.println("Print 2");
	}
	
	public static void main(String args[]) 
	//main method
	{
		
		/* this is for multiple line comments
		 * so this is how it works*/
		 
		int a = 10;
		
		//Syntax - ClassName object name = new ClassName(); 
		
		VariablesExample obj1 = new VariablesExample();
		
		//in order to call all the methods, we need to create an object in the main method
		

				System.out.println(obj1.a);
				
				System.out.println(obj1.globalvariable);
				
				obj1.print();
				
				obj1.print1();
				
				AutomationBatch obj2 = new AutomationBatch();
				obj2.Marks();
						
				System.out.println(obj2.patient2);
				
							
			//to call the method into the main method
				//object name.methodname();
	}
	
	
	
	
	
}
