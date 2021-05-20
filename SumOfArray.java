package ArrayProgrammes;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
	 int studs[][] = new int[3][3];
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter "+ studs.length + "stunds info");
	 for(int i = 0;i <studs.length;i++) {
		 System.out.println("enter" + (i+1) + "studs"+ studs[i].length  );
	 }

	}

}
