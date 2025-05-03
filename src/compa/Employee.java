package compa;

import java.util.Comparator;

public class Employee {

	 int id;
	 String name;
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	
}



class NameComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
	
}


class AgeComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return Integer.compare(o1.id,o2.id);
	}
	
	
}
