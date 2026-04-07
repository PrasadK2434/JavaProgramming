package logical_programs;

public class countOfEvenandOddDigitsInNumbers
{
	public static void main (String args [])
	{
		int num=384783832;

		int evenCount=0;
		int oddCount=0;
		int temp;

		while (num !=0)
		{
			temp=num%10;
			if (temp%2==0)
			{
				evenCount++;
			}
			else {
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("Even Numbers"+ evenCount);
		System.out.println("Odd Numbers"+ oddCount);
	}

}
