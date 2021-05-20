package stringProgrammes;

import java.util.Arrays;

public class Anagram {
	 
	public static void main(String[] args) {
		boolean  res = true;
       String s1 = "keep"; 
       String s2 = "peek";
       if(s1.length() != s2.length()) {
    	   res = false;
       }
       else {
    	  char[] Array1= s1.toCharArray();
    	  char[] Array2= s2.toCharArray();
    	  Arrays.sort(Array1);
    	  Arrays.sort(Array2);
    	  res = Arrays.equals(Array1, Array2);
    	  
       }
       
       if(res) {
    	   System.out.println(s1 +" and " + s2 + " are anagram " );
       }
       else {
    	   System.out.println(s1 +" and " + s2 + "are not anagram" );
       }
	}

}
