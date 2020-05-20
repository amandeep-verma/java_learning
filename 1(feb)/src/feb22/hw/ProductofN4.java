package feb22.hw;

import java.util.Scanner;
class ProductofN4
{
	static int prod(int a)
	{
		int mul=1;
		while(a>0)
		{
			mul=mul*a;
			a--;
		}
		return mul;
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number upto which you want product");
		int x=sc.nextInt();
		int total=prod(x);
		System.out.println("prod is "+total);
	}
}

