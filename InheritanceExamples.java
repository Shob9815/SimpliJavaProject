package com.javaprograms;

class Animal
{
	int numberofLegs = 4;
	
	public void Eat()
	{
		System.out.println("Animals Eat");
	}
	
}
// a new child class where the parent is Animal, so to create it we have to use keyword extends
//Example of single inheritance
class Dog extends Animal  
{
	public void DogMethod()
	{
		System.out.println("I am a dog and I like treats");
	}
}
//example of multi-level inheritance
class Puppy extends Dog
{
	public void PuppyMethod()
	{
		System.out.println("I am puppy and I drink milk");
	}
}
//Hierarchy inheritance, here Cat Class extends from Parent Animal Class
class Cat extends Animal
{
public void CatMethod()
{
	System.out.println("I am a cat from animal kingdom");
}
}


public class InheritanceExamples 

{
    public static void main(String args[])
    {
    	Animal a1 = new Animal();
    	
    	a1.Eat();
    	
    	Dog d1 = new Dog();
    	d1.DogMethod();
    	d1.Eat(); ///here as we have given extends keyword, thts y we are able to call this parent class method here
    	
    	System.out.println(d1.numberofLegs); // here we dun need to call the method, just use syso
    	
    	Puppy p1 = new Puppy();
    	
    	p1.PuppyMethod();
    	p1.Eat();
    	p1.DogMethod();
    	
    	Cat c1 = new Cat();
    	c1.CatMethod();
    	c1.Eat();
    	
    	System.out.println(c1.numberofLegs);
    }
	
	
	
}
