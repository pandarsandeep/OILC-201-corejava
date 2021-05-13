package ArrayProgrammes;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some values");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		sort(arr);

	}

	static void sort(int[] arr) {
		int temp = 0;
		for (int i = 0; i <= arr.length-1; i++) {
			for (int j = i + 1; j <= arr.length-1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

}
