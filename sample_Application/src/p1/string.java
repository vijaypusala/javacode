package p1;

import java.util.Iterator;
import java.util.Scanner;

public class string {
	public static void reverseofstring(String s)
	{
	      String s1="";
	      for(int i=s.length()-1;i>=0;i--)
	      {
	    	  s1+=s.charAt(i);
	      }
	      System.out.println("Reverse of a String is: " +s1);
	      System.out.println("Enter any String"); 
	}
	
}
