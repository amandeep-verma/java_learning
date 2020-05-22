package mar2.hw;

class Book2
{
	public static void main(String[] args)
	{
		BookDetail b1=new BookDetail();
		b1.id="b1234";
		b1.pages=388;
		b1.name=" deapth of java";
		b1.knowledge();
	}
}
class BookDetail
{
	String id;
	double pages;
	String name;
	void knowledge()
	{
		System.out.println(id+" is id");
                System.out.println("pages are "+ pages);
                System.out.println("Name is "+ name);
        }
}
