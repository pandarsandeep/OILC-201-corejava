package stringProgrammes;

public class FindVowels {

	public static void main(String[] args) {
		String s = new String("How are you");
		for (int i = 0; i < s.length(); i++) {
	if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'||s.charAt(i) =='u') {
		String res= s. charAt(i) + "";
				System.out.println("Given String contains " + res + " at the index " +i);
			}
		}

	}

}
