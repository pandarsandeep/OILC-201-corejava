package JavaLearningPrograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		System.out.println(isStrongNumber(sc.nextInt()));
	}

	public static String isStrongNumber(int num) {
		int temp = num;
		int rem;
		int res1 = 0;
		String res = "";
		while (num > 0) {
            rem = num % 10;
			res1 += fact(rem);
			num = num / 10;
		}
		if (temp == res1) {
			res = "given number is arm strong number";
		} else {
			res = "given number is not a arm strong number";
		}
		return res;
	}

	public static int fact(int rem) {
		int fact = 1;
		for (int i = 1; i <= rem; i++) {
			fact = fact * i;

		}
		return fact;
	}
}
