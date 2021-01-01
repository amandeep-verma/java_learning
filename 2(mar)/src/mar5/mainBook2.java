package mar5;

// making 2 objects of the class Book, keeping one to the default initialization and changing the another. 
// Later printing them both
class mainBook2
{ 
	public static void main(String[] args)
	{
		Book b1=new Book();
		Book b2=new Book();
		b1.name="C++";
		b1.np=220;
		b1.price=99.99;
		b1.display();
		b2.display();
	}
}


