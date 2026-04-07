package control_statements;

public class if_else_condition
{
	public static void main (String [] args)
	{
		int a=125;
		int b=32;


		if (a>b)
		{
			System.out.println("a value is greater than b");
		}
		else
		{
			System.out.println("b value is greater than a");
		}
		int person_age=13;

		if (person_age>=18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not eligible for vote");
		}
	}


}
