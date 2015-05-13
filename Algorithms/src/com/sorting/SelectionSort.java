package com.sorting;

import java.util.Random;

public class SelectionSort {
	// static int[] myarray = { 5, 14, 25, 46, 77, 88, 99, 111, 123, 134 };
	static int[] myArray;
	static {
		System.out.println("In static block");
		// System.out.println(myArray.length);
	}

	static int[] Sort(int[] myarray) {
		//Takes an element
		//keeps on iterating the rest of the array until it finds an element lesser than it
		//Keeps on exchanging until end of array.
		//O(n^2)
		for (int i = 0; i < myarray.length; i++) {
			int minimum = i;
			for (int j = i + 1; j < myarray.length; j++) {
				if (myarray[minimum] > myarray[j]) {
					minimum = j;
				}
			}
			if (minimum != i) {
				swapValues(i, minimum);

			}
		}
		return myarray;
	}

	static void swapValues(int x, int y) {
		int temp = myArray[x];
		myArray[x] = myArray[y];
		myArray[y] = temp;

	}

	public static void main(String[] args) {
		Random random = new Random();
		int N = random.nextInt(10) + 4;
		myArray = new int[N];
		for (int i = 0; i < N; i++) {
			myArray[i] = random.nextInt(100);
			System.out.print("\t" + myArray[i]);
		}
		int[] sorted_myArray = SelectionSort.Sort(myArray);
		System.out.println();
		for (int i = 0; i < sorted_myArray.length; i++) {
			System.out.print("\t" + sorted_myArray[i]);
		}
	}

}
