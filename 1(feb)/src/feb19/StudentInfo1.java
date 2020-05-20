package feb19;

import java.util.Scanner;
class StudentInfo1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=scn.next();
		System.out.println("Enter your age");
		int age=scn.nextInt();
		System.out.println("Enter your stream");
		String branch=scn.next();
		System.out.println("Enter your percentage");
		float per=scn.nextFloat();
		System.out.println(name+" of "+age+" age from "+branch+" have got "+per+"%");
		
	}
}
