package org.test;

public class MyNumberSumRec {
	int sum = 0;

	public int getNumberSum(int number) {
		if (number == 0) {
			return sum;
		} else {
			sum += (number % 10);
			getNumberSum(number / 10);
		}
		return sum;

	}

	public static void main(String a[]) {
		MyNumberSumRec m = new MyNumberSumRec();
		System.out.println("Sum is: " + m.getNumberSum(5678));
	}
}
