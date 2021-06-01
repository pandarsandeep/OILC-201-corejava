package com.ojas.basicsproblems;

public class Palindrome {

	public static void main(String[] s)
	{
		int num = Integer.parseInt(s[0]);
		System.out.println(isPalindrome(num));
	}

	public static boolean isPalindrome(int num) 
	{
		int rem;
		int rev = 0;
		
		int temp=num;

		while (num > 0)

		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == temp)
		{
			return true;

		} 
		else 
		{
			return false;
		}

	}
}