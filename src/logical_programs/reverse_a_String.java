package logical_programs;

public class reverse_a_String
{
	public static void main (String [] args)
	{
		//Approach 1
		/*String s="Welcome";
		System.out.println(s.length());
		String rev="";

		for (int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

		//Approach 2
		String s1="Kulkarni";

		char a[]=s1.toCharArray();
		String rev1="";
		for (int i=a.length-1;i>=0;i--)
		{

			rev1=rev1+a[i];

		}
		System.out.println(rev1);*/

		//Approach 3 - using StringBuffer Class

		//StringBuffer a=new StringBuffer ("Welcome");
		//System.out.println(a.reverse());

		//Approach 4-using StringBuilder class
		StringBuilder s= new StringBuilder ("Welcome");
		System.out.println(s.reverse());































	}

}
