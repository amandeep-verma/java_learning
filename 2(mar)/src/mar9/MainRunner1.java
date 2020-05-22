package mar9;

class Simple
{
	int a=20;
	int x=400;
	void display()
	{
		int a=45;
		System.out.println("value of a in this method is "+a); // here simple a starts referring to a in the present method
		System.out.println("value of x is "+x);
		System.out.println("value of a out of this method is "+this.a); // this.a refers to a in the present class out of the method
	}
}
class MainRunner1
{
	int y=40;
	public static void main(String[] args)
	{
		Simple s1=new Simple();
		s1.display();
	}
}
