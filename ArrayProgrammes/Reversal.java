package ArrayProgrammes;

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some values");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		reversal(arr);

	}
public static void reversal(int[] arr) {
	for(int i = arr.length-1;i >= 0 ;i--) {
		System.out.println(arr[i]);
	}
	
}
}
