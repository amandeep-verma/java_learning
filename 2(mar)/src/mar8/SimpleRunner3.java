package mar8;
class Simple
{
	Simple(double d)
	{
		System.out.println("It is a double type constructor");
	}
}
class SimpleRunner3
{
	public static void main(String[] args)
        {
		Simple s1=new Simple(23.56);
		Simple s2=new Simple(' '); // upcasting of char to double
		// Simple s3=new Simple("simple"); // error as string can't be casted in double type
		
	}
}
