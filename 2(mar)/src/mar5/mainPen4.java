package mar5;
import java.util.Scanner;
class Pen
{
	double price;
	String color;
	void writing()
	{
		System.out.println(color+" color pen is writing");
	}
}	
class mainPen4
{
	public static void main(String[] args)
	{
		Pen p1=new Pen();
		p1.writing();
		p1.color="red";
		p1.writing();
		p1.color="blue";
		p1.writing();
		System.out.println(p1.price+"is the price");
	}
}
