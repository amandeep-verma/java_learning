package feb26;

import java.util.Scanner;
class Prime3
{
	static boolean Check(int x)
	{
		
		if(x%2==0)
			return false;
		
		int a=3;		
		while(a<=x/2)
		{
			if(x%a==0)
			{
				return false;
			}
			a=a+2;
		}
		return true;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no ");
		int x=sc.nextInt();
		boolean rs=Check(x);
		if(rs)
			System.out.println(x+" is Prime");
		else
			System.out.println(x+" is not a Prime");
	}
}
