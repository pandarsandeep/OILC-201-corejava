package com.ojas.cmdargs;

public class SumOfArgs {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0] + args[1]);
		int b = Integer.parseInt(args[2] + args[3]);
		System.out.println(a + b);
	}
}
