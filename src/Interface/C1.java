package Interface;

public class C1 extends C2 implements I1,I2
{

	public static void main(String[] args)
	{

		C1 obj=new C1();
		obj.m1();
		obj.m2();
		obj.m3();


	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Method from I2");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Method from I1");
	}

}
