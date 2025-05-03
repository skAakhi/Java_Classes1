package com.inhertance;

// Interface we cannot have blocks
//cannot create object(instantiate) interfaces
//after java 8--->default , static blocks

public interface Phone {
	
	public void capture(); // abstract methods
	
	public void speed();
	
	public void autoTalk();
	
	public void paste();
	
	
	default void play()
	{
		System.out.println("Phone play code");
	}
	
	static void run()
	{
		System.out.println("Phone run code");
	}
	
	

}
