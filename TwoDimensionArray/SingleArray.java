package TwoDimensionArray;

import java.util.Scanner;

public class SingleArray {
	public static void main(String[] args) {
		String names[] = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter" + names.length + "names");
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}
		//System.out.println("names[] : ");
		for (String x : names) {
			System.out.println(x);
		}

	}
}