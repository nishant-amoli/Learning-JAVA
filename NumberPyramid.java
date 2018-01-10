import java.io.*;
public class NumberPyramid {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Demonstrate loops and make a pyramid of numbers till nth line\n");
		System.out.print("Enter nth line \n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}

	}

}
