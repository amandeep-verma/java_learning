package mar6;

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
