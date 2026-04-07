package arrays;

import java.util.Scanner;

public class taking_MultipleInputsFromKeyboard
{
	public static void main (String args [])
	{
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter first number :");
		int num=sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2=sc.nextInt();
		System.out.println("Enter City name :");
		String str=sc.next();
		System.out.println("Enter decimal number :");
		double d=sc.nextDouble();
		System.out.println("First number is :"+num);
        System.out.println("Second numbe is :"+num2);
        System.out.println("City name is "+str);
        System.out.println("Decimal value is :"+d);
        System.out.println("Enter Unknown value :");
        Object value=sc.next();
        System.out.println(value);









	}

}
