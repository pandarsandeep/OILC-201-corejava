package com.ojas.switchprograms;

public class ECC_12_SumOfMul10 {
	public static void main(String[] args) {
		int a = 26, b = 34, c = 44;
		System.out.println (sumOfRoundedValues(a, b, c));
	}
	private static int sumOfRoundedValues(int num1, int num2, int num3)
	{
		 int sum=0;
		 if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
				sum = -1;
			} else {
				sum = round(num1) + round(num2) + round(num3);
			}
			return sum;
		
	}

	private static int round(int num) {
		if(num%10 < 5) {
			return ((num) / 10) * 10;
		}
		else {
		return ((num + 9) / 10) * 10;
		}
	}
	

}
