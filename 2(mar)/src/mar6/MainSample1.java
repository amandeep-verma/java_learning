package mar6;
class Simple
{
	int x;
	void display()
	{
		System.out.println("x vaue is "+x);
	}
}
class MainSample1
{
	static void update(Simple s)
	{
		s.x=500;
	}
	static void change(int a)
	{
		a=200;
	}
	static void referred(Simple Si)
	{
		Si=new Simple();
		Si.x=1200;
	}
	public static void main(String[] args)
	{
		Simple S1=new Simple();
		S1.x=25;
		update(S1); // changes
		System.out.println("S1.x is   "+S1.x);
		change(S1.x); // no changes
		System.out.println("S1.x is   "+S1.x);
		referred(S1); // no changes
		System.out.println("S1.x is   "+S1.x);
	}

}

