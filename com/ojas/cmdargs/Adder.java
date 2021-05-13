package com.ojas.cmdargs;

public class Adder {
	public static void main(String[] args) {
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if(a > 0 && b > 0) {
			System.out.println(getSum(a, b));
			}
		}
		catch(Exception e)
			{
				System.out.println("error");
			}
		}
	public static int getSum(int a, int b) {
		int c;
		c = a + b;
		return c;
	}
}
