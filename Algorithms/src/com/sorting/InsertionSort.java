package com.sorting;

import java.util.Random;
//List is divided into sorted and unsorted portions
//take left most element and compare it with next element
//if its already sorted move the index for sorted portion by 1 else swap the two values
public class InsertionSort {
	static int[] myArray;
	static int element;

	public static void main(String[] args) {
		Random random = new Random();
		int N = random.nextInt(10) + 4;
		myArray = new int[N];
		for (int i = 0; i < N; i++) {
			myArray[i] = random.nextInt(100);
			System.out.print("\t" + myArray[i]);
		}
		int[] sorted_myArray = InsertionSort.Sort(myArray);
		System.out.println();
		for (int i = 0; i < sorted_myArray.length; i++) {
			System.out.print("\t" + sorted_myArray[i]);
		}
	}

	public static int[] Sort(int[] array) {
		int j;
		// Takes one element in for loop
		for (int i = 1; i < array.length; i++) {
			//number we are moving to sorted portion
			element = array[i];
			//J represents index  into first element of unsorted portion
			j = i;
			// Keeps on comparing it to the element to the left of it
			// until it finds an element that is greater than that element
			//Worst case -O(n^2) , best case O(n)
			while (j > 0 && element < array[j - 1]) {
				array[j] = array[j - 1];
				j--;
				array[j] = element;
			}

		}

		return array;
	}

	/*static void swapValues(int x, int y) {
		int temp = myArray[x];
		myArray[x] = myArray[y];
		myArray[y] = temp;

	}*/
}
