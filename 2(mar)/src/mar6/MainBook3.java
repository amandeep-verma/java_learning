package mar6;

// printing the variables without initializing them and later after initializing them.
class Book
{
	String name;
	double price;
}
class MainBook3
{
	public static void main(String[] args)
	{
		Book b1=new Book();
		System.out.println(b1.name);
		System.out.println(b1.price);
		b1.name="JAVA";
		b1.price=750;
		System.out.println(b1.name);
		System.out.println(b1.price);
	}
}

