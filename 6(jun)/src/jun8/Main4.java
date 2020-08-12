package jun8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		try {
			int n=sc.nextInt();
			Thread.sleep(5000);
			System.out.println("enter your name");
			String name=sc.next();
			sc.close();
			System.out.println("enter your nick name");
			String nickname=sc.next();
			}
		catch(InputMismatchException e) // this is a unchecked/runtime exception
		{
			System.out.println("wow its a InputMismatchException");
		}
		catch(NullPointerException e)
		{
			System.out.println("wow its a NullPointerException");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		catch(IllegalStateException e)
		{
			System.out.println("its a IllegalStateException bcoz scanner is closed");
		}
		
	}
}
