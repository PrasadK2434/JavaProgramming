package arrays;

public class find_repeatations_of_array
{
	public static void main (String args []) {
	int a[]= {10,20,30,25,10,20,40,10,20,25,10,50};

	int count=0;
	int num=10;

	boolean status=false;

	for (int x:a)
	{
		if (x==num)
		{
			count++;
		}
	}
	System.out.println(count);



}

}