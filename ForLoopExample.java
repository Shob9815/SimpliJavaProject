package com.javaprograms;

public class ForLoopExample {
	
	public static void main(String args[])
	{
		//Normal For Loop
		//Conditions:  Start with the initial value, condition until it has to be iterated and give increment operator
		
		for(int i=1;i<=5;i++)
		{
			//System.out.println(i);
			//System.out.println("Shobhna");
			
			//whatever is inside for loop with run again and again until condition is reached
		}
		
		//System.out.println("Comes out of For Loop");
		
		//As it has come out of the loop, it will get printed only once
		
		//Nested For Loop
		
		for(int i=8;i<=10;i++)
		{
			for(int j=0;j<=5;j++)
			{
				System.out.println("Child Nested For Loop"+j);
				//first it will run the child, then parent, then child and so on until the condition is met
			}
			
			System.out.println("Parent For Loop"+i);
		}
		
		//Nested For Loop Pyramid Program
		
		for(int i=1;i<=5;i++)
		{
           for(int j=1;j<=i;j++)
           {
        	   System.out.print("@");
        	   
        	              }
           System.out.println();
           
      		}
		
		//Enhanced For Loop, we use colon : to traverse through this loop
		
		String TeamBigBang[] = {"Sheldon", "Leonardo", "Penny", "Amy"};
		
		for(String Characters:TeamBigBang) //string, variable name, operator and string name
		{
			System.out.println(Characters);
		}
		//so here we can just print without using any increments ie i++, thts y enhanced for loop
		
	}
	

}
