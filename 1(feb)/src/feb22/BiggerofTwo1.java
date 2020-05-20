package feb22;

import java.util.Scanner;
class BiggerofTwo1
{
	static void bigger(int a,int b)
	{
		if(a>b)
			System.out.println("greater is "+a);
		else
			System.out.println("greater is "+b);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		bigger(x,y);
	}
}
