package com.ojas.basicsproblems;

public class Armstrong {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		try {
			if (num>0 && args[0].length()==4) {
				System.out.println(isarmstrong(num));
			}
			else {
				System.out.println(10 / 0);
			}
		} 
		catch (Exception e) {
			System.out.println("error");
		}
	}

	public static String isarmstrong(int num) {
		int temp=num;
		int res = 0;
		int rem;
		while (num != 0)
		{
			rem = num % 10;
			res = res + rem*rem*rem*rem;
			num = num / 10;
		}
		if (res == temp) 
		{
			return "palindrome";
		} else 
		{
			return "Not Palindrome";
		}
	}

}
