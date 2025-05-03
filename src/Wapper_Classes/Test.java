package Wapper_Classes;

import java.util.ArrayList;
import java.util.List;

//Wrappper classes

public class Test {
	
	
	public static void main(String[] args) {
		
		int  i = 10;
		
		Integer i1 = Integer.valueOf(i);//Boxing         //new Integer(i);
		
		System.out.println(i1); //i1[10]---10
		
		
		int i2 = i1.intValue(); //Un-Boxing
		
		System.out.println(i2);
		
		
		//Auto-Boxing
		
		int j = 20 ;
		
		Integer j1 = j; // Auto-Boxing
		
		System.out.println(j1);//j1[20]
		
		
		int j2 = j1; // Auto-Un_Boxing
		
		System.out.println(j2);
		
		
		//-----------------------------------------------
		
		
		List<Integer> li = new ArrayList<>();        //crtl+shift+O
		
		li.add(10);//Auto-Boxing
		li.add(Integer.valueOf(20));//Boxing
		
		System.out.println(li);
		
		
		
		
		
		
	}

}
