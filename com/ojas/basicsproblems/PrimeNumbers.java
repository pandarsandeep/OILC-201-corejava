package com.ojas.basicsproblems;

public class PrimeNumbers {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println(isPrime(a));
	}

	public static String isPrime(int a)  
	{
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return " prime number";
		}
		else {
			return "not a prime";
		}
	}
}
