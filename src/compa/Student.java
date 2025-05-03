package compa;

public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


//	@Override
//	public int compareTo(Student o) {
//		
//		return this.name.compareTo(o.name);
//	}


	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(this.id, o.id);
	}
	
	

}
