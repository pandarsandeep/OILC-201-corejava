package ArrayProgrammes;

import java.util.Scanner;

public class PrimeNumber {

	
		public static void main(String[] args) {

			int arr[] = new int[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("enter some values");

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

			}
			realPrime(arr);

		}

		static String primeNumbers(int arr[]) {

			int count = 0;
			for (int i = 1; i <= a; i++) {
				if (arr[][0] % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				return "number is prime";
			}
			else {
				return "not a prime";
			}

			}
       static void realPrime(int arr[]) {
		 for(int i = 2;i < arr.length-1;i++) {
			 primeNumbers( arr[i]);
		 }
		
          
			

	

}
