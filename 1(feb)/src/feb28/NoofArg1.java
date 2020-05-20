package feb28;

import java.util.Scanner;
class NoofArg1
{
	static int add(int a,int b)
	{
		System.out.println("2 number");
		return a+b;
	}
	static int add(int x,int y,int z)
	{
		System.out.println("3 number");
		return x+y+z;
	}

	public static void main(String[] args)
	{
		System.out.println("Method Overloading");
		int s1=add(2,3);
		int s2=add(5,6,7);
		System.out.println(s1);
		System.out.println(s2);
	}
} 
