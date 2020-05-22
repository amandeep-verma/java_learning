package mar8.hw;
class Book
{
	String name;
	int id;
	int price;
	Book(String nm,int i,int p)
	{
		name=nm;
		id=i;
		price=p;
	}
	void display()
	{
		System.out.println("name is "+name);
		System.out.println("Id is "+id);
		System.out.println("price is "+price);
	}
}
class MainBook
{
	public static void main(String[] args)
	{
		Book b1=new Book("Uandme",123,500);
		Book b2=new Book("java",124,700);
		Book b3=new Book("C++",125,290);
		b1.display();
		b2.display();
		b3.display();
	}
}
