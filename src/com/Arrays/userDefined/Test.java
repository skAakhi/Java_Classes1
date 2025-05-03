package com.Arrays.userDefined;

public class Test {
	
     
    
	public static void main(String[] args) {
		
	    
		Employee e1 = new Employee(101,"Aakhib",88888888);
		Employee e2 = new Employee(102,"Jhon",83761237);
		Employee e3 = new Employee(103,"jen",888382);
		Employee e4 = new Employee(104,"Amygo",8128726);
		Employee e5 = new Employee(105,"moni",8128726);
		
		Employee[] emp = new Employee[5];
		
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		
		for(Employee e :emp)
			System.out.println(e.id+"--->"+e.name+"---->"+e.sal);
		              
//		for(int i=0;i<emp.length;i++) {
//			System.out.println(emp[i].id+"---"+emp[i].name+"----"+emp[i].sal);
//			
//		}
//			
		
		
//		for(int i=0;i<size;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		
		
	
		

	}

}
