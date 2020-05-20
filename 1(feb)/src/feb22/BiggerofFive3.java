package feb22;

import java.util.Scanner;
class BiggerofFive3
{
	static int bigger(int a,int b)
	{
		if(a>b)
		return a;
		else
		return b;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int w=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int big=bigger(bigger(bigger(v,w),x),bigger(y,z));
		System.out.println("Biggest is "+big);
	}
}
