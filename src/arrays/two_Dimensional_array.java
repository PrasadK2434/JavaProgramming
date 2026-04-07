package arrays;

public class two_Dimensional_array
{
	public static void main (String args [])
	{
		/*int a[][]=new int [3][2];

		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		a[2][2]=700;
		a[3][0]=800;
		a[3][1]=900;
		a[3][2]=1000;


		System.out.println(a[0][1]);

		System.out.println(a.length); */

		int a[][]= { {100,200},{300,400}, {500,600}, {700,800},{900,1000}};
		/*System.out.println(a.length);
		System.out.println("Lenght of columns: "+a[0].length);
		//read single value from array
		System.out.println(a[2][1]);
		*/

		/*for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();

		}*/

		//Enhanced for Loop
		for (int arr[] : a)
		{
			for (int x: arr)
			{
				System.out.println(x);
			}
		}


		int b[][]= {{1,2},{3,4},{5,6}};

		for (int ar[]:b)
		{
			for (int x: ar)
			{
				System.out.print(x+"  ");
			}System.out.println();
		}
















	}

}
