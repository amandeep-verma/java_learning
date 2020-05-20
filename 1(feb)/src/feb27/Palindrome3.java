package feb27;

import java.util.Scanner;
class Palindrome3
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
	static boolean isPalin(int a)
	{
		int b=getReverse(a);
		return b==a;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no ");
		int x=sc.nextInt();
		boolean rs=isPalin(x);
		if(rs)
		System.out.println(x+" is palindrome");
		else
		System.out.println(x+" is not palindrome");

	}
}
