package com.tns.Enum;

interface Pizza
{
	void display();
}
enum size implements Pizza
{
	Regular,Medium,Large,ExtraLarge;
		
	@Override
	public void display() {
		System.out.println("Size is: "+this);
	}
}
public class Example4 {

	public static void main(String[] args) {
		size.Regular.display();

	}

}