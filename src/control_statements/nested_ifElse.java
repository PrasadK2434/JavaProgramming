package control_statements;

public class nested_ifElse
{
	public static void main (String [] args)
	{
		if (false)
		{
			if (false)
			{
				System.out.println("abc");
			}
			else {
				System.out.println("123");
			}
		}
		else {
			System.out.println("xyz");
		}
	}

}
