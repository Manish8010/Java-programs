/*
Create two arrays. One containing String values: Peter , Amy, John ,Boyd, and
Cathy, and another one containing int values: 15,9, 14, 10,and 12.
 create an  table showing  these values as name value pairs as below.

Name           Value

Amy		9
Boyd		10
Cathy		12
John		14
Peter		15

*/

//  Author Manish Chauhan
import java.util.Arrays;

public class TwoArray {
	
	public static void main(String[] args)
	{
		
	
	
		String[] str= { "Peter","Amy","John","Boyd","Cathy"};
		int[] arr= { 15,9,14,10,12};
		
		// sorting the String  according to alphabet
		Arrays.sort(str);
		
		
		// sorting the Array  in ascending order 
		Arrays.sort(arr);
		System.out.println("Name \tvalues");
		
		
		// print the string and number values after sorting
		for(int i=0; i<arr.length|| i< str.length;i++)
		{
			
			
			System.out.println(str[i]+" \t  "+arr[i]);
			
		}
		
	}
}
 