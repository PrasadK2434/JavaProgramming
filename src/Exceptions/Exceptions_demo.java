package Exceptions;

import java.util.Scanner;

public class Exceptions_demo
{
	public static void main (String args[])
	{
		System.out.println("program is started .......");

		Scanner sc=new Scanner (System.in);
		//int num=sc.nextInt();
		/*System.out.println("Enter a number :");
		int num=sc.nextInt();
		System.out.println(100/num); //Arithmetic Exception */

		//Example 2
		int a[]=new int [5];

		System.out.println("Enter the position(0-4):  ");
		int pos=sc.nextInt();

		System.out.println("Enter a value: ");
		int value =sc.nextInt();
		a[pos]=value;
		System.out.println(a[pos]);

		//Example 3
		String s="Welcome";
		int num=Integer.parseInt(s);
		System.out.println(num);

		//Example 4
		String s1="welcome";
		System.out.println(s1.length());



		System.out.println("Program is completed.......");
		System.out.println("Program is exited.......");
	}

}
