package logical_programs;

public class sumOf_digitsIn_Number
{
	public static void main (String [] args)
	{

		int num = 1234576776;
		 int sum=0;

		 int temp;


		  while (num>0)
		  {
			  temp=num%10;
			  sum=sum+temp;
			  num=num/10;
		  }
		  System.out.println(sum);
	}

}
