package logical_programs;

public class count_digits_of_a_number
{
	public static void main (String args [])

	{
		int num=667676765;

		int count=0, rem;
		while (num!=0)
		{
			rem=num%10;
			num=num/10;
			count++;

		}
		System.out.println(count);
	}
}
