package Interface;

interface Shape
{
   int lenght=10;
   int widht=20;

   void circle () ;


  default void square ()
  {
	  System.out.println("this is square.....");
  }

  static void rectangle ()
  {
	  System.out.println("this is rectangle......");
  }

}






public class Interfacedemo implements Shape

{

	void triangle()
	{
		System.out.println("this is triangle........");
	}
	@Override
	public void circle ()
	{
		System.out.println("this is circle");
	}
	public static void main (String args [])
	{
		Interfacedemo obj=new Interfacedemo();
		obj.circle();
		obj.square();
		Shape.rectangle();
		obj.triangle();

		System.out.println("--------------------");
		//Scenario2

		 Shape   i2=new Interfacedemo();

		 i2.circle();
		 i2.square();
		 Shape.rectangle();
		System.out.println(lenght*widht);












	}

}
