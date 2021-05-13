package com.ojas.cmdargs;

public class BiggestOfTwo {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		if (num1 > num2 ) 
		{
			System.out.println("biggest number is  = " + num1);
		}
		else
		{
			System.out.println("biggest number is  = " + num2);
		}
	}

}
