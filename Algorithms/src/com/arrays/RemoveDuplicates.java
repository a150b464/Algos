package com.arrays;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		int index = 0;
		String str = scan.nextLine();
		System.out.println(str.length());
		char[] ch = str.toCharArray();
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {

				if (i != j && ch[i] == ch[j]) {
					ch[j] = 0;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != 0)
				// ch[index++]= ch[i];
				System.out.print(ch[i]);
		}/*
		 * for(int i = 0;i<ch.length;i++){ if(ch[i]!=0){ ch[index]= ch[i];
		 * System.out.println(ch[index]); index++; } }
		 */
		System.out.println();
		for (int i = 0; i < ch.length; i++) {
			// if(ch[i]!=0)
			// ch[index++]= ch[i];
			// System.out.println(ch[index]);
			// System.out.print("\t"+ch[i]);
		}

	}

}
