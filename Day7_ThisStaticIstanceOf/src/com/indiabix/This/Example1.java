package com.indiabix.This;

//this keyword
class Parent
{
	int a;
	void print(int a) {
		this.a=a; //we have to use "this" keyword
	}
	void display()
	{
		System.out.println("The value of a is: "+a);
	}
}

public class Example1 {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.print(10);
		p.display();
	}

}