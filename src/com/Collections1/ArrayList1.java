package com.Collections1;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size :");
        int size = sc.nextInt();
        
        for(int i=0;i<size;i++)
        {
        	arr.add(sc.nextInt());
        }
        
        System.out.println(arr);
        
//	    for(int i : arr)
//	    {
//	    	System.out.print(i+" ");
//	    }
//        
		
		
//	    arr.add(10);//0---- arr[0]=10;
//	    arr.add(102);//1----arr[1]=102;
//	    arr.add(103);//2
//	    arr.add(104);//3
//	    arr.add(106);//4
//	    arr.add(107);//5
//	    
//	    arr1.add(10);
//	    arr1.add(20);
//	    arr1.add(30);
//	    arr1.add(40);
	    
//	    System.out.println(arr.size());
	   
	    
	   // System.out.println(arr.contains(100));
	    
//	    arr.remove(1);
//	    arr.remove(0);
	    
//	    System.out.println(arr);
//	    System.out.println(arr1);
	    
	    //arr.addAll(arr1);//arr1 elements added inside of arr elements
//	    arr1.addAll(arr);
//	    System.out.println(arr1);
	    
	    
//	    arr.clear();
//	    arr1.clear();
//	    System.out.println(arr);
//	    System.out.println(arr1);
	    
	    
	   
	    
	    
	    
	    
//	    for(int i=0;i<arr.size();i++)
//	    {
//	    	System.out.println(arr.get(i));//arr[i]
//	    }
	    
//	    
//	    for(int i : arr)
//	    {
//	    	System.out.println(i);
//	    }
	    
	    
		
	
		
		

	}

}
