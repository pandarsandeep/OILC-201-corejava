package com.ojas.switchprograms;

public class ECC_16_NaturalNumbers {

	public static void main(String[] arg) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(getNaturalNumbers(num1, num2));
	}

	public static String getNaturalNumbers(int num1, int num2) {
		int i = 1;
		String result = " ";
		while (num1 <= num2) {

			System.out.println(num1);
			num1++;
		}

		return result;
	}

}
