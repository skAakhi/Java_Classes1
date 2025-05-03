package functional_Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> l = Arrays.asList(
				new Employee(104,"Aakhib",200),
				new Employee(103,"Abdul",100),
				new Employee(102,"Sai",400),
				new Employee(101,"Likitha",50),
				new Employee(109,"Geta",150)
				);
		
		
		
		for(Employee emp : l)
			System.out.println(emp);
		
		System.out.println("-------------------");
		
		Collections.sort(l);
		
		for(Employee emp : l)
			System.out.println(emp);
		

	}

}







//Task sort the id values of Employees in descending order [id , name , sal]
