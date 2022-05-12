package com.indiabic.Annotation;

class animal{
	@Deprecated
	void sound() {
		System.out.println("roar");
	}
	void print() {
		System.out.println("Aimal sound");
	}
}

public class Example3 {
	public static void main(String Args[]) {
		animal a=new animal();
		a.sound();
		a.print();
	}
}
