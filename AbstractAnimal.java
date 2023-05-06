package com.javaprograms;

public abstract class AbstractAnimal //here we have added abstract keyword after the creation of class, tht is how we do it
{
	
	//Normal Method
	
	public void Eat()
	{
		System.out.println("Animals Eat");
	}
	
	//Abstract method will not have method body
	
	public abstract void Speak(); //for this we dun need open and close curly brackets, but close it with semicolon
	
		
	public static void main(String args[])
	{
		
	}

}

/// we have created a new class AbstractDogClass to understand this better
