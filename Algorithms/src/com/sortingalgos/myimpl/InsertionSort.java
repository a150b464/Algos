package com.sortingalgos.myimpl;

import java.util.Random;

public class InsertionSort {

	static int size = new Random().nextInt(10) + 4;
	static int[] array = new int[size];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getArray();
		long start = System.nanoTime();

		InsertionSort(array);
		long end = System.nanoTime();
		System.out.println();
		System.out.println("Time taken: " + (end - start));

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + array[i]);
		}
	}

	private static void InsertionSort(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 1; i < array.length; i++) {
			int element = array[i];
			int j = i;
			while (j > 0 && (array[j] < array[j - 1])) {
				array[j] = array[j - 1];
				array[j - 1] = element;
				j--;
				// array[j] = element;

			}
		}

	}

	private static void swap(int i, int min) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i] = array[min];
		array[min] = temp;

	}

	private static int[] getArray() {
		// TODO Auto-generated method stub

		System.out.println("Array size is " + array.length);
		for (int i = 0; i < size; i++) {

			array[i] = new Random().nextInt(100);
		}
		System.out.println("Original Array");

		for (int i = 0; i < size; i++) {

			System.out.print("\t" + array[i]);
		}
		return array;
	}

}
