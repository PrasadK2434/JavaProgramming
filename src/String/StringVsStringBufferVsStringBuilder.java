package String;

public class StringVsStringBufferVsStringBuilder
{
	public static void main (String args[])
	{
		//String -immutable
		String s="Welcome";
		s.concat("to Java");
		System.out.println(s); //immutable,cannot change original value of s

		//StringBuffer -mutable
		StringBuffer s1=new StringBuffer("Welcome");
		s1.append("to Java");
		System.out.println(s1);  //mutable, we can change original value of s1

		//StringBuilder- mutable
		StringBuilder s2=new StringBuilder ("Welcome");
		s2.append("to selenium");
		System.out.println(s2);  //mutable, we can change original value of string
	}

}
