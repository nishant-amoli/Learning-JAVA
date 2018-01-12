
 class A
{  
	int i;
	A(int x)
	{
		i=x;
	}
	void show()
	{
	
		System.out.println("A class version of i="+i);
	}
}
class B extends A
{
	int i;
	B(int a,int b)
	{
		super(a);//Constructor of Class A is invoked.
		i=b;
	}
	 void show()
		{
			super.show();//Member Method having same name in Parent Class is called.
			System.out.println("B class version of i="+i);
		}
}

public class SuperDemo
{
	public static void main(String a[])
	{
		System.out.println("Demonstration of Super Keyword in JAVA.\n");
		B obB=new B(6,9);
		obB.show();
	}
}

