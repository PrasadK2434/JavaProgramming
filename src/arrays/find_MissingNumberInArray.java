package arrays;

public class find_MissingNumberInArray
{
	public static void main (String args [])

	{
		int a[]= {1,4,5,3};
		//Sum of elements in array
		int sum=0;
		for (int element : a) {
			sum=sum+element;
		}
		System.out.println("Sum of elenets in Array: "+sum);

		//Sum of all elements including missing element in array

		int sum1=0;
		for (int i=1;i<=5;i++)
		{
			sum1=sum1+i;

		}
		System.out.println("Sum of elements including missing number :"+sum1);
		System.out.println("Missing Number is :"+(sum1-sum));
		System.out.println("Modifications");














	}
}
