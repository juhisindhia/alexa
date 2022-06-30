package com.arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.print("Befor swapping...  ");
		for (int i : arr) {
			System.out.print(" " + i);
		}
		System.out.println();

		int temp = 100;
		temp = arr[4];
		arr[4] = arr[0];
		arr[0] = temp;

		temp = arr[1];
		arr[1] = arr[3];
		arr[3] = temp;

		System.out.print("After swapping...  ");
		for (int i : arr) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.print("arr   " + arr.length);


	}

}
