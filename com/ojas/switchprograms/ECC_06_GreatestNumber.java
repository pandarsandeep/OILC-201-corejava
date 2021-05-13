package com.ojas.switchprograms;

public class ECC_06_GreatestNumber {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		System.out.println(getGreatest(num1, num2));
	}

	public static int getGreatest(int num1, int num2) {

		if (num1 == 0 || num2 == 0) {
			return -2;
		} else if (num1 < 0 || num2 < 0) {
			return -1;
		} else if (num1 > num2) {
			return num1;
		}
		{
			return num2;
		}
	}

}
