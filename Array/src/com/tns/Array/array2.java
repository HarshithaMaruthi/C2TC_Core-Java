package com.tns.Array;


	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Scanner;
	 
	public class array2{
	 
	    public static void main(String[] args)
	    {
	 
	       
	        System.out.println("Enter 5 Elements");
	        Scanner sc=new Scanner(System.in);
	        Integer[] numbers =new Integer[5];
	 
	       
	 
	        for (int i=0;i<numbers.length;i++)
	        {
	            System.out.print(" ");
	            numbers[i]=sc.nextInt();
	        }
	 
	 
	        
	 
	        int min = (int) Collections.min(Arrays.asList(numbers));
	        
	 
	 
	        System.out.println("Min number: " + min);
	        
	    }
	}