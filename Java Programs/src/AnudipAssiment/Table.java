//@Manish Chauhan

/*3.Write a program to print table of any number input by user.*/



package AnudipAssiment;
import java.util.Scanner;

public class Table {
		
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		char str='y';
		while(str=='y')
		{
			//Instruction for user
			System.out.println("Enter number  You want to print Table");
			int n=sc.nextInt();//take input from user
			int i;
			for( i=1;i<=10;i++)
			{
				//to print table
				System.out.println(n+"*"+i+"="+n*i);

			}
			//to continue for another table
			System.out.println("Do you want to continue or not press('y','n')");
			str=sc.next().charAt(0);
		}
	}
}
