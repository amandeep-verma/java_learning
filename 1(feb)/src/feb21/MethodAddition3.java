package feb21;

import java.util.Scanner;
class MethodAddition3
{
	static int abc(int a,int b)
	{
		return a+b;
	}
	static void abc1(int a1,int b1)
	{
		System.out.println("addition2 is"+(a1+b1));
	}
	public static void main(String[] args)
	{
		int x=20,y=98;
		abc1(x,y);
		int sum=abc(x,y);
		System.out.println("addition is "+sum);
	}
}
