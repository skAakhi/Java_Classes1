package compa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		
		List<Student> l = Arrays.asList(
				new Student(104,"Aakhib"),
				new Student(102,"Parveen"),
				new Student(103,"Afzal"),
				new Student(107,"Karimulla")
				);
		
		
		for(Student s : l)
			System.out.println(s);
		
		Collections.sort(l);
		
		System.out.println("---------------------");
		
		for(Student s : l)
			System.out.println(s);
		
		
				

	}

}
