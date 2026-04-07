package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo
{
	public static void main (String [] args)
	{
		//Declaration
		//HashMap map=new HashMap();
		//Map hm=new HashMap();


		HashMap<Integer,String> hm=new HashMap<>();
		//Adding pairs
		hm.put(101, "John");
		hm.put(102, "Ram");
		hm.put(103, "Rohan");
		hm.put(104, "Jitu");
		hm.put(105, "Scotty");
		hm.put(102, "Project");
		System.out.println(hm);
		System.out.println("Size of HashMap: "+ hm.size());

		hm.remove(103);
		System.out.println("After removing Pair:"+hm);

		//Access value of the key

		System.out.println(hm.get(102));

		//Get all the keys from HashMaP
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());

		for (Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}


		hm.clear();
		System.out.println(hm.isEmpty());














	}

}
