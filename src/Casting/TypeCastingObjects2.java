package Casting;

class Animal
{

}

class Dog extends Animal {}
class Cat extends Animal {}

public class TypeCastingObjects2
{
	public static void main (String args [])
	{
		Animal an=new Dog ();
		Cat ct= (Cat) an;



	}

}
