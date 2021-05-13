package com.ojas.basicsproblems;

public class EvenNumberTester {
public static void getEvenNumbers(int num1,int num2)
{
	for(int i=num1;i<=num2;i++)
	{
		if(i%2 ==  0)
		{
			System.out.print(i + " ");
		}
	}
}
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("The Even Numbers Are : ");
		getEvenNumbers(a, b);

	}

}
