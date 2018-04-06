class Book
{
	private String name,author,publication; 
	private int page_no;
	private float price;
	//Default Constructor.
	Book()
	{
		name=" ";
		author=" ";
		publication=" ";
		price=0;
		page_no=0;
		
	}
	//Parameterized Constructor.
	Book(String Name,String Author,String Publication,int Page_no,float Price)
	{
		name=Name;
		author=Author;
		publication=Publication;
		page_no=Page_no;
		price=Price;
	}
	//Copy Constructor.
	Book(Book obj)
	{
		this.name=obj.name;
		this.author=obj.author;
		this.publication=obj.publication;
		this.price=obj.price;
		this.page_no=obj.page_no;
	}
	
	void display()
	{
		System.out.print("\nBook: "+name);
		System.out.print("\nAuthor: "+author);
		System.out.print("\nPublication: "+publication);
		System.out.print("\nCost: Rs."+price);
		System.out.print("\nPages: "+page_no);
	}
	
}

public class Constructors {
public static void main(String args[])
{
	System.out.println("Demonstration of Constructors in JAVA.\n@Nishant Amoli,B.Tech IT\n");
	Book obj1=new Book();//Default Constructor Invoked.
	System.out.print("Printing the default values:");
	obj1.display();	
	System.out.print("\n\nPrinting the values passed to Parameterized Constructor:");
	//Parameterized Constructor Invoked.
	Book obj=new Book("The Art Of Peace","Morihei Ueshiba","Shambhala",67,560);
	obj.display();
	//Copy Constructor Invoked.
	Book obj2=new Book(obj);	
	System.out.print("\n\nPrinting the values of object initialized using Copy Constructor:");
	obj2.display();
}
}
