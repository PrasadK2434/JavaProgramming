package String;

import java.util.Scanner;

public class string_methods
{
	public static void main (String [] args)
	{
		//String s= "Welcome";
		//String s=new String ("Welcome");
		//System.out.println(s);


		//length ()- returns length of a string (Number of characters)

		Scanner sc=new Scanner (System.in);
		/*System.out.println("Enter a string you want :");
		String str=sc.next();
		System.out.println("Length of string is : "+str.length()); */

		//concat()- joining string
		/*String str1="Welcome";
		String str2="To Home";
		System.out.println(str1.concat(str2));
		System.out.println("Enter string one :");
		String s1=sc.next();
		System.out.println("Enter String Second");
		String s2=sc.next();
		System.out.println("Joining of s1 and s2-->"+s1.concat(s2));*/
		//Join 3 strings
		/*String a="Welcome";
		String b="To";
		String c="Java";

		String d=a.concat(b);
		String e=d.concat(c);
		System.out.println(e);
		System.out.println(a.concat(b).concat(c));
		System.out.println("welcome".concat("to java").concat("Perfect"));

		//trim ()------> remove spaces right and left side
		/*String str=" Prasad Kulkarni     ";
		System.out.println(str.trim());
		System.out.println(str.length());
		System.out.println((str.trim()).length());
		System.out.println("str includes spaces : "+((str.length()-(str.trim().length()))));
		String name="      welcome        ";
		System.out.println(name.trim());
		System.out.println(name.trim().length()); */


		//charAt()-----> returns a character from a string based on index
		/*String str="Prasad";
		System.out.println(str.charAt(4));
		//System.out.println(str.charAt(6));
		String str1="Kulkarni";
		System.out.println(str1.charAt(3));
		System.out.println(str1.length()); */

		//contains()---
		/*String s1="Welcome to Java";
		String s2="come";
		System.out.println(s1.contains(s2));
		String s3="to";
		System.out.println(s1.contains(s3)); */

		//equals(), equalsIgnorecase();
		/*String s1= "Prasad";
		String s2="Prasad";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		String s3="Prasad";
		String s4="PRASAD";
		System.out.println(s3.equalsIgnoreCase(s4));
		String a="Welcome";
		String b="WelcomE";
		System.out.println(a.equalsIgnoreCase(b)); */

		//replace -------->replace a single/multiple (sequence) of characters in a string
		/*String str="Welcome to Selenium java python selenium";
		System.out.println(str.replace('e', 'X'));

		String str1="Welcome to Java selenium java selenium";
		System.out.println(str1.replaceAll("Java", "Mayghala")); */

		//substring()----> extract substring from a main string
		/*String str="Welcome to Java";
		String str1="Welcome ";
		System.out.println(str1.substring(1, 4));
		System.out.println(str.substring(4));
		System.out.println(str1.subSequence(0, 4));
		String s="Selenium";
		System.out.println(s.substring(1, 5));*/

		//toUpperCase()   toLowerCase()
		/* String s="Welcome";
		System.out.println(s.toUpperCase());
		String s1="Prasad";
		System.out.println(s1.toLowerCase());
		String s3="upper";
		System.out.println(s3.toLowerCase());*/

		//Split()- Split the string into multiple parts based on delimiter
		String s="Prasad@gmail.com";
		String s1="Prasad.Kulkarni@gmail.com";
		String[] a=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		String b[]=s1.split("@");
		System.out.println(b[0]);
		System.out.println(b[1]);

		String amount= "$15,20,55";
		System.out.println(amount.replace("$", ""));

























































	}

}
