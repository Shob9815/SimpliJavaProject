package com.javaprograms;

public class ArrayExample {
	
	public static void main(String args[])
	{
		//Normal variable example
		
		int a = 10;
		
		//Array Example, Syntax 1
		
		int array1[]; /// we need to give array name, it could be any name
		
		//new keyword is requred if we  want to give size
		
		array1 = new int[5];/// assign value
		
		//Syntax 2
		
		int array2[] = new int[5];
		
		//syntax 3
		
		int []array3; ///square brackets can be before or after
		
		//syntax 4
		
		//here there is no need of new keyword
		
		int array4[] = {10,20,30,40,50};
		
		System.out.println("The size of Array 4 is =" +array4.length); ///length is a default method which comes as part of array
		
		System.out.println("The First Element of Array 4 is =" +array4[0]);
		
		//the negative scenario
		//this will give error because the last element is 4 not 5
		//System.out.println("The last element of array 4 is =" +array4[5]);
		
		System.out.println("The size of the array 2 is =>" +array2.length);
		
		String TeamBigBang[] = {"Sheldon", "Leonardo", "Penny", "Amy"};
		
		System.out.println("The size of TeamBigBang array is" +TeamBigBang.length);
		
		System.out.println("Leonardo is in the location of" +TeamBigBang[1]);
		
		//To print complete big bang teams names:
		
		for(int i=0;i<TeamBigBang.length;i++) 
		{
			System.out.println(TeamBigBang[i]);
		}
		
	}

}
