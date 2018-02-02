package practice;
import java.util.*;
enum color{
	Red,Green,Blue,White,Black,Yellow,colorless;
}

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of User Defined Data type (Enumeration).\n@Nishant Amoli,B.Tech IT\n\n");
		color c1=color.colorless;
		color[] arr=color.values();
		System.out.print("Values of color:\n");
		for(color i:arr)
			System.out.print(i+" ");
		System.out.print("\nEnter your value:\n");
		try{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		c1=color.valueOf(s);
		}catch(Exception e){};
		//System.out.print(c1);
		switch(c1)
		{
		case Red:System.out.print("Rosses are red");break;
		case Green:System.out.print("Grass is green");break;
		case Blue:System.out.print("Sky is blue");break;
		case White:System.out.print("Tulips are white");break;
		case Black:System.out.print("Silhouette is black");break;
		case Yellow:System.out.print("Sun is yellow");break;
		case colorless:System.out.print("Nothing is colorless");break;
		}

	}

}
