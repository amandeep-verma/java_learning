package feb26;

import java.util.Scanner;
class TotalDigits2
{
	static void digitCheck(int y)
	{
		int a=0;
		do
		{
			y=y/10;
			a++;
		}while(y!=0);

		System.out.println(a+" are no of digits");
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no ");
		int x=sc.nextInt();
		digitCheck(x);
	}
}
