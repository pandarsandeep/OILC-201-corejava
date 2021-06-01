package com.ojas.cmdargs;

public class AmPm {
	public static void main(String[] args) {
		if (args[0].equalsIgnoreCase("AM") ) {
			System.out.println("GOOD MENG " + args[1] );
		} else if (args[0].equalsIgnoreCase("PM")) {
			System.out.println("Good evng" + args[1] );

		} else {
			System.out.println("First argument should be Am or Pm");
		}

	}
}
