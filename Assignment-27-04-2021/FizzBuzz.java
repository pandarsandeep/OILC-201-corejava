package com.ojas.basicsproblems;

public class FizzBuzz {
	public static void main(String[] args) {
		int num = 36;

		if (num > 0)
			System.out.println(getOutputString(num));
		else 

			System.out.println("Error");

	}

	private static String getOutputString(int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return ("FizzBizz");
		} else if (num % 5 == 0) {
			return ("Bizz");
		} else if (num % 3 == 0) {
			return ("Fizz");
		} else {
			return "" + (num);

		}
	}

}
