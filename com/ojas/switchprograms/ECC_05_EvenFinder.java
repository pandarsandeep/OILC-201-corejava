package com.ojas.switchprograms;

public class ECC_05_EvenFinder {
	 public static void main(String[] args) {
	        int num = Integer.parseInt(args[0]);
	        System.out.println( " output is "+isEven(num));
	    }
	    
	    public static int isEven(int num) {
	        if(num % 2 == 0) {
	        	return 1;
	        }
	        else if(num <= 0) {
	        	return -1;
	        }
	        else
	        {
	        	return 0;
	        }
	    }
}
