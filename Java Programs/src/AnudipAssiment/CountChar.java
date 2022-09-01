// @Manish Chauhan 

/*2.Write a program to count number of char in a string entered by user excluding space.
*/

package AnudipAssiment;
import java.util.Scanner;

public class CountChar {
		
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		//to print message to define what user do
		System.out.println("Enter Your Full Name ");
		//to take input from user
		String str=sc.nextLine();
		
		//To see what user entered
		System.out.println("You Entered:\t"+str);
		
		
		int count=0;//intially number of character is zero
		for(int i=0;i<str.length();i++)//loop goes last index of string length
		{
			if(str.charAt(i)!=' ') //any index in string length  if the Space is present then the count will be increases by +1
									
			{
				count++;		//ignor the Spaces
			}//end of if condition
		}//end of for loop
		//to show number of Character
		System.out.println("Number of Character Without Spaces: \t"+count);
		
	}
}
