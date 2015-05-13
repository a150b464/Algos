package com.arrays;
import java.util.Random;
import java.util.Scanner;

public class Permute_List_All_Numbers {

	static void permute(int a[], int k) {
		{
			if (k == a.length) {

				for (int i = 0; i < a.length; i++) {
					System.out.println(" [" + a[i] + "]");

				}
				System.out.println();
			} else {
				for (int i = k; k < a.length; k++) {
					int temp = a[k];
					a[k] = a[i];
					a[i] = temp;
					permute(a, k + 1);
					temp = a[k];
					a[k] = a[i];
					a[i] = temp;

				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of list ");
		int n = sc.nextInt();
		int[] sequence = new int[n];
		for (int i = 0; i < n; i++) {
			sequence[i] = Math.abs(random.nextInt(100));
		}
		System.out.println("The original sequence is: ");
		for (int i = 0; i < n; i++)
			System.out.print(sequence[i] + " ");

		System.out.println("\nThe permuted sequences are: ");
		permute(sequence, 0);

		sc.close();
	}

}
