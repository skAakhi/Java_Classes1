package com.Abstraction1;

public class HDFC implements Bank {

	@Override
	public void deposit() {
		
		System.out.println("HDFC deposit logic");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC withdraw logic");
		
	}

	@Override
	public void currentBal() {
		
		System.out.println("HDFC currentBal logic");
		
	}
	

}
