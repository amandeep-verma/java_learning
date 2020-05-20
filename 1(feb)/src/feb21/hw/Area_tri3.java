package feb21.hw;

import java.util.Scanner;
class Area_tri3
{
	static double area(double a,double b)
	{
		return ((a*b)/2);
	}
	public static void main(String[] args)
	{
		double a=23.4,b=2.5;
		double ar=area(a,b);
		System.out.println("area is "+ar);
	}
}
