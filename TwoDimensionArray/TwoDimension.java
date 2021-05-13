package TwoDimensionArray;

import java.util.Scanner;

public class TwoDimension {

	public static void main(String[] args) {
		int stud[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter" + stud.length + "students info");
		for (int i = 0; i <= stud.length; i++) {
			System.out.println("enter" + (i + 1) + "student" + stud[i].length + "sub marks?");
			for (int j = 0; j < stud[i].length; j++) {
				stud[i][j] = sc.nextInt();
			}
		}
		System.out.println("3 student 3 subject marks");
		for (int i = 0; i < stud.length; i++) {
			for (int j = 0; j < stud[i].length; j++) {
				System.out.print(stud[i][j] + " ");
			}
		}
		System.out.println();
	}

}
