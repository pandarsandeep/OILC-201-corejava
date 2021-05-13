package com.ojas.switchprograms;

import java.util.Scanner;

public class MonthsDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month name in three Letters");
       String monName = sc.next().toUpperCase();
       String result = "";
       switch(monName) {
       case "JAN":
       case "MAR":   
       case "MAY":
       case "JUL":
       case "AUG":
       case "OCT":
       case "DEC":
    	   result = monName + "has 31 days";
    	   break ;
       
       case "APR":  
       case "SEP":   
       case "JUN":   
       case "NOV":
    	   result = monName + "  has 30 days";
    	   break;
    	   
    	  case "FEB":
    		  result = monName +"  has 29 days";
    		  break;
    		  default :
    			  System.out.println("enter valid month");
       }
       
       System.out.println(result);
       
	}

}
