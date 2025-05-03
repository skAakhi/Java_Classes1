package functional_Interfaces;

// Interfaces

//1.Comparable interface
//2.Comparator interface
public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private int sal;
	
	
	
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}



//	@Override
//	public int compareTo(Employee emp) {
//	
//		return Integer.compare(this.id,emp.id );
	//}
	
	
//	@Override
//	public int compareTo(Employee emp) {
//	
//		return this.name.compareTo(emp.name);
//	}
//	
	
	@Override
	public int compareTo(Employee emp) {
	
		return Integer.compare(this.sal, emp.sal);
	}
	
	



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	
	

}
