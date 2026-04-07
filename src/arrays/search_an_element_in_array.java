package arrays;

public class search_an_element_in_array
{
	public static void main (String []args)
	{
		int a[]= {100,200,300,400,400};

		// need to find 400 is there or not
		int num=200;
		boolean status=false;


		 /* for (int i=0;i<a.length;i++)
		{
			if (a[i]==num)
			{
				System.out.println(a[i]+ " is there at "+i+" index");
				status=true;

				break;
			}


		}

		if (status==false) {

		System.out.println("Element not found"); }  */

		for (int x : a)
		{
			if (x==num)
			{
				System.out.println("Number is matched");
				status=true;
				break;
			}
		}
		if (!status)
		{
			System.out.println("Number is not matched");
		}
















	}

}
