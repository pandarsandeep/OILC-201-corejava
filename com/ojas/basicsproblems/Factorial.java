package com.ojas.basicsproblems;

public class Factorial {

	public static void main(String[] args) {

		int num = 5;
		int fact = 1;
		try {
			if (num > 0) 
			{
				for (int i = 1; i <= num; i++) 
				{

					fact = fact * i;

				}
			} 
			else 
			{
				System.out.println(10 / 0);

			}
			System.out.println("fact=" + fact);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}
