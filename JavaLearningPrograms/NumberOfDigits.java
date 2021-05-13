package JavaLearningPrograms;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		int count = 0,rem,res = 0;
		Scanner sc = new Scanner(System.in);
        System.out.println("enter any nymber");
        int str = sc.nextInt();
        while(str > 0) {
        	rem = str % 10;
        	 ++count;
        	str = str/10;
        }
        
        System.out.println(count);
	}

}
