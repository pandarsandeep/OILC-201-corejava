package com.ojas.cmdargs;

import java.util.Scanner;

public class StudentCalculator {

	public static void main(String[] args) {
		int total = 0;
	    int avg;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the subject marks : ");
		
			
		    int sub1 = scanner.nextInt();
			int sub2 = scanner.nextInt();
			int sub3 = scanner.nextInt();
			int sub4 = scanner.nextInt();
			int sub5 = scanner.nextInt();
			if (sub1 < 35 || sub2 < 35 || sub3 < 35 || sub4 <  35 || sub5 < 35) {
				System.out.println("fail");
			}
			else {
				total = sub1 + sub2 + sub3 + sub4 + sub5;
				avg = (sub1 + sub2 + sub3 + sub4 + sub5)/ 5;
				System.out.println("Total is "+ total);
				System.out.println("average ia "+ avg);
			}
			  if (total>400) {
				System.out.println("Grade A");
			}
			
			

	}
}
