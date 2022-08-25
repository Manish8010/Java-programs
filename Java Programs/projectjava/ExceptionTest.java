package AnudipAssiment;
import java.lang.Exception;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		try
		{
			int a= Integer.parseInt(str1);
			int b=Integer.parseInt(str2);
			int c=a/b;
			System.out.println("Division by "+a+" and "+b+ " is "+c);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Format mismatch");
		}
		
		catch(Exception e)
		{
			System.out.println("Invalid Division\n"+e);
		}
		
		finally
		{
			System.out.println("Exception encountered");
		}
		
		System.out.println("Exception Handling Completed");
	}
}
