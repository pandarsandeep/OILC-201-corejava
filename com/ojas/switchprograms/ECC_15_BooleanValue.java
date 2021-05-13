package com.ojas.switchprograms;

public class ECC_15_BooleanValue {
	 public static void main(String[] args) {
	        boolean b1 = false, b2 = true, b3 = false;
	        System.out.println(countBoolean(b1, b2, b3));
	    }
	    public static boolean countBoolean(boolean b1, boolean b2, boolean b3) {
	    	boolean result = false;
	        if (b1 == true && b2 == true || b2 == true && b3 == true ||b3 == true && b1 == true) {
	        	result = true;
	        	return result;
	        }
	        else {
	        	return result;
	        }
		}
}
