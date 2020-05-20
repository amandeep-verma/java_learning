package feb21.hw;

import java.util.Scanner;
class Method_Arith2
{
	static void cal(int a,int b)
	{
		System.out.println("addition is "+(a+b));
		System.out.println("sub is "+(a-b));
		System.out.println("mul is "+(a*b));
		System.out.println("divi is "+(a/b));
	}
	public static void main(String[] args)
	{
		int a=15,b=3;
		cal(a,b);
	}
}
