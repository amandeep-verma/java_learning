package jun5;

public class vehicle {
	static String Fuel;
	int tyres;
	static
	{
		System.out.println("this is first static block");
	}
	static
	{
		System.out.println("this is second static block");
	}
	{
		System.out.println("this is first nonstatic block");
	}
	{
		System.out.println("this is second nonstatic block");
	}
	vehicle(){
		System.out.println("constructor of super class");
	}
	
}
