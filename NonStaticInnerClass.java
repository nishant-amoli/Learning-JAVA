package nestedClass;

class External
{
	int i;
	static int j=10;
	External()
	{
		i=5;
	}
	class Inner
	{
		int x;
		static final int y=99;
		Inner()
		{
			x=7;
		}
		void display()
		{
			System.out.print("This is Non-Static Inner Class\n");
			System.out.print("\nValue of x:"+x);
			System.out.print("\nValue of j:"+j);
			System.out.print("\nValue of i:"+i);
			System.out.print("\nValue of y:"+y);
		}		
	}
	void display()
	{
		System.out.print("\n\nThis is External Class\n");
		Inner obj=new Inner();
		System.out.print("Value of x:"+obj.x);
		System.out.print("\nValue of y:"+Inner.y);
	}
}

public class NonStaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of Non-Static Inner Class.\n@Nishant Amoli,B.Tech IT\n\n");
		External obj=new External();
		External.Inner ob=obj.new Inner();
		ob.display();
		obj.display();
	}

}
