package com.ojas.switchprograms;

public class ECC_04_Palindrome {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("output is= " + isPalindrome(num));
	}

	public static int isPalindrome(int num) {
		int rev = 0;
		if (num >= 100 && num <= 999) {
			while (num > 0) {

				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
		}

		else if (rev == num) {
			return 1;
		} else if (num < 100 && num > 999) {
			return -2;
		} else if (num <= 0) {
			return -1;
		}

		return num;
	}
}
