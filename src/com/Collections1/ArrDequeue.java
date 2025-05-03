package com.Collections1;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrDequeue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> arr = new ArrayDeque<>();
		
		//To add
		arr.add(10);
		arr.add(20);
		arr.add(40);
		arr.add(100);
		arr.addFirst(50);
		arr.addLast(70);
		arr.offer(80);
		arr.offerFirst(500);
		arr.offerLast(300);
		
		
		//Verification
//		System.out.println(arr.contains(40));
		
		
		System.out.println(arr);
		
		//Delete
		//arr.poll();
//		arr.pollLast();
	//	arr.pollFirst();
		
	//-----------
		//arr.remove();
		//arr.removeFirst();
		//arr.removeLast();
		
	//	System.out.println(arr);
		
	
		
		//get
//		System.out.println(arr.peek());
//		System.out.println(arr.peekLast());
//		System.out.println(arr.peekFirst());
		
		
		
		//size
		
		//System.out.println(arr.size());
		
		
		
		//reverse the arrayDeque
		
		
		//System.out.println(arr.descendingIterator());
		
		//clear
		
//		arr.clear();
//		System.out.println(arr);
		
		
		//Traverse
		
//		for(int i=0;i<arr.size();i++)
//		    arr.iterator();
		
		
		
		
//		for(Integer i : arr)
//			System.out.print(i+" ");
		
		
		//Iterator
		
//	     Iterator<Integer> i =  arr.iterator();
//	     
//	     while(i.hasNext())//
//	     {
//	    	 System.out.print(i.next()+"  ");
//	     }
		
		
		
		//reverse
		
//		Iterator<Integer> i=arr.descendingIterator();
//		
//		while(i.hasNext())//
//	    {
//		   System.out.print(i.next()+"  ");
//		 }
//		
		
			
			
		
		
//		System.out.println(arr);
		

	}

}

//Add elements 
//-> add , addFirst , addLast || offer , offerFirst , offerLast
//Delete
//->poll , pollFirst , pollLast || remove , removeFirst , removeLast
//verification  
//->contains
//get
//->peek , peekFirst , peekLast
//clear
//->clear