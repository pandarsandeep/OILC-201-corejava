package com.ojas.cmdargs;

public class BiggestNumber {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		if (num1 > num2 && num1 > num3) {
			System.out.println("biggest number is  = " + num1);
		}
		else if (num2 > num3) {
			System.out.println("biggest number is  = " + num2);
		}
		else {
			System.out.println("biggest number is  = " + num3);
		}
	}

}
