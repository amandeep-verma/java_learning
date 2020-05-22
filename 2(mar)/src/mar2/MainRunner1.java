package mar2;

class MainRunner1
{
	public static void main(String[] args)
	{
		Pen P1=new Pen();
		System.out.println(P1.color);
		System.out.println(P1.price);
		System.out.println(P1.cname);
		System.out.println("-------------");
		P1.writing();
		System.out.println("main method end");
	}
}
class Pen
{
	String color;
	double price;
	String cname;
	void writing()
	{
		System.out.println(color+" color pen is writing");
		System.out.println("company name is "+cname);
		System.out.println("Price is "+ price);
	}
}
