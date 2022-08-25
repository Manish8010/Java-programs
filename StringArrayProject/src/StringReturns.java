/** In this program StringContainingX we takes String name str and returns a String repeatString of 
 * same length containing the 'X' character in all positions except the last 4 positions.
 *  Author @Manish Chauhan
 * */

import java.util.Scanner;

public class StringReturns {
	// Method is displaying here
	String display()
	{
		 Scanner sc=new Scanner(System.in);

		 
		 // input String from the user
	       System.out.println("Enter  the String: ");
	       String str=sc.nextLine();
	       
	       
	       if(str.length()>4)
	       {
	    	   String allexceptlast4=str.substring(0,str.length()-4);
	    	   String repeatString="x".repeat(allexceptlast4.length());
	    	    repeatString=repeatString+str.substring(str.length()-4);
	    	   // the output
	    	   System.out.println(repeatString);
	       }
	       else
	       {
	    	   System.out.println("Enter String word number more than four");
	       }
	       sc.close();
		   return str;
	       
		}
	public static void main(String args[])
	{
		StringReturns  obj=new StringReturns();
		//calling the method display()
		obj.display();
	}
}

