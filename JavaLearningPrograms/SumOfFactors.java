package JavaLearningPrograms;

public class SumOfFactors {
	static int num = 8;

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum = i + sum;
			}
		}
		System.out.println(sum);

	}

}
