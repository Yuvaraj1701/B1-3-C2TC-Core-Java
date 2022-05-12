package com.indiabic.Annotation;

class a{
	void display(){
	
		System.out.println("parent class");
	}
}
class b extends a{
	
	@Override
	void display(){
		
		System.out.println("Child class");
	}
	
}
public class Example1 {
	public static void main(String Args[]) {
		b obj=new b();
		obj.display();
		
		
	}

}
