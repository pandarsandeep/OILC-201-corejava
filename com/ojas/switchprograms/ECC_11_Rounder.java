package com.ojas.switchprograms;

public class ECC_11_Rounder {
	 public static void main(String[] args) {
	        int num = -2;
	        System.out.println(calculate(num));
	    }

	    public static int calculate(int num) {
	        if(num < 0 || num == 0) {
	        	return -1;
	        }
	        else if(num % 2 == 0) {
	        	int res = num * num;
	        	return res;
	        }
	        else if(num % 2 != 0) {
	        	int res = (num * num) * num;
	        	return res;
	        }
			return num;
	    }

}
