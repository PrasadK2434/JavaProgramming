package logical_programs;

public class palindrome_string
{
	public static void main (String args [])
	{
		String str="MADAADAM";

		String rev="";
		for (int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);

		}

		System.out.println(rev);

		if (str.equals(rev))
		{
			System.out.println(str+" is Palindrome String");
		}
		else
		{
			System.out.println(str+" is not palivdrome string");
		}









	}

}
