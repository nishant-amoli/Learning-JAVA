package practice;
import java.io.*;
import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print("\n Thread A is executing.\tID:"+ Thread.currentThread().getId()+"\tPriority:"+this.getPriority());
			if(i==3)
			{
				try
				{
					sleep(1000);
				} catch(Exception E){}
			}
			System.out.print("\n Thread A is executing.");
		}
		System.out.print("\n Thread A has executed completely.");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print("\n Thread B is executing.\tID:"+ Thread.currentThread().getId()+"\tPriority:"+this.getPriority());
			if(i==4)
				stop();
				
			
		}
		System.out.print("\n Thread B has executed completely.");
	}
}
class C extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.print("\n Thread C is executing.\tID:"+ Thread.currentThread().getId()+"\tPriority:"+this.getPriority());
			if(i==2)
				yield();
		}
		System.out.print("\n Thread C has executed completely.");
	}
}
public class MultiThreading {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.print("Demonstration of MultiThreading in JAVA.\n@Nishant Amoli,B.Tech IT\n");
		Scanner scan=new Scanner(System.in);
		System.out.print("\nSet the priority of Thread A in the scale of 1-10");
		int aprior=scan.nextInt();
		System.out.print("\nSet the priority of Thread B in the scale of 1-10");
		int bprior=scan.nextInt();
		System.out.print("\nSet the priority of Thread C in the scale of 1-10");
		int cprior=scan.nextInt();
		A th1=new A();
		B th2=new B();
		C th3=new C();
		th1.setPriority(aprior);
		th2.setPriority(bprior);
		th3.setPriority(cprior);
		th1.start();
		th2.start();
		th3.start();

	}

}
