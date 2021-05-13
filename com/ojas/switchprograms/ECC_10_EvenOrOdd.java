package com.ojas.switchprograms;

public class ECC_10_EvenOrOdd {
	public static void main(String[] args) {
        int num = -5;
        System.out.println(isEvenOrOdd(num));
    }

    public static String isEvenOrOdd(int num) {
    	 String result = "";
        if(num <= 0 ) {
        	result = "Invalid Input";
        }
        else if (num % 2 == 0) {
        	result = "number is even";
        }
        else {
        	result = "number is odd";
        }
		return result;
    }
}
