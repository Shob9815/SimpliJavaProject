package com.javaprograms;

public class StaticExample {
	
	public static int a = 10;
	
	//here as well we are using static keyword and we do not need to call it using an obj1 name
	//so, same for variable types also
	
//normal method
public void print()
{
	System.out.println("Normal Method");
}
     //method with return type
     public boolean Results()

{
 	 return true;
 	 
}
     //new method using static keyword
     public static void StaticPrint()
     {
    	 
    	 System.out.println("Print Static Method");
    	 
     }
     
     public static void main(String args[])
     {
    	 
    	 StaticExample obj1 = new StaticExample();
    	 
    	 obj1.print();
    	 
    	 System.out.println(obj1.Results());
    	 
    	 StaticPrint();
    	 
    	 System.out.println(a);
    	 
    	 //above note that we didnt use obj1.StaticPrint();, rather we used just StaticPrint();
    	 //If the method (static) is in the same class, we do not need to create an object
    	 
     }
     
     
     
}
