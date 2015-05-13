package com.sortingalgos.myimpl;

public class QuickSort {

	static int[] array;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array = InsertionSort2.getArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + array[i]);
		}
		System.out.println();
		System.out.println(array.length);

		try {
			quickSort(array, 0, array.length - 1);

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array out of bound");
			ex.printStackTrace();
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + array[i]);
		}

	}

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pIndex = partition(array, start, end);
			quickSort(array, start, pIndex - 1);
			quickSort(array, pIndex + 1, end);
		}

	}

	private static int partition(int[] array, int start, int end) {
		// TODO Auto-generated method stub

		int pivot = array[end];
		int pIndex = start;

		for (int i = start; i < end; i++) {
			if (array[i] < pivot) {

				if (i != pIndex) {
					swap(i, pIndex);
				}
				pIndex++;
			}
		}
		swap(pIndex, end);
		// System.out.println(pIndex);
		return pIndex;

	}

	private static void swap(int pIndex, int end) {
		// TODO Auto-generated method stub
		int temp = array[end];
		array[end] = array[pIndex];
		array[pIndex] = temp;
	}

}
