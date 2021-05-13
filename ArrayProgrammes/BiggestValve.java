package ArrayProgrammes;

import java.util.Scanner;

public class BiggestValve {
	static int num[] = { 1, 2, 6, 9, 10 };

	public static void main(String[] args) {

		System.out.println(" Biggest value in a array is = "+biggest());
	}

	public static int biggest() {

		int max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
		}
		return max;

	}

}
