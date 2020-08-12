package jun5;

public class Car extends vehicle{
	static String company;
	int power;
	static
	{
		System.out.println("this is first static block of CAR");
	}
	static
	{
		System.out.println("this is second static block of CAR");
	}
	{
		System.out.println("this is first nonstatic block of CAR");
	}
	{
		System.out.println("this is second nonstatic block of CAR");
	}
	Car(){
		System.out.println("constructor of sub class of CAR");
	}
}
