package com.ojas.switchprograms;

import java.util.*;

public class EvenOddUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		String result = "";
		switch (num % 2) {
		case 0:
			result = num +" is even number ";
			break;
		case 1:
			result = num +" is odd number ";
		}
		System.out.println(result);
	}

}
