package com.inhertance;

public class Oppo implements Phone,TabPhone {

	@Override
	public void capture() {
		
		System.out.println("Oppo capture code");
		
	}

	@Override
	public void speed() {
		System.out.println("Oppo speed code");
		
	}

	@Override
	public void autoTalk() {
		System.out.println("Oppo autoTalk code");
		
	}

	@Override
	public void paste() {
		System.out.println("Oppo Paste code");
		
	}
	
	
	public void talk()
	{
		System.out.println("oppo talk code");
		
	}

	@Override
	public void Screen() {
		System.out.println("Oppo Screen code");		
	}
	
	

	
	

}
