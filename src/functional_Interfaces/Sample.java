package functional_Interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		
		List<Student> l = Arrays.asList(
				new Student(77,"Aakhib",97),
				new Student(76,"Sai",98),
				new Student(75,"Abdul",90),
				new Student(72,"Geta",89),
				new Student(71,"Likitha",77)
				);
		
		
		for(Student s : l)
			System.out.println(s);
		
		
		Collections.sort(l, new IdComparator());
		
		System.out.println("-------------------------");
		
		for(Student s : l)
			System.out.println(s);
		
		
        Collections.sort(l, new NameComparator());
		
		System.out.println("-------------------------");
		
		for(Student s : l)
			System.out.println(s);
		
		
         Collections.sort(l, new MarksComparator());
		
		System.out.println("-------------------------");
		
		for(Student s : l)
			System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
 			

	}

}
