package Casting;

class Parent
{
  String name ="John";
  void m1()
  {
	  System.out.println("this is m1 method from Parent class");
  }
}

class Child extends Parent
{
  int id=101;
  void m2()
  {
	  System.out.println("this is m2method from Child class");
  }
}

public class TypeCastingObjects1
{
	public static void main (String args [])
	{
		/*Child c =new Child();
		c.m2();
		c.m1();
		System.out.println(c.name);
		System.out.println(c.id);

		Parent p=new Child();
		p.m1();
		System.out.println(p.name);
	    //p.m2();   ---> we cannot access
		//p.id------*/
		Parent p=new Parent();

		Child c= (Child) p;
	     System.out.println(c.name);
	     System.out.println(c.id);
	     c.m1();
	     c.m2();


	}


}
