package com.Collections1;


import java.util.*;

//set to store unique values
//unique , not follwing insertion order
public class SetDemo2 {

	//HashSet----->It is not following any insertion , not following any sorted order 
	//LinkedHashSet--->It is following insertion order 
	//TreeSet----->It is not any following  insertion order , Sorted order
	public static void main(String[] args) {
    
		
		Set<Integer> hs = new TreeSet<>();
		//[10 , 20 , 70 , 60 , 50 ]
		
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(70);
		hs.add(60);
		hs.add(50);
		
		System.out.println(hs);
		
	
		
		
		
		
		

	}

}

