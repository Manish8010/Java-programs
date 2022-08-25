
//Author Manish Chauhan
// Count  the Vowel  of the charcter array

package AnudipAssiment;
import java.util.Scanner;

public class CountVowels {

	public static void main(String args[]) 
	{    
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your full name ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		char[] arr=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(arr[i]!=' ')
				if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
				{
					count++;
				}
		
		}
		
		try
		{
			int i=0;
			if(arr[i]=='x')
				System.out.println("characters contain variable x");
				
		}
		catch(Exception e)
		{
			
		
			System.out.println(e);
		}
		
		System.out.println("\nNumber of Vowels in Char Array= " +count);
		
	}
}
