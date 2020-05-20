package feb27;

import java.util.Scanner;

class Reverse2
{
	static int getReverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int x=sc.nextInt();
		int r=getReverse(x);
		System.out.println("rev is "+r);
	}
}
