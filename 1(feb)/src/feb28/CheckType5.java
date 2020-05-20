package feb28;
import java.util.Scanner;
class CheckType5
{
	static void display(double d)
	{
		System.out.println("11");
		System.out.println("12");
	}
	static void display(int d)
	{
		System.out.println("21");
		System.out.println("22");
	}
	public static void main(String[] args)
	{
		System.out.println("display(3.5)");
		display(3.5);
		System.out.println("\ndisplay(3.8f)");
		display(3.8f);
		short s=35;
		System.out.println("\ndisplay(s)");
		display(s);
		System.out.println("\ndisplay(3567l)");
		display(3567l);
		System.out.println("\ndisplay('a')");
		display('a');
		byte b=12;
		System.out.println("\nbyte b=12");
		display(b);
	}
}		
