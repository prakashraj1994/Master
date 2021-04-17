package org.test;

import java.util.Scanner;

public class ArmstrongNumberCheck {
	public static void main(String[] args) {
		int n, a, i = 0, j = 0;
		Scanner an = new Scanner(System.in); System.out.println("Enter a number"); n = an.nextInt();
		a = n;
		while (a > 0) {
		i = a % 10;
		j = j + (i * i * i); a = a / 10;
		}
		if (n == j) {
			System.out.println("Armstrong number");
		} else {
		System.out.println("Not armstrong Number");
		}
		
		}

}
