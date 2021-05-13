package ArrayProgrammes;

import java.util.Scanner;

public class DisplayEven {

	public static void main(String[] args) {

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some values");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		evenNumbers(arr);

	}

	static void evenNumbers(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.println(arr[i]);

		}

	}

}
