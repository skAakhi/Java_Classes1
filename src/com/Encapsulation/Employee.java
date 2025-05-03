package com.Encapsulation;
//Encapsulation
public class Employee {
	
	private int id;
	private String name;
	private double sal;
	
		
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)//juli
	{
		this.name=name;
	}
	
	public void setSalary(double sal)
	{
		this.sal=sal;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public double getSal() 
	{
	return sal;	
	}
	

}
