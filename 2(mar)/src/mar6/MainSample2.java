package mar6;
// printing the object itself- by default prints the PackageName.ClassName@address of the object.
// printing the object without referring it to a reference. (new ClassName()). - prints null(default values)
class MainSample2
{
	public static void main(String[] args)
	{
		Simple S1=new Simple();
		System.out.println(S1);
		System.out.println(new Simple());
		S1.x=25;
		new Simple().x=45;
		System.out.println(new Simple().x);
		new Simple().display();
		S1.display();
	}
}
