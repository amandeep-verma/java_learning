package jun5;

public class mainMethod {
	
	static
	{
		System.out.println("this is static block of main method");
	}
	{
		System.out.println("this is nonstatic block of main method");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		vehicle c=new Car();
		

	}

}
