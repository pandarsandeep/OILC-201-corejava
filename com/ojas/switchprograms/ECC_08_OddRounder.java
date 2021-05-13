package com.ojas.switchprograms;

public class ECC_08_OddRounder {
	 public static void main(String[] args) {
	        int num = 97;
	        System.out.println(oddRounder(num));
	    }

	    public static int oddRounder(int num) {
	        if(num % 2 ==0) {
	        	return num;
	        }
	        else if(num % 2 != 0) {
	        	int qou= num / 10;
	        	int sum= (qou + 1) * 10;
	        	return sum;
	        } 
	        else if (num < 0) {
				return -1;
	        }
	        else if (num == 0) {
				return -2;
	    }
			return num;

	    }
}
