package nestedClass;
class Outer
{
	int i;
	static int j=30;
	Outer()
	{
		i=20;
	}
	static class Inner
	{
		static int x;
		int y;
		Inner()
		{
			x=55;	
			y=17;
		}
		void display()
		{
			System.out.print("This is Static Inner Class\n");
			System.out.print("\nValue of x:"+x);
			System.out.print("\nValue of j:"+j);
			Outer obj=new Outer();
			System.out.print("\nValue of i:"+obj.i);
		}
	}
	void display()
	{
		System.out.print("\n\nThis is Outer Class\n");
		System.out.print("Value of x:"+Inner.x);
		Inner ob=new Inner();
		System.out.print("\nValue of y:"+ob.y);
	}
}
public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of Static Inner Class.\n@Nishant Amoli,B.Tech IT\n\n");
		Outer.Inner obj=new Outer.Inner();
		Outer ob=new Outer();
		obj.display();
		ob.display();
	}

}
