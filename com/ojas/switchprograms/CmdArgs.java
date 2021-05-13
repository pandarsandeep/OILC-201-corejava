package com.ojas.switchprograms;

import java.util.Scanner;

public class CmdArgs {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 while (true) {
		 String menu = "menu driven applicayion  \n";
		 menu += "1. Addition \n";
		 menu += "2. Substraction \n";
		 menu += "3. Multiplication \n";
		 menu += "4. Division \n";
		 menu += "5. Exit \n";
		 menu += "Select any option  \n";
		 System.out.println(menu);
		 int choice = sc.nextInt();
		 String res = "";
		 switch(choice) {
		 case 1: 
			 System.out.println("enter two numbers");
			 res = "Addition = " + (sc.nextInt() + sc.nextInt());
			 break;
		 case 2:
			 System.out.println("enter two numbers");
			 res = "sub ="+(sc.nextInt() - sc.nextInt());
			 break;
		 case 3:
			 System.out.println("enter two numbers");
			 res = "mul =" +(sc.nextInt() * sc.nextInt());
			 break;
		 case 4:
			 
			 System.out.println("enter two numbers");
			 res = "div =" + (sc.nextInt() / sc.nextInt());
			 break; 
		 case 5:
			 System.exit(0);
			 break;
		 default :
				 res = "invalid option";
		 }
		 System.out.println(res);
	 }
	
	 

	}

}