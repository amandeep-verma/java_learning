package mar27;
import java.util.Scanner;
public class ShapeRunner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Circle , 2. Square , 3. Rectangle");
		int n=sc.nextInt();
		Shape1 sh=null;
		switch(n)
		{
			case 1: sh=new Circle1(3.5);
			break;
			case 2: sh=new Square1(5.3);
			break;
			case 3: sh=new Rectangle1(4,6);
			break;
			default: System.out.println("enter the right number  ");
			return;
		}
		Shape1.hello(); // we can only call non abstract method in interface by class name 
		if(sh instanceof Circle1)
		{
			System.out.println("circle:");
			Circle1 C=(Circle1)sh;
			System.out.println("radius is "+C.r);
		}
		else if(sh instanceof  Square1)
		{
			System.out.println("Square");
			Square1 s=(Square1)sh;
			System.out.println("side is "+s.s);
		}
		else
		{
			System.out.println("Rectangle");
			Rectangle1 R=(Rectangle1)sh;
			System.out.println("lenght "+R.l+" & breadth "+R.b);
		}
		System.out.println("Area is "+sh.getArea());
		
		
		
	}

}
