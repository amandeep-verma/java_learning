package feb26;

import java.util.Scanner;
class Perfect1
{
	static boolean checkPerfect(int n)
	{
		int a=1;
		int sum=0;
		while(a<=n/2)
		{
			if(n%a==0)
			{
				//System.out.println(a);
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
		for(int i=2;i<x;i++)
		{
			boolean rs=checkPerfect(i);
			if(rs)
				System.out.println(i+" ");
		}
	}

}
