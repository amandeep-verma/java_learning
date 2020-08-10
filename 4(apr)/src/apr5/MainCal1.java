package apr5;
import java.util.Scanner;
public class MainCal1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st value");
		String val1=sc.next();  // numbers are being scanned as String
		System.out.println("enter 2nd value");
		String val2=sc.next();
		System.out.println("String concat is "+ (val1+val2)); //concatenation of strings
		try
		{
			int a=Integer.parseInt(val1); //converts string to integer 
			int b=Integer.parseInt(val2); // here Integer is static class as we are calling parseInt method with classname
			System.out.println("quotent is "+(a/b));
//			System.exit(0);
//			If the above one is invoked the program wont run after that, infact final block wont be executed
		}
		catch(ArithmeticException e)
		{
			System.out.println("second value should be non zero");
			System.out.println(e.getMessage());
			main(args); // main method is being called again
			System.exit(0); // exits the program
		}
		catch(NumberFormatException ne) // it occurs when number passed to Integer.parseInt aren't in form of integer
		{
			//System.exit(0); // exists the program
			System.out.println(ne);
			//System.out.println(ne.getMessage());
			main(args);
			
		}
		catch(Exception e) // for all the remaining exceptions 
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("i am final block");
			//System.exit(0); 
			
			// if u remove this, final block and "thank you" will be printed the number of times which is number
			// you make the mistake and hence main method is called equal number of times in it.
			 
			// but if you keep it "thank you" will never be printed
		}
		System.out.println("Thank You");
	}
}
