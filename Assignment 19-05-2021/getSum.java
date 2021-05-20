package stringProgrammes;

import java.util.Scanner;

public class getSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Sum of two number is "+ sum(num1, num2));

	}

	static String sum(int num1, int num2) {
		int add = 0;
		String res;
		if(num1 > 0 && num2 > 0) {
		add = num1 + num2;
		res = add + " ";
		return res;
		}
		else {
			res = "error";
			return res;
		}
	}
	
}
