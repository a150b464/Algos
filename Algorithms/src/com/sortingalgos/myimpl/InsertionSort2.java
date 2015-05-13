package com.sortingalgos.myimpl;

import java.util.Random;

public class InsertionSort2 {

	static int[] array;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getArray();
		int j = 0;
		for (int i = 1; i < array.length; i++) {
			int element = array[i];
			j = i;
			while (j > 0 && array[j - 1] > array[j]) {
				array[j] = array[j - 1];
				array[j - 1] = element;
				j--;
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t" + array[i]);
		}
	}

	public static int[] getArray() {

		int size = new Random().nextInt(10) + 3;

		array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = new Random().nextInt(100);
		}

		return array;

	}
}
