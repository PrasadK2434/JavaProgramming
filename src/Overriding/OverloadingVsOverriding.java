package Overriding;

class ABC
{
	void m1 (int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}

}

class XYZ extends ABC
{
	@Override
	void m1 (int a)
	{
		System.out.println(a*a);
	}
	void m2 (int a , int b)
	{
		System.out.println(a*b);
	}
	@Override
	void m2(int b)
	{
		System.out.println(b*b);
	}

}






public class OverloadingVsOverriding
{
	public static void main (String args [])
	{
		XYZ xyz=new XYZ ();
		xyz.m1(100);
		xyz.m2(200);
		xyz.m2(12, 13);
	}

}
