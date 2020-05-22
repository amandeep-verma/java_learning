package mar6;
class Samples
{
	static int x;
	static void display()
	{
		System.out.println("x vale is "+x);
	}
}
class MainSample4
{
	public static void main(String[] args)
	{
		System.out.println(Samples.x);
		Samples.x=500;
		System.out.println(Samples.x);
		Samples.display();
	}
}
