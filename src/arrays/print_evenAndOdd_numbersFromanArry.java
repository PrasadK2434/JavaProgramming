package arrays;

public class print_evenAndOdd_numbersFromanArry
{
	public static void main (String [] args)
	{
		int a[]= {1,2,3,4,5};
		int even_num, odd_num;
		for (int element : a) {
			if (element%2==0)
			{
				System.out.println(element+" is even number");
			}
			else
			{
				System.out.println(element+" is odd number");
			}
		}
	}

}
