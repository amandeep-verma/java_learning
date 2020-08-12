package jun9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=0;
		System.out.println("enter the name");
		String name=sc.next();

		try {
			sc=null;
			System.out.println("enter the id of the student");
			id=sc.nextInt();
			try {
				id=sc.nextInt();
			} catch (InputMismatchException e) 
			{
				System.out.println("entered wrong data");
			}
			System.out.println("existence");
		} 
		catch (NullPointerException e) 
		{
			System.out.println("Scanner object is not created");
			sc=new Scanner(System.in);
		}
		finally
		{
			System.out.println("i am finally block");
		}
		try {
			System.out.println("Its an end");
		} 
		catch (IllegalStateException e) {
			sc=new Scanner(System.in);
		}

		System.out.println("enter your percentage");
		sc=new Scanner(System.in);
		double d =sc.nextDouble();
		System.out.println("program is terminated");
	}
}

