package com.javaprograms;

public class OperatorsExample {
	
	public int addTwoNumbers (int a, int b)
	{
		int c = a+b;
		
		return c;
		
	}

	public static void main(String args[])
	{
		
		//Arithmetic operators
		int a = 10;
		int b = 20;
		
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		OperatorsExample a1 = new OperatorsExample();
		
		System.out.println(a1.addTwoNumbers(a, b));
		
		//Relational Operators >, <, <=, >=, = =, !=.  We use if keyword here.
		
		int x = 10;
		int y = 20;
		int z = 30;
		int w = 10;
		
		if(x>y)
		{
			System.out.println("X is greater than y");
		}
		
		else
		{
			System.out.println("X is Lesser than Y");
		}
		
		if(x<y)
		{
			System.out.println("X is lesser than y");
		}
		
		if(x==w)
		{
			System.out.println("X and J are Equal");
		}
		
		if(x!=z)
		{
			System.out.println("X is not Equal to Z");
		}
		
		//Logical operators && and ||
		
		System.out.println("***Logical Conditions***");
		
		if(x<y && x<z)
		{
			
			System.out.println("X is Lesser than Y and Z");
		}
		
		if(x<y && x>z)
		{
			
			System.out.println("X is Lesser Than Y and Greater Than Z");
		}
		
		if(x<y || x>z)
		{
			System.out.println("X is Lesser Than Y and Greater Than Z using or Operator");
		}
		
		//Unary Operators ++ and --
		
		System.out.println("***Unary Operators***");
		
		int UnaryExample = 10;
		
		System.out.println(UnaryExample++);//output will be 10, but in the memory it will be incremented to 11
		System.out.println(UnaryExample);// now the value will be 11
	
		System.out.println(UnaryExample--); // now it will 11 again coz in memory it will be 10
		System.out.println(UnaryExample);//now it will be 10
	
	}
	
	
	
}
