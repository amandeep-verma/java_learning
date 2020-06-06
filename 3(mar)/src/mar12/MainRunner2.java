package mar12;

public class MainRunner2 {
	public static void main(String[] args)
	{
		Sample2 S1=new Sample2();
		System.out.println(S1.x);
		System.out.println(S1.y);
		System.out.println("----------------");
		Simple2 si1=new Sample2();
		System.out.println(si1.x);
		System.out.println(si1.y);
		si1.display();
		S1.print();
	}
}
