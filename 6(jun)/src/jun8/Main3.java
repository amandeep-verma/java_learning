package jun8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		//Thread.sleep(5000); // this is a checked =compile time exception
		//Thread is a class having sleep method which makes 
		//the program to sleep for the number of milliseconds passed to it 
		try {
			int n=sc.nextInt();
	
			System.out.println("enter your name");
			String name=sc.next();
		}
		catch(InputMismatchException e) {
			System.out.println("wah");
			
		}

	}

}
