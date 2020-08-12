package jun8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		try {
			int n = sc.nextInt();
		} catch (InputMismatchException e) // this is a unchecked/runtime exception
		{
			System.out.println("wow its a InputMismatchException");
		}
		System.out.println(" i wont be printed ");

	}

}
