package feb22;

import java.util.Scanner;
class Three2
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
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int big=bigger(x,y);
		big=bigger(z,big);
		System.out.println("Biggest is "+big);
	}
}

