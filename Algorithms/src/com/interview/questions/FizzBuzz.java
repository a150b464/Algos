package com.interview.questions;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number ");
		Integer num = scan.nextInt();

		if ((num % 15 == 0)) {
			System.out.println("FizzBuzz");
		} else if ((num % 5 == 0)) {
			System.out.println("Buzz");
		} else if ((num % 3 == 0)) {
			System.out.println("Fizz");
		}else{
			System.out.println(num);
		}
	}
}
