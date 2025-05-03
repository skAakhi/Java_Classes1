package Streams_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestTwo {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,1,2,2,3,4,53,2,3,53);
	
		//Getting inside of streams and printing 
		//1. Foreach method
		
//		l.stream()
//		.forEach(n->System.out.println(n));
//		
		
		// 2. Sorted()
//		l.stream()
//		.sorted()
//		.forEach(n->System.out.println(n));
		
		
		// 3 . Map
		
//		l.stream()
//		.sorted()
//		.map(i->i*2)
//		.forEach(n->System.out.println(n));
		
		
		// 4. reduce(val1 , val2) 
		
	          // [2,7,4,1]-> [4,14,8,2]->       8,2->10                  4,14->18-->[18,10]=28
//		int num=l.stream().map(i->i*2).reduce(0,(a,b)->a+b);
//		System.out.println(num);
		
		
		//5 . reduce
		
//		int num=l.stream()
//				.reduce(0,(a,b)->a+b);
//		System.out.println(num);
		
		
		//6 . Filter
		
//		
//		Predicate pre = (Object n)->{
//				int i = (int) n;
//				if(i%2==1)
//				return true;
//				else
//				return false;
//		};

		
//		l.stream()
//		.filter(n->n%2==0)//2
//		.forEach(n->System.out.println(n));
		
		
		
		// 7.distinct
		
//		 l.stream()
//		 .distinct()
//		 .forEach(n->System.out.println(n));
		 
		 
		 //8.Limit  
		
		//1,1,2,2,3,4,53,2,3,53
		 
//		 l.stream()
//		 .limit(1)
//		 .forEach(n->System.out.println(n));
			
		
		//9.
		List<Integer> list1 = Arrays.asList(1,2,3,4);// [1,2,3,4]
		List<Integer> list2 = Arrays.asList(5,6,7,8);// [5,6,7,8]
		
		//[[1,2,3,4],[5,6,7,8]]
		List<List<Integer>> mainList = Arrays.asList(list1,list2);//[[1,2,3,4],[5,6,7,8]]
		
       // 9 . FlatMap
		
// [1,2,3,4],[5,6,7,8]->[5,6,7,8](i)->5,6,7,8
//		mainList.
//		stream().
//		flatMap(i->i.stream()).
//		forEach(n->System.out.print(n+" "));
			
			

			
			 
		 };
		
		
		
		
		
		
		
		
		
//		for(Integer i : l)
//		{
//			if(i%2==0) {
//			System.out.print(i+" ");
//			}
//		}
		
		
		
       
	                                  

}
