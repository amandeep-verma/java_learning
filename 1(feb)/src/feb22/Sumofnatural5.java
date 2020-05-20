package feb22;

import java.util.Scanner;
class Sumofnatural5
{
	static int sum(int a)
	{
		int n=1,add=0;
		while(n<=a)
		{
			add=add+n;
			n++;
		}
		return add;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number upto which you want sum");
		int x=sc.nextInt();
		int total=sum(x);
		System.out.println("sum is "+total);
	}
}
