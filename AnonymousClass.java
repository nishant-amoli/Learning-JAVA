package nestedClass;
abstract class Parent
{
	int x;
	static int y=7;
	Parent()
	{
		x=5;
	}
	abstract void display();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of Anonymous Class.\n@Nishant Amoli,B.Tech IT\n\n");

		Parent obj=new Parent()
				{
			void display()
			{
				System.out.print("This is anonymous class");
				System.out.print("\nValue of x: "+x+"\nValue of y: "+y);
			}			
				};
		obj.display();

	}

}
