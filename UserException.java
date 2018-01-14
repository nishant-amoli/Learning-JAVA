package testExceptions;
import java.util.*;
class MyException extends Exception
{
	int exp;
	MyException(int x)
	{
		exp=x;
	}
	public String toString()
	{
		return "You are not qualified yet!";
	}
}
public class UserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of User Defined Exception.\n@Nishant Amoli,B.Tech IT");
		System.out.print("\nEnter your experience in years.");
		Scanner scan=new Scanner(System.in);
		int exp=scan.nextInt();
		try
		{
			if(exp>=7) System.out.print("You are welcome to take 3rd Degree Black Belt Test.");
			else throw new MyException(exp);
		}catch(Exception e){System.out.print(e);}
	}

}
