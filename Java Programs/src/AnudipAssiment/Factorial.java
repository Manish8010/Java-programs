//Author @Manish Chauhan

/*1. Write a method th find factorial of a number input by user.
factorial(int n).call this methos from main() and pass argument n .
Repeat this untill user enters no.
*/


package AnudipAssiment;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args)
	{
	
	Scanner sc=new Scanner(System.in);
	char ch='y';
	
	//to print infinite time when user press y
		while(ch=='y')
		{
			// Request to do these task  
			System.out.println("Enter Number For Factorial");
			//take user input
			int n=sc.nextInt();
			
			factorial(n);//call Factorial function with input n
			System.out.println("Do u want to continue(y/n)");
			ch=sc.next().charAt(0);
		}
		
	}
	
	
	
	static void factorial(int n)
	{
		int i=1,fact=1;
		while(i<=n) //always  user entered n is greater than i ,it is condtion then entered the loop 
		{
		fact=fact*i;
		i++;//increment of I
		}//end of while loop
		System.out.println("factorial number is "+fact);

	}
	
	
	
}

