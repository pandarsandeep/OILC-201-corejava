package com.ojas.cmdargs;

public class EvenOdd {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		if (num1 % 2 == 0) {
			System.out.println(num1 + "  Given nuber is Even ");
		} else {
			System.out.println(num1 + "  Given nuber is Odd ");
		}
	}

}
