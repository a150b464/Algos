package com.sortingalgos.myimpl;

import java.util.Random;

public class QuickSortImpl {

	static int[] array;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getArray();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + array[i]);
		}

		long start = System.nanoTime();
		quickSort(array, 0, array.length - 1);
		long end = System.nanoTime();
		// System.out.println("Time taken: " + (end - start));
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + array[i]);
		}

	}

	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int partition = partition(array, start, end);
			quickSort(array, start, partition - 1);
			quickSort(array, partition + 1, end);

		}
	}

	static int partition(int[] array, int start, int end) {

		int pivot = array[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (pivot > array[i]) {
				if (i != pIndex) {
					swap(i, pIndex);
				}
				pIndex++;
			}
		}
		swap(pIndex, end);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + array[i]);
		}
		return pIndex;
	}

	private static void swap(int pIndex, int end) {
		// TODO Auto-generated method stub
		int temp = array[end];
		array[end] = array[pIndex];
		array[pIndex] = temp;

	}

	static void getArray() {

		int size = new Random().nextInt(7) + 3;

		array = new int[size];
		for (int i = 0; i < size; i++) {
		//	array[i] = new Random().nextInt(100);
			array[i] = i;
		}
	}

}
