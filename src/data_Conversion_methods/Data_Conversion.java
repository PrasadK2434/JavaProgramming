package data_Conversion_methods;

public class Data_Conversion
{
	public static void main (String args [])
	{
		//String -->int
		String s="123";
		//int sint=Integer.parseInt(s);
		//System.out.println(sint);
		/*String s1="12";
		System.out.println(Integer.parseInt(s)+Integer.parseInt(s1));

		//String-->Double
		String s2="124.5";
		String s3="2342.23";

		System.out.println(Double.parseDouble(s2)+Double.parseDouble(s3));

		String str="Welcome";
		System.out.println(Boolean.parseBoolean(str));*/


		//int,double,boolean,char--->String
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;

		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(bool));














	}

}
