package com.javaprograms;

//Polymorphism -- method overriding

class Vehicle_Suzuki
{
	public void run()
	{
		System.out.println("Parent uses Suzuki");
	}
}

class Vehicle_Nexa extends Vehicle_Suzuki
{
	public void run()//green icon can be seen wch tells u tht it is overriding.  This is how we override by putting the same method name from parent class
	{
		System.out.println("I am using Nexa");
		
	}
	
}

public class MethodOverridingExample {
	
	public static void main(String args[])
	{
		Vehicle_Nexa n1 = new Vehicle_Nexa();
		n1.run(); // it will run the nexa one coz we have given new implementation for run()

}
}