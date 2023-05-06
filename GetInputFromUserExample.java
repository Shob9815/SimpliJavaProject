package com.javaprograms;

//just an example coz someone asked  about this, we are not gng to use Scanner class 
import java.util.Scanner;
public class GetInputFromUserExample {

	
	public static void main(String args[])
	{
		
		int a, b;
		
		int sum;
		
		//Scanner class is used to get the input from users; System.in is to get the input value
		Scanner inputFromUser = new Scanner (System.in);
		
		System.out.println("Enter the First Number:");
		
		//Getting the integer value from the user and saving it to "a" variable
	    a = inputFromUser.nextInt();
	    
	    System.out.println("Enter the Second Number:");
	    b = inputFromUser.nextInt();
	    
	    inputFromUser.close();
	    
	    sum = a+b;
	    
	    System.out.println("The Sum of Two Numbers Given From the User is -" +sum);
		    
		    
		
	}
}
