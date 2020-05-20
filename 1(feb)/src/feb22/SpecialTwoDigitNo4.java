package feb22;

import java.util.Scanner;
class SpecialTwoDigitNo4
{
	static boolean special(int n)
	{
		if(n>9&&n<100)
		{
			int a=n/10;
			int b=n%10;
			int sum=a+b+a*b;
			return n==sum;
		}
		else
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		boolean rs=special(no);
		if(rs==true)
		System.out.println(no +" is special 2 digit");
		else
		System.out.println(no +" is not a special 2 digit");
	}
}
