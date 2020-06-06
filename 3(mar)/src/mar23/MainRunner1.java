package mar23;

public class MainRunner1 {
	public static void main(String[] args)
	{
//		Shape s= new Shape(); // abstract class , can't be initiated 
		Shape1 sh=new Circle1("red",4);
		System.out.println(sh.getArea()+" "+sh.getColor());
	}

}
