package mar6;

class MainSample5
{
	int x=5;
	void dispx()
	{
		System.out.println("i am dispx");
	}
	
	static int y=500;
	static void disp()
	{
		System.out.println("I am display  method");
	}
	public static void main(String[] args)
	{
		// System.out.println(x); // throws error
		//dispx(); // throws error
		
		System.out.println(y);
		disp();
		
	}
}

