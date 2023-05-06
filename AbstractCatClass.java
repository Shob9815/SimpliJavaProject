package com.javaprograms;

public class AbstractCatClass extends AbstractAnimal {

	@Override
	public void Speak() {
		
		System.out.println("All Cats Meow");
		
	}

	public static void main(String args[])
	{
		AbstractCatClass c1 = new AbstractCatClass();
		c1.Speak();
	}
	
}
