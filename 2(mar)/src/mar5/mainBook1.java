package mar5;
// changing the already initialized variable value by using object reference and printing it.
class mainBook1
{
	public static void main(String[] args)
	{
		Book b1=new Book();
		System.out.println(b1.name);
		b1.display();
		b1.read();
		System.out.println("changes made");
		b1.price=350;
		b1.display();
		b1.read();
		System.out.println(b1.price+" is new price");
	}
}
class Book
{
	String name="JAVA";
	int np=150;
	double price=250.55;
	void display()
	{
		System.out.println("Book name is "+name);
		System.out.println("Price is "+price);
		System.out.println("no. of pages are "+np);
	}
	void read()
	{
		System.out.println(name+" book is of "+price);
	}	
}
