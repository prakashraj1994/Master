package org.test;

public class PrimeNumber {
	public static void main(String[] args) {
		int count;
		for (int i = 1; i <= 10; i++) {
			count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}

}
