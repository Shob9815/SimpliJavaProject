package com.javaprograms;

public class EncapsulationClassWithinSamePackage {
	
	public static void main(String args[])
	{
		EncapsulationExample c1 = new EncapsulationExample(); //to call the EncapsulationExample method here, we need to create an object with dufferent variable name as opposed to the original one
		c1.PublicMethod();//this is to call the public method under EncapsulationExample class, can be called anywhere
		
		//we cannot call the private method in a different class under the same package
		c1.DefaultMethod();///can be called here but nowehere else eg, not in other package
		c1.ProtectedMethod();// can be called here and outside the package (subclass) if there is a parent class or else not.
		
	}

}
