package Streams_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test_One {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(40,30,20,10);
		
	   	//Stream<Integer> data=l.stream();
	   	
	   	//data.forEach(n->System.out.println(n));
		//data.forEach(n->System.out.println(n));
		
		//or
		
		//1.TO print values 
		
		//l.stream().forEach(n->System.out.println(n));
		
		
		
		//2.To sort the values
		
		//l.stream().sorted().forEach(n->System.out.println(n));
		
		
		//3.Map- to calculate
		//l.stream().map(e->e*2).forEach(n->System.out.println(n));
		
		
		//4.Filter
		
		//l.stream().filter(n->n%2==1).forEach(n->System.out.println(n));
		
		// 5.reduce
		
//		int num=l.stream().reduce(0,(e,n)->e+n);
//		System.out.println(num);
//		
		
		
		
		
		
		
	}

}
