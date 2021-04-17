package org.test;

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args)
	{ Scanner e = new Scanner(System.in); System.out.println("Enter a Number"); int n = e.nextInt();
	if (n % 2 == 0) {
	System.out.println("Even number");
	} else {
	System.out.println("Odd number");
	}
	}

}
