package com.ojas.cmdargs;

import java.util.Scanner;

public class BiggestOfFive {

	public static void main(String[] args) {
		int biggest = Integer.parseInt(args[0]);
		int next = Integer.parseInt(args[1]);
		if(next > biggest) {
			biggest = next;
		}
		 next = Integer.parseInt(args[2]);
	 if(next>biggest)

	{
		biggest = next;
	}
	 next = Integer.parseInt(args[3]);
	if(next > biggest) {
		biggest = next;
	}
	{
		biggest = next;
	}
	 next = Integer.parseInt(args[4]);
	 if(next>biggest)
	{
		biggest = next;
	}
	 System.out.println("Biggest nunmber is    " +  biggest );
}
	
}

