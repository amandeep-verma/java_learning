package jun9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int i=0;
		char grade='\u0000';
		Scanner sc=new Scanner(System.in);
		System.out.println("id=");
		
		try {
			i=sc.nextInt();
		} catch (InputMismatchException e) {
			sc.nextLine();     // to move pointer from error line to next line
			System.out.println("entered wrong data, enter id");
			i=sc.nextInt();
		}
		sc=null;
		System.out.println("enter the grade of student");
		try {
			grade=sc.next().charAt(0);
		} catch (NullPointerException e) {
			System.out.println("object is set to null");
			sc=new Scanner(System.in);
			grade=sc.next().charAt(0);
		}
		System.out.println("are you eligible to vote");
		boolean status =sc.nextBoolean();
		sc.close();
		try {
			String name=sc.next();
		} catch (Exception e) {
			System.out.println("name cant be taken, but its a exception");
		}
		
		

	}

}
