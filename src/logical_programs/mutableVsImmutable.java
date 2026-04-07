package logical_programs;

import java.util.Arrays;

public class mutableVsImmutable
{
	public static void main (String args [])
	{

		// mutable-can change
		int a[]= {1,2,5,7,6};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);// mutable
		System.out.println(Arrays.toString(a));

		//immutable
		String s = new String ("Welcome");
		System.out.println(s);

		s.concat("to java");
		System.out.println(s);    // Immutable--> We cannot change




	}

}
