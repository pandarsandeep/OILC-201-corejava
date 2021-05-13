package ArrayProgrammes;

import java.util.Scanner;

public class SmallestValueInArray {
	
	public static void main(String[] args) {
		 int arr[]= new int[5];
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter some values");
	
	 for(int i = 0;i < arr.length;i++) {
		 arr[i]= sc.nextInt();
		 
	 } 
	System.out.println("the smallest og given array is ="+smallest(arr)); 

	}
	 static int smallest(int[] arr) {
		
		
		int min = arr[0];
		for(int i = 1;i < arr.length;i++) {
			if(min >  arr[i])
				 min = arr[i];
			
		}
		return min;
		
	}

}
