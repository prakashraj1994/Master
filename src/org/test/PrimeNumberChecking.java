package org.test;

import java.util.Scanner;

public class PrimeNumberChecking {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		n = input.nextInt();
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count = 1;
			}
		}
		if (count == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
}
