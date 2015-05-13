package com.binary.search;

import java.util.Scanner;

public class BinarySearch {

	static int[] myarray = { 5, 14, 25, 46, 77, 88, 99, 111, 123, 134 };
	static boolean found = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter element to be seached ");
		int num = scan.nextInt();
		boolean found = binarySearch(num);
		if (found == false) {
			System.out.println("Value not found");
		}
	}

	static boolean binarySearch(int value) {
		int lowIndex = 0;
		int highIndex = myarray.length;
		int finalIndex = 0;
		while (lowIndex <= highIndex) {
			int middleIndex = (lowIndex + highIndex) / 2;
			System.out.println(middleIndex);
			if (myarray[middleIndex] > value) {

				highIndex = middleIndex - 1;

			} else if (myarray[middleIndex] < value) {
				lowIndex = middleIndex + 1;
			} else {

				System.out.println("Found value at Index " + middleIndex);
				lowIndex = highIndex + 1;
				finalIndex = middleIndex;
				found = true;
			}
		}
		return found;

	}
}
