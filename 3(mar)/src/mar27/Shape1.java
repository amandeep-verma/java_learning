package mar27;

public interface Shape1 {
	public  int a=5;
	double getArea();
	
	// from java8 you can define non abstract method in interface but you can't call it by object reference
	// and you can't use the method 
	public static void hello() 
	{
		System.out.println("i am static method in interface ");
	}
}