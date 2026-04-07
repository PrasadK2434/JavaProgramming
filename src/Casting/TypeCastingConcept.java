package Casting;

public class TypeCastingConcept
{
	public static void main (String [] args)
	{
		//Upcasting -- Converting value from smaller-->larger
		//int-->long
		//float-->double

		//Downcasting-converting value from larger --> smaller
		//long-->int
		//double-->float

		//upcasting - automatic ----smaller to larger
		 /*int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);

		float floatvalue=10.5f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue); */

		//downcasting --manually--larger to smsaller
		long longvalue=100000;
		int intvalue=(int)longvalue;


		double doublevalue=125.55;
		float floatvalue=(float)doublevalue;


		/*int i=100;
		double d=i;
		System.out.println(d); */

		double d=10.5;
		int i=(int) d;
		System.out.println(i);

	}


}
