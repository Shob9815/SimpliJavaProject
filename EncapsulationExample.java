package com.javaprograms;

public class EncapsulationExample {
	
	
	//public, private, protected and default
	
	public void PublicMethod()
	{
		System.out.println("This is a Public Method");
	}
	
	private void PrivateMethod()
	{
		System.out.println("This is Private Method");
	}
	
	protected void ProtectedMethod()
	{
		System.out.println("This is Protected Method");
	}
	
	void DefaultMethod() ///for this method there is no need for accecc specifier, eg public, private etc
	{
		System.out.println("This is Default Method");
	}
	
	public static void main(String args[])
	{
		
		EncapsulationExample e1 = new EncapsulationExample();
		e1.PublicMethod();
		e1.PrivateMethod(); ///private method can be called only in the same class, not outside any oder class
		e1.ProtectedMethod();
		e1.DefaultMethod();
		
		
	}
}
	
	class Example
	{
		public static void main(String args[])
		{
			EncapsulationExample p1 = new EncapsulationExample();
			p1.DefaultMethod();
			//private method will not be accessible here, it will throw an error
			p1.ProtectedMethod();
			p1.PublicMethod();
		}
	
}
