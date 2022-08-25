// Author Manish Chauhan

// Remove White Spaces form String

package AnudipAssiment;
import java.util.Scanner;
public class RemoveWhiteSpace {

	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		str=sc.nextLine();
		
		System.out.println("\nAfter removing the White Space From String");
		String RemoveSpace=str.replaceAll("\\s", "");
		System.out.println(RemoveSpace);
		
	}
	
}
