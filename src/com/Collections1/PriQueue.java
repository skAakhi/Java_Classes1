package com.Collections1;

import java.util.PriorityQueue;
import java.util.Queue;
// Highest priority - lowest value(integer)  |  Lowest priority - Highest value
public class PriQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(10);
		q.add(20);
		q.offer(50);
		q.add(60);
		q.offer(70);
		
		// [ 10 , 20 , 30 , 10 , 10 ]
		
		
		
		System.out.println(q);
		
//		for(Integer i :q)
//			System.out.print(i+" ");
		
		
//		q.poll();//delete 
//		System.out.println(q);
//		q.poll();
//		System.out.println(q);
		
		
//		while(!q.isEmpty())
//		{
//			System.out.print(q.poll()+ " ");
//		}
		
		
		
		//System.out.println(q.size());
		
//		q.clear();
//		System.out.println(q);
		
		
//		q.remove(10);
//		System.out.println(q);
		
		
		//System.out.println(q.contains(500));
		
		//System.out.println(q.peek());
		
		
		

	}

}
