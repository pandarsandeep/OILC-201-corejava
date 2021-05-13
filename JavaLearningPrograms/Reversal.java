package JavaLearningPrograms;

 public class Reversal {
     static int num = 12345;
	public static void main(String[] args) {
		int res = 0;
		int temp = num;
		
		while(num > 0) {
		int rem = num % 10;
		res =  res* 10 + rem ;
		  num = num/10;
		}
		System.out.println(res);

	}

}
