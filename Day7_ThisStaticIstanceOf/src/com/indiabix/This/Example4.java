package com.indiabix.This;
//we can return the current instance of class by using this keyword.
public class Example4 
{
	int a;
	int b;
	Example4()
	{
		a=20;
		b=40;
	}
	Example4 accept()
	{
		return this;
	}
	void print()
	{
		System.out.println("Value of a is: "+a);
		System.out.println("Value of b is: "+b);
	}
	public static void main(String[] args) 
	{
		Example4 e=new Example4();
		e.print();
	
	}

}