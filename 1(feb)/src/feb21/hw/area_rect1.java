package feb21.hw;

import java.util.Scanner;
class area_rect1
{
	static void area(int a,int b)
	{
		System.out.println("Area is "+(a*b));
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int len=sc.nextInt();
		System.out.println("enter breadth");
		int bre=sc.nextInt();
		area(len,bre);
	}
}
