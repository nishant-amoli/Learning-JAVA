package testExceptions;
import java.util.*;
interface Calculate
{
	public float area();
	public float parameter();
	default void print()
	{
		System.out.print("\nEven Interfaces can have composite methods but only public static or default.\n");
	}
}
interface Shape extends Calculate
{	
	public int noOfEdges();
	public static void message()
	{
		System.out.print("\nAll the abstract methods in Interface \"Shape\" will act as a blue print for classes that implements \"Shape\".\n");
	}
}
class Circle implements Shape
{
	float radius;
	Circle(float radius)
	{
		this.radius=radius;
	}
	@Override
	public float area()
	{
		return (float) (Math.PI*radius*radius);
	}
	@Override
	public float parameter()
	{
		return (float) (Math.PI*radius*2);
	}
	@Override
	public int noOfEdges()
	{
		return 0;
	}
}
class Square implements Shape
{
	float side;
	Square(float side)
	{
		this.side=side;
	}
	@Override
	public float area()
	{
		return side*side;
	}
	@Override
	public float parameter()
	{
		return 4*side;
	}
	@Override
	public int noOfEdges()
	{
		return 4;
	}
}
class Rectangle implements Shape
{
	float length,width;
	Rectangle(float length,float width)
	{
		this.length=length;
		this.width=width;
	}
	@Override
	public float area()
	{
		return length*width;
	}
	@Override
	public float parameter()
	{
		return 2*(length+width);
	}
	@Override
	public int noOfEdges()
	{
		return 4;
	}
}
class Triangle implements Shape
{
	float base,height,side1,side2;
	Triangle(float base,float height,float side1,float side2)
	{
		this.base=base;
		this.height=height;
		this.side1=side1;
		this.side2=side2;
	}
	@Override
	public float area()
	{
		return (float) (0.5*base*height);
	}
	@Override
	public float parameter()
	{
		return side1+side2+base;
	}
	@Override
	public int noOfEdges()
	{
		return 3;
	}
}

public class InterfacesJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of Interfaces in JAVA.\n@Nishant Amoli,B.Tech IT\n");

		Circle cr=new Circle(5);
		Square sq=new Square(5);
		Rectangle rc=new Rectangle(20,15);
		Triangle tri=new Triangle(25,15,20,20);
		cr.print();
		Shape.message();
		System.out.print("\nArea of Circle: "+cr.area());
		System.out.print("\nCircumference of Circle: "+cr.parameter());
		System.out.print("\nNo. of edges in a Circle: "+cr.noOfEdges());
		System.out.print("\n\nArea of Square: "+sq.area());
		System.out.print("\nParameter of Square: "+sq.parameter());
		System.out.print("\nNo. of edges in a Square: "+sq.noOfEdges());
		System.out.print("\n\nArea of Rectangle: "+rc.area());
		System.out.print("\nParameter of Rectangle: "+rc.parameter());
		System.out.print("\nNo. of edges in a Rectangle: "+rc.noOfEdges());
		System.out.print("\n\nArea of Triangle: "+tri.area());
		System.out.print("\nParameter of Triangle: "+tri.parameter());
		System.out.print("\nNo. of edges in a Triangle: "+tri.noOfEdges());

	}

}
