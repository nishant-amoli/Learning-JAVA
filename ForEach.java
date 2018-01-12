
public class ForEach
{

	public static void main(String[] args)
	{
		System.out.println("Demonstration of For Each Statement");
        
		int num[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int x : num)  {
		System.out.println("Value : " +x);
		sum += x;
		}
		System.out.println(" sum " +sum);
		}
	}