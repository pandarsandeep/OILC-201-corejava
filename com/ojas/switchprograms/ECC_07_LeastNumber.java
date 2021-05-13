package com.ojas.switchprograms;
import java.util.Scanner;

public class ECC_07_LeastNumber {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter two numbers");
	       int num1 = sc.nextInt();
	    		int  num2 =   sc.nextInt();
	       System.out.println(getLeastNum(num1,num2)); 
	    }

	    public static int getLeastNum(int num1, int num2) {
	    	if(num1 < 0 || num2 <0) {
	    		return -1;
	    	}
	    	else if(num1 == 0 || num2 == 0) {
	    		return -2;
	    	}
	    	else if(num1 < num2 ) {
	    	return num1;
	    	}
	    	else
	    	{
	    		return num2;
	    	}
	    	
	    	
	    }

}
