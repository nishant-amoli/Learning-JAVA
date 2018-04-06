package testExceptions;
import java.io.*;
public class BasicExceptions {
	public static void main(String args[])throws IOException
	{
		int no=0;
		System.out.print("Demonstration of Exception Handling in JAVA.\n@Nishant Amoli,B.Tech IT");
		System.out.println("\nEnter a number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		no=Integer.parseInt(br.readLine());
		try
		{
			if(no>0)System.out.print("\nNumber accepted.");
			else
				throw new Exception("Number should not be negative");			
		}catch(Exception e){e.printStackTrace();}
		System.out.print("\n"+no);
	}
}
