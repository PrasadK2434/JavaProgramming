package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
	public static void main (String [] args)
	{
		//Declaration

		HashSet myset = new HashSet ();

		//Set myset=new HashSet ();

		//HashSet<String> myset=new HashSet<String>();
		//adding elements into HashSet
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);

		System.out.println(myset);

		myset.remove(100);
		System.out.println(myset);
		//Inserting Elements ---Insertion is not possible

		//Access specific elements-Not possible
		//workaround
		//Convert HashSet --->Arraylist
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));

		//size of hashset
		System.out.println(myset.size());
		//Read all the elements using Enhanced for loop
		/*for (Object x:myset)
		{
			System.out.println(x);
		}*/
		//using Iterator
		Iterator<Object> it=myset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		//clearing all the elements in hashset
		myset.clear();
		System.out.println(myset.isEmpty());













	}

}
