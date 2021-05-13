package com.ojas.cmdargs;

public class Swap {
	public static void main(String[] args) {
		int temp=0;
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(" Before swap of integers is " + num1 + "  " + num2);
		temp = num1;
		num1 = num2;
		num2=temp;
		
		
		System.out.println("After swap of integers is " + num1 +" "  + num2);

	}

}
