package feb27.hw;

import java.util.Scanner;
class DESerium2
{


	static boolean Check(int n)
	{
		int m=SofP(n);
		return m==n;
	}

	static int SofP(int a)
	{
		int SOP=0;
		int b=0;
		int c=a;
		int n=NoofDigits(a);
		while(c!=0)
		{
			b=c%10;
			SOP=SOP+pow(b,n);
			c=c/10;
			n--;
		}
		return SOP;
	}
	static int pow(int a,int b)
	{
		int prod=1;
		while(b!=0)
		{
			prod=prod*a;
			b--;
		}
		return prod;
	}


	static int NoofDigits(int  b)
	{
		int n=0;
		int a=b;
		while(a!=0)
		{
			n=n+1;
			a=a/10;
		}
		return n;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		boolean s=Check(n);
		if (s)
			System.out.println(n+" is DE no.");
		else
			System.out.println(n+" is not a DE no.");

	}
}

