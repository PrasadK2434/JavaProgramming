package keyword;

public class StaticMain

{
	public static void main(String[] args)
	{

		//1) static methods can access static stuff directly (without object)
		System.out.println(Staticdemo.a);
		Staticdemo.m1();
		//System.out.println(b);  //cannot access, b is non static
		//m2();
		Staticdemo sd= new Staticdemo();
	    System.out.println(sd.b);
	    sd.m2();
	    sd.m();




	}

}
