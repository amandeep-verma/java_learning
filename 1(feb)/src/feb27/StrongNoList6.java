package feb27;

import java.util.Scanner;

class StrongNoList6
{
	static boolean isStrong(int n)
	{
		int t=n;
		int sum=0;
		while(n!=0)
		{
			int r=n%10;
			sum= sum +fact(r);
			n=n/10;
		}
		return sum==t;
	}

	static int fact(int a)
	{
		int prod=1;
		while(a!=0)
		{
			prod=a*prod;
			a=a-1;
		}
		return prod;
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. upto which u want strong number");

		int x=sc.nextInt();
		for(int i=1;i<=x;i++)
		{
			boolean a=isStrong(i);
			if (a)
				System.out.println(i+" is strong");
		}}
}

