package com.javaprograms;

public class AbstractDogClass extends AbstractAnimal {

	@Override
	public void Speak() {//it will automatically call off abstract method here not the normal method
		
		System.out.println("Dog Barks");
		
		//here it will ask to add unimplemented method, so we have to add it
		//by default Speak() will come from the previous class
		
	}
//now we are creating one more class for example
	//once we are extending this, we have to use all the abstract methods given in the parent class.  As of now we have given only one method
	
	public static void main(String args[])
	{
		AbstractDogClass d1 = new AbstractDogClass();
		
		d1.Speak();
		d1.Eat();
		
		System.out.println("This is Abstract Example");
	}
}

//likewise we can create the main method in cat class as well and the create an object to call the methods and then run