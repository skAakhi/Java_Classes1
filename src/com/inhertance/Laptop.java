package com.inhertance;
//Inheritance---->accessing properties of super class(parent class) by child class
public class Laptop { // Parent class
	
	String name="Laptop";
	double price=888.997;
	
	//Concrete method
	public void copy()
	{
		System.out.println("copy code");
	}
	
	public void auto()
	{
		System.out.println("auto code");
	}
	
	public void capture()
	{
		System.out.println("Capture code");
	}

}
