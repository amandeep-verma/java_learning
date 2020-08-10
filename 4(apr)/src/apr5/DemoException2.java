package apr5;
import java.util.Scanner;
public class DemoException2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		
		if(age<18)
		{
			throw new ArithmeticException(); // you can throw user defined manual exception like this
		}
		
		System.out.println("eligible to vote ");
		System.out.println("thanku ... ");

	}
}
