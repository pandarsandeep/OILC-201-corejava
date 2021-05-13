package com.ojas.switchprograms;

public class ECC_02_DigitChecker {
	int result = 0;

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("output is =" + getDiffOfDigits(num));
	}

	public static int getDiffOfDigits(int num) {
		if (num >= 10 && num <= 99) {
			int rem = num % 10;
			int qou = num / 10;
			int result = rem - qou;
			return result;
		} else if (num < 0) {
			return -3;
		} else if (num > 99) {
			return -2;
		} else if (num >= 0 && num <= 9) {
			return -1;
		} else {
			return num;
		}
	}
}
