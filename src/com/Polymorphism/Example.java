package com.Polymorphism;
//MethodOverloading-----
//-->Having same method name but different signatures  
//
public class Example {
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}        //        10      "40"
	public void add(int a,String b)
	{ //    40                "40"               
		int i=Integer.valueOf(b);//Converting String integer value to int integer value
		System.out.println(a+b);
	}
	
	
	
	public static void main(String[] args) {
		
		Example e1 = new Example(); 
		e1.add(10, 20);
		e1.add(100, 200,300);
		e1.add(10, "40");
		
	}

}
