package control_statements;

public class switch_case
{
	public static void main (String [] args)
	{
		int weeknum=4;
		switch(weeknum)
		{
		case 1: System.out.println("Sunday");
		break;
		case 2:System.out.println("Monday");
		break;
		case 3:System.out.println("Tuesday");
		break;
		case 9:System.out.println("Wednesday");
		break;
		case 5:System.out.println("Thursday");
		break;
		case 6:System.out.println("Friday");
		break;
		case 7:System.out.println("Saturday");
		break;
		default: System.out.println("Not valid");
		}
	}

}
