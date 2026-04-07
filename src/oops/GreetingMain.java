package oops;

public class GreetingMain
{
	public static void main (String args [])
	{
		Greetings gr=new Greetings();
		gr.m1();
		String s1=gr.m2();
		System.out.println(s1);
		gr.m3("Prasad");
		System.out.println(gr.m4("Smith"));

	}

}
