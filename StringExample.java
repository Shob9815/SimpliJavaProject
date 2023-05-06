package com.javaprograms;

public class StringExample {
	
	public static void main(String args[])
	{
		
		String MyBatch = "My Batch Members are Brilliant"; //String should always be in double quote
		
		String Grade = "And Graded A";
		
		//charAt method is used to get the exact character from the index location
		System.out.println(MyBatch.charAt(5));
		
		//toUpperCase -- this will convert my string into upper case
		System.out.println(MyBatch.toUpperCase());
		
		//Lower case same as above
		System.out.println(MyBatch.toLowerCase());
		
		//We use contains method to check if a word is contained or present in a string, it will give result as either true or false, Boolean
		//contains is case sensitive
		
		System.out.println(MyBatch.contains("Members"));
		
		//concat - to join two strings
		
		String JoinedString = MyBatch.concat(Grade);
		
		System.out.println(JoinedString);
		
		//To get the length of the string, it will start from 0 and counts spaces as well
		
		System.out.println(MyBatch.length());
		
		//equalsIgnoreCase - to compare the two strings
		//if the names are the same, it will print the first statement
		
		String Student1 = "Shobhna";
	    String Student2 = "Bhawna";
	    
	    if(Student1.equalsIgnoreCase(Student2))
	    {
	    	System.out.println("Student Names Are Equal");
	    }
	    
	    else
	    {
	    	System.out.println("Student Names Are Not Equal");
	    }
	    
	    //to concantenate string and int, here we use syso with + to add up both
	    
	    String Student3 = "Maahi";
	    
	    int Marks = 100;
	    
	    System.out.println(Student3+Marks);
	
	}

}
