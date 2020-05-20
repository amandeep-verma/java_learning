package feb22.hw;

import java.util.Scanner;
class Smallestoftwo1
{
	static boolean smaller(int x,int y)
	{
		return x<y;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean rc=smaller(a,b);
		if(rc)
			System.out.println(a+" is smaller");
		else
			System.out.println(b+" is smaller");
	}
}
