//author manish chauhan
// java program to count the total no of character in a string
public class CountCharacter {
public static void main (String [] args)
{
	String string="I am Manish Chauhan";
	int count=0;
	for(int i=0;i<string.length();i++)
	{
		if(string.charAt(i) != ' ')// use for seprate space from string and count only Character
			count++;
		
	}
	System.out.println("Total no of Character in a String is:"+count);
}

}
