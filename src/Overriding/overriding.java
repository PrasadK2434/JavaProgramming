package Overriding;

class Bank
{
	double roi ()
	{
		return 0;
	}
}

class ICICI extends Bank
{
 	@Override
	double roi ()
 	{
 		return 10.5;
 	}
}

class SBI extends Bank
{
	@Override
	double roi ()
	{
		return 11.5;
	}
}




public class overriding
{

     public static void main (String args [])
     {
    	 ICICI i = new ICICI ();
    	 System.out.println(i.roi());
    	 SBI sbi=new SBI();
    	 System.out.println(sbi.roi());
     }
}
