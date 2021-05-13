package com.ojas.switchprograms;

public class ECC_03_MultipleOf100 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("output is =" + getNextMultipleOf100(num));
	}

	public static int getNextMultipleOf100(int num) {
		if (num > 0) {
		int rem = num / 100;
		int sum = rem + 1 *100;
			return sum;
		} else if (num <= 0) {
			return -1;

		}
		return num;

	}

}
