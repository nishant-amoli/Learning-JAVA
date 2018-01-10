import java.io.*;
public class SumOfSeries {
	public static void main(String arg[]) throws IOException
	{
		System.out.println("Demonstrate loops and find out the sum of following series till nth term\n");
		System.out.println("pow(x,3)/3!+pow(x,5)/5!+pow(x,7)/7!+....\n");
		double sum=0;
		int x,pow=3,i,n;
		System.out.println("Enter the nth term");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter x");
		x=Integer.parseInt(br.readLine());
		for(i=0;i<n;i++)
		{
			sum=sum+power(x,pow)/fact(pow);
			pow+=2;
		}
			
		System.out.println("The Sum of the series till "+n+"th term : \n"+sum );
		
	}
	static double power(int x,int pow)
	{
		return Math.pow(x,pow);
	}
	static int fact(int pow)
	{
		int factorial=1;
		for(int i=pow;i>0;i--)
			factorial=i*factorial;
		return factorial;
	}

}
