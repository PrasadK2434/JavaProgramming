package logical_programs;

public class reverseAnumber
{
	public static void main (String []args)
	{
		//Reverse a number

	/*	int i=1234;
		int rem ,rev=0;

		while (i!=0)
		{
			rem=i%10;
			rev=rev*10+rem;
			i=i/10;
		}
		System.out.println(rev); */

		/*int num=7654;
		int rem, rev=0;
		while (num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev); */


		/* int num=34787;
		int rem , rev=0;
		while (num !=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;

		}
		System.out.println(rev); */

		int num=483489;

		int rev=0, rem;

		while (num !=0)
		{
			rem=num%10;

			rev=rev*num+rem;
			num=num/10;
		}
		System.out.println(rev);






































	}

}
