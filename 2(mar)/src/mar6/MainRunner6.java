package mar6;
/* Here we have both static and non static- variable and method. In order to access a non-static member in same class
   in static method we have to create its object first but not for static member. Also both static and non static 
   member can be accessed in the same class in non- static method without creating object.
*/
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
	}
}
