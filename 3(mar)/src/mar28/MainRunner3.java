package mar28;
import java.util.Scanner;
public class MainRunner3 {
	static void vehicleType(Vehicle3 v)
	{
		if(v instanceof Car3)
		{
			Car3 c=(Car3)v;  //downcasting
			System.out.println("Type :Car");
			System.out.println("engine no. "+c.engno);
			System.out.println("no of wheels "+ c.noWheels);
		}
		if(v instanceof Bus3)
		{
			Bus3 b=(Bus3)v;  //downcasting
			System.out.println("Type :bus");
			System.out.println("engine no. "+b.engno);
			System.out.println("no of wheels "+ b.noWheels);
		}
		if(v instanceof Bike3)
		{
			Bike3 bi=(Bike3)v;  //downcasting
			System.out.println("Type :Bike");
			System.out.println("engine no. "+bi.engno);
			System.out.println("no of wheels "+ bi.noWheels);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.car 2.bus 3.bike");
		int key=sc.nextInt();
		Vehicle3 v=null;
		switch(key)
		{
		case 1: v=new Car3(); //upcasting
			break;
		case 2: v=new Bus3(); //upcasting
			break;
		case 3: v=new Bike3(); //upcasting
			break;
		default:
			break;
		}
		vehicleType(v);
	}
}
