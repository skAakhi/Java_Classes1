package com.Collections1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//Map----->Key-value
//Example:
//id:Details
//Phone:Details
//Acc_no:Deatails


//HashMap----------> Wont follow the insertion
//LinkedHashMap---->Following insertion order
//
//Tree---->Sorted order

public class Map1 {
	//Not following insertion order
	public static void main(String[] args) {
		
		Map<Integer , String> h1 = new TreeMap<>();//leagacy class 
		
		h1.put(20, "sakhib");
		h1.put(30, "Aai");
		h1.put(10, "Zbdul");

		//20=sakhib(2) , 30=Aai(3) , 10=Zbdul(1)
		
		
		
		
		
		
		
		System.out.println(h1);
		
//		Set<Integer> keys=h1.keySet();
//		
//		for(Integer i : keys)
//			System.out.println(i);
		
		
//		Collection<String> values = h1.values();	
//		
//		for(String i :values)
//			System.out.println(i);
		
		
//		h1.put(10, "Rehaman");
//		
//		System.out.println(h1);
//		
//		
//		h1.replace(20, "sai vamsi");
//		
//		System.out.println(h1);
//		
//		
//		h1.remove(20,"sai vamsi");
//		
//		System.out.println(h1);
//		
		
		Set<Entry<Integer, String>> i =h1.entrySet();
		
		for(Entry<Integer, String> v : i )
			System.out.println(v.getValue()+"--------"+v.getKey());
		
//		h1.clear();
		
//		System.out.println(h1);
		
		
		System.out.println(h1.size());
		
		
		
		
	}

}
