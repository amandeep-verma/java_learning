package mar8;

class Sample
{
	void m1()
	{
		System.out.println("I am M1 method");
	}
	void sample()
	{
		System.out.println("I am a Sample method");
	}
	Sample()
	{
		System.out.println("I am constructor of Sample");
	}
}
class MainRunner1
{
	public static void main(String[] args)
	{
		Sample sa=new Sample();
		sa.m1();
		sa.sample();
	}
}
