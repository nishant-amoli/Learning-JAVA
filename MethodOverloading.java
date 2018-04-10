package practice;
import java.util.*;
class Shapes
{
	//Area of Circle.
	float area(float radius)
	{
		return (float)(Math.PI*radius*radius);
	}
	//Area of Triangle.
	float area(float base,float height)
	{
		return (float) (0.5*base*height);
	}
	//Area of Square.
	double area(double side)
	{
		return side*side;
	}
	//Area of Rectangle.
	double area(double length,double width)
	{
		return length*width;
	}
	void message()
	{
		System.out.print("\nCalls to the overloaded methods of Shape will be resolved in Compile time.\n");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of Method Overloading in JAVA.\n@Nishant Amoli,B.Tech IT\n");
		Shapes obj=new Shapes();
		obj.message();
		System.out.print("\nArea of Circle: "+obj.area(5));
		System.out.print("\nArea of Square: "+obj.area(10));
		System.out.print("\nArea of Triangle: "+obj.area(15,9));
		System.out.print("\nArea of Rectangle: "+obj.area(25,20));
	}

}
