package com.Encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		//when we give direct access to object
		e1.setId(101);
		e1.setName("Juli");
		e1.setSalary(10082723);
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSal());
		
		
		e2.setId(102);
		e2.setName("jhon");
		e2.setSalary(1023);
		
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		System.out.println(e2.getSal());
		
		
		
		
		

	}

}
