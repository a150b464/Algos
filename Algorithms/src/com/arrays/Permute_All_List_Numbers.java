package com.arrays;

import java.util.Random;
import java.util.Scanner;

public class Permute_All_List_Numbers {
	static int m = 1;

	static void permute(int[] a, int k) {
		if (k == a.length) {
			System.out.println(m);
			for (int i = 0; i < a.length; i++) {
				System.out.print(" [" + a[i] + "] ");
			}
			System.out.println();
			m++;
		} else {
			for (int i = k; i < a.length; i++) {
				int temp = a[k];// 2,5 = a[1]
				a[k] = a[i];// a[0] =a[0] =2,
				a[i] = temp;// 2

				permute(a, k + 1);
				
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;

			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of list: ");
		int N = sc.nextInt();
		int[] sequence = new int[3];
		sequence[0] = 0;
		sequence[1] = 1;
		sequence[2] = 2;
		/*
		 * sequence[3] = 10; sequence[4] = 12;
		 */

		/*
		 * for (int i = 0; i < N; i++) sequence[i] =
		 * Math.abs(random.nextInt(100));
		 */

		/*
		 * System.out.println("The original sequence is: "); for (int i = 0; i <
		 * 5; i++) System.out.print(sequence[i] + " ");
		 */

		System.out.println("\nThe permuted sequences are: ");
		permute(sequence, 0);

		sc.close();
	}
}