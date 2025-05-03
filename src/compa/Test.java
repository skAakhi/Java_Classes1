package compa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> l = Arrays.asList(
				new Employee(104,"Toshith"),
				new Employee(102,"Kiran"),
				new Employee(103,"Pandu"),
				new Employee(107,"Jhon")
				);
		
		
		for(Employee e: l)
			System.out.println(e);
		
		
		System.out.println("----------------");
		
		Collections.sort(l,new NameComparator());
		
		
		for(Employee e: l)
			System.out.println(e);
		
		
         System.out.println("----------------");
		
		Collections.sort(l,new AgeComparator());
		
		
		for(Employee e: l)
			System.out.println(e);
		
		
		

	}

}
