package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo
{
	public static void main (String [] args)
	{
		//Declaration
		ArrayList mylist =new ArrayList();
		//List mylist=new ArrayList();

		//ArrayList<Integer> mylist=new ArrayList<Integer>();
		//ArrayList<String> mylist1=new ArrayList<String>();
		//ArrayList<Employee> mylist=new ArrayList<Employee>();

		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);

		//Size of a array

		System.out.println("Size of an arraylist:"+mylist.size());

		//Printing arraylist
		System.out.println("Printing data from arraylist:"+mylist);

		//Remove element from arrayList

		mylist.remove(4);
		System.out.println("After removing: "+mylist);
		System.out.println("Size of arraylist after removing: "+mylist.size());

		//Insert Element in the ArrayList
		mylist.add(2, "Java");
		System.out.println("After Insertion : "+mylist);

		//Modify/replace/change the value
		mylist.set(2, "Python");
		System.out.println("After replacing: "+mylist);

		//Access specific element from Arraylist
		System.out.println(mylist.get(3));

		//Reading all the elements from ArrayList
		//using normal for loop
		/*for (int i=0;i<=mylist.size()-1;i++)
		{
			System.out.println(mylist.get(i));

		}*/

		//using for each/enhanced loop
		/*for (Object x:mylist)
		{
			System.out.println(x);
		}
		*/


		//By using Iterator
		 Iterator <Object> it= mylist.iterator();
		 while (it.hasNext())
		 {
			 System.out.println(it.next());
		 }

		 //checking arraylist is empty or not
		 System.out.println(mylist.isEmpty());

		 //remove all the elements from arraylist
		 ArrayList mylist2=new ArrayList();
		 mylist2.add(100);
		 mylist2.add("welcome");


		 mylist.removeAll(mylist2);
		 System.out.println("After removing multiple elements :"+mylist);


		 //remove all the elements
		 mylist.clear();
		 System.out.println(mylist.isEmpty());





























	}

}














