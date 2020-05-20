package feb27;

import java.util.Scanner;

class AddDigits1
{
	static int SumofDigit(int a)
	{
		int sum=0;
		while(a!=0)
		{
			int r=a%10;
			sum= sum +r;
			a=a/10;
		}
		return sum;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
		int n=sc.nextInt();
		int s=SumofDigit(n);
		System.out.println("sum of digits is "+s);
	}
} 
