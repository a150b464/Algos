package com.sortingalgos.myimpl;

import java.util.Random;

public class SelectionSort {

	static int size = new Random().nextInt(10) + 4;
	static int[] array = new int[size];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getArray();

		SelectionSort(array);

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + array[i]);
		}
	}

	private static void SelectionSort(int[] array) {
		// TODO Auto-generated method stub

		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			if (min != i) {
				swap(i, min);
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

			System.out.print("\t"+array[i]);
		}
		return array;
	}

}
