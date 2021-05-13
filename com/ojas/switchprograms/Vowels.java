package com.ojas.switchprograms;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any charector");
		char ch = sc.next().toUpperCase().charAt(0);
		boolean b = false;
		String result;
		if (Character.isLetter(ch)) {
			switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				b = true;
				break;
			}

			if (b) {

				result = ch + " is an vowel";
			}

			else {
				result = ch + " is an consonent";

			}
			System.out.println(result);
		} // if loop closing
		else {
			System.out.println("not a charector");
		}
	}
}
