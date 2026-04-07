package Exceptions;

public class FinallyBlock {

	public static void main(String[] args)
	{
		String s="Welcome" ;
		try
		{
			System.out.println(s.length());
		}
		catch (NullPointerException e)
		{
			System.out.println("catch block handled eception.......");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("you entered into finally block..........");
		}


		System.out.println("Program finished.........");


	}

}
