package com.indiabix.Wrapper;
//Autoboxing
public class Example1 {

	public static void main(String[] args) {
		float x=20.5f;
		Float y=x;
		@SuppressWarnings("deprecation")
		Float obj=new Float(15.0f);
		System.out.println(x+" "+y+" "+obj);
	}

}