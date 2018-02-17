package nestedClass;
class Outside
{
	int i;
	static int j=9;
	Outside()
	{
		i=7;
	}
	void display()
	{
		class inner
		{
			int x;
			static final int y=77;
			inner()
			{
				x=66;
			}
			void print()
			{
				System.out.print("This is Local Class\n");
				System.out.print("\nValue of x:"+x);
				System.out.print("\nValue of j:"+j);
				System.out.print("\nValue of i:"+i);
				System.out.print("\nValue of y:"+y);
			}			
		}
		inner obj=new inner();
		obj.print();
	}
	
}
public class LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of Local Class.\n@Nishant Amoli,B.Tech IT\n\n");

		Outside obj=new Outside();
		obj.display();

	}

}
