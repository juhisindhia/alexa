package com.arrays;

public class Intro {
	
	public static void main(String[] args) {
		
		
		int[] arr = new int[2];
		
		arr[0] = 10;
		arr[1] = 20;
		System.out.print("before swapping...  ");
		//for(int i= 0 ; i < arr.length ; i++)
		for(int i : arr){
			System.out.print(" "+i);
		}
		System.out.println();
		int temp =-1;
		
		/*
		 *  temp = arr[0];
		 * 
		 * System.out.println("At 0th index : "+ arr[0]);
		 * System.out.println("In temp : "+ temp);
		 */
		
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
		System.out.print("after swapping...  ");
		for(int i : arr){
			System.out.print(" "+i);
		}
		
		
		
				
	}

}
