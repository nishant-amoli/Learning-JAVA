package practice;

abstract class Shape
{
	abstract public float area();
	abstract public float parameter();
	abstract public int noOfEdges();
	void message()
	{
		System.out.print("\nCalls to the overridden methods of Shape will be resolved in Runtime.\n");
	}
}
class Circle extends Shape
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
class Square extends Shape
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
class Rectangle extends Shape
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
class Triangle extends Shape
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
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Demonstration of Runtime Polymorphism / Dynamic Method Dispatch in JAVA.\n@Nishant Amoli,B.Tech IT\n");
		//Reference of "Shape" created. 
		Shape obj;
		Circle cr=new Circle(5);
		Square sq=new Square(5);
		Rectangle rc=new Rectangle(20,15);
		Triangle tri=new Triangle(25,15,20,20);
		cr.message();
		//Circle's reference to Shape.
		obj=cr;
		System.out.print("\nArea of Circle: "+obj.area());
		System.out.print("\nCircumference of Circle: "+obj.parameter());
		System.out.print("\nNo. of edges in a Circle: "+obj.noOfEdges());
		//Square's reference to Shape.
		obj=sq;
		System.out.print("\n\nArea of Square: "+obj.area());
		System.out.print("\nParameter of Square: "+obj.parameter());
		System.out.print("\nNo. of edges in a Square: "+obj.noOfEdges());
		//Rectangle's reference to Shape.
		obj=rc;
		System.out.print("\n\nArea of Rectangle: "+obj.area());
		System.out.print("\nParameter of Rectangle: "+obj.parameter());
		System.out.print("\nNo. of edges in a Rectangle: "+obj.noOfEdges());
		//Triangle's reference to Shape.
		obj=tri;
		System.out.print("\n\nArea of Triangle: "+obj.area());
		System.out.print("\nParameter of Triangle: "+obj.parameter());
		System.out.print("\nNo. of edges in a Triangle: "+obj.noOfEdges());

	}

}
