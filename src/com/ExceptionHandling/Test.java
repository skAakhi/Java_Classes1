package com.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//throw and throws
public class Test {

	public static void main(String[] args)  {
		
		System.out.println("Program starts");
		int arr[]= {1,23,4,5,7,8,9};
	
		 
		
		   try {
			System.out.println(arr[7]);
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println(e.toString());
		   }
		   
		
		
		
		System.out.println("program ends");

	}
	
}
