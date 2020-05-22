package mar5.hw;

import java.util.Scanner;
class mainPenRunner
{
	static void makingNotes(Pen x,Pen y,int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println("Q"+i+")");
			y.writing();
			System.out.println("Ans: ");
			x.writing();
			System.out.println("---------------");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Main Method started");
		Pen p1=new Pen();
		p1.color="blue";
		Pen p2=new Pen();
		p2.color="red";
		makingNotes(p1,p2,3);
	}
}
class Pen
{
	String color;
	double price;
	void writing()
	{
		System.out.println(color+" color pen is writing");
	}
}
