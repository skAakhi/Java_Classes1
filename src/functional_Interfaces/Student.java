package functional_Interfaces;

import java.util.Comparator;

//comparator
public class Student {
	
	int id;
	String name;
	int marks;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}


	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
}

class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return Integer.compare(o1.id, o2.id);
		
	}
	
}


class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
		
	}
	
}


class MarksComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return Integer.compare(o1.marks, o2.marks);
		
	}
	
}





