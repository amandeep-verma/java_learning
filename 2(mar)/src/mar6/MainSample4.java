package mar6;
// When class members are prefixed with word static, they can accessed using classname - ClassName.variable
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
