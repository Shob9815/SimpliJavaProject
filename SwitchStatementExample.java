package com.javaprograms;

public class SwitchStatementExample {

	
	public static void main(String args[])
	{
		
		//switch condition example
		
		int day = 1;  //here we need to change the value to either 1, 2 or 3, it will run; if any other value given, it will run as "Not Defined"
		
		String weekday = "Not Defined";
		
		switch(day)
		{
		case 1: weekday = "Monday";
		        break; /// break-- it will come out of switch block and will not go to other cases (to save time) and go to syso directly
		case 2: weekday = "Tuesday";
		        break; 
		case 3: weekday = "Wednesday";
		        break;
		
		}    
		
		System.out.println(weekday);
		
	}
}
