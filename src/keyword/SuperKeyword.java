package keyword;
class Animal
{

 String color="white";
 void eat ()
 {
	 System.out.println("Eating nothing ........");
 }

}

class Dog extends Animal
{
  String color="Black";
  void display ()
  {

	System.out.println(super.color);
  }
  @Override
  void eat()
  {
	  System.out.println("Eating Bread........");
	  super.eat();
  }

}
public class SuperKeyword
{
    public static void main (String args [])
    {
    	Dog d=new Dog ();
    	d.display();
    	d.eat();

    }
}
