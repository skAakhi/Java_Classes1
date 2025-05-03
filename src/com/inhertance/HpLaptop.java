package com.inhertance;
//methods,instance(variables),constructors
public class HpLaptop extends Laptop { // child class

	
	  public void write() 
	  { 
		  System.out.println("Hp write code"); 
	  }
	  
	  public void copy()
	  {
		  super.copy();
	      System.out.println("Hp copy code");
	   }

	  
	  public void auto() 
	  { 
		  
	  System.out.println("Hp auto code"); 
		  
	  }
	 


}
