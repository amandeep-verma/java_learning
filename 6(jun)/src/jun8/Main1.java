package jun8;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner sc = null;
		System.out.println("enter the value of n");
		try {
			int n=sc.nextInt();
		}
		catch(NullPointerException e)  // this is a unchecked/runtime exception
		{
			System.out.println("cde"); 
		}
		System.out.println(" i wont be printed ");

	}

}
