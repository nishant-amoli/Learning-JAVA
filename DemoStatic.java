class StaticUse
{
static int a,b;
        static void show()
        {
        	System.out.println("Demonstration of Static Variables,Method And Block");
        	System.out.println("a="+a+"\nb="+b);
        }
        static
        {
        	System.out.println("Static Block is executed");
        }
}
public class DemoStatic 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StaticUse obj=new StaticUse();
		obj.a=30;
		StaticUse.b=20;
		StaticUse.show();
		}
	}
	


