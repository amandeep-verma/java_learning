package mar6;
class Demo
{
	static int x=300;
	int y=200;
	static void display()
	{
		System.out.println("x value is "+x);
		Demo d1=new Demo(); //see here , we need to have object reference to call non static member in static method
		System.out.println("y value is "+d1.y);
	}
	void print()
	{
		System.out.println(x);
		System.out.println(y);
	}
}

class MainRunner6
{
	public static void main(String[] args)
	{
		System.out.println(Demo.x);
		Demo.display();
		Demo D1=new Demo();
		System.out.println(D1.y);
		D1.print();
		Demo D2=new Demo();
		System.out.println(D2.y);
		D2.print();
	}
}
