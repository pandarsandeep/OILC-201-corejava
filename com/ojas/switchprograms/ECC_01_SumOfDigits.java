package com.ojas.switchprograms;

public class ECC_01_SumOfDigits {
	public static void main(String[] args) {
		int result = 0;
		int num = Integer.parseInt(args[0]);
		System.out.println("condition output is=  " + getSumOfDigits(num));
	}

	public static int getSumOfDigits(int num) {

		if (num >= 10 && num >= 99) {
			int rem = num % 10;
			int qou = num / 10;
			int result = rem + qou;
			return result;
		} else if (num < 0) {
			return -3;

		} else if (num >= 0 && num <= 9) {
			return -1;
		} else {
			return num;

		}

	}
}


