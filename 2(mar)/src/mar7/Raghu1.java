package mar7;
// having the static and non static variables in class containing  main method and printing them.
class Sample
{
	int a;
	static int b;
	void m1()
	{
		int x=20;
		System.out.println(x);
	}
	static void m2()
	{
		System.out.println("m2 method");
		System.out.println("b value is "+b);
	}
}
class Raghu1
{
	int z=30;
	static int y=45;
	public static void main(String[] args)
        {
		System.out.println(y);
		Raghu1 r=new Raghu1();
		System.out.println(r.z);
		
		
		Sample.m2();
		System.out.println(Sample.b);
		
		Sample S1=new Sample();
		System.out.println(S1.a);
		S1.m1();
	}
}
