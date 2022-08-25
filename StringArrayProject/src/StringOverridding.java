
	/*
	2.Write a method that takes a String[] as an argument and returns
	a String containing the concatenation of all the strings in the
	input array. Invoke your method 3 times with different arguments. Make
	sure that your code handles the cases where the argument is null.

	 */


		//Author Manish Chauhan
	public class StringOverridding {
//		accepting a String array from user
		static String Concat(String str[])
		{
//			converting str array int StringBuilder object, for using append method
			StringBuilder stb = new StringBuilder();;
			try {
//				throwing an exception if string is empty
				if(str==null) {
					throw new Exception();
				}


				for(String ss : str) {
					
					stb.append(ss+" ");
				}
			}catch(Exception e)
			{
//				 print if  string is null
				System.out.print("Array never be empty");
			}
//			returning the string 
			return stb.toString();
		}
		public static void main(String[] args) {
//			make three array of Strings
			String str1[]= {"Anudip","Foundation"};
			String str2[]= {"Manish","Chuhan"};
			String str3[]= null;

//			 three times invoked the string
			System.out.println(Concat(str1));
			System.out.println(Concat(str2));
			System.out.println(Concat(str3));

		}
	}


