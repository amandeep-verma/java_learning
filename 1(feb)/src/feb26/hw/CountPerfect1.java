package feb26.hw;

import java.util.Scanner;

public class CountPerfect1 
{

	static boolean count(int n)
	{
		int a=1,sum=0;;
		while(a<=n/2)
		{
			if(n%a==0)
			{
				sum=sum+a;
			}
			a++;
		}
		return n==sum;

	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no ");
		int x=sc.nextInt();
		int count=0;
		for(int i=1;i<x;i++)
		{
			boolean rs=count(i);
			if(rs)
				count++;
		}
		System.out.println(count+" is total numbers");
	}
}
