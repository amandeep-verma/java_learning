package feb22.hw;

import java.util.Scanner;
class SmallestofFour3
{
	static int smaller(int x,int y)
	{
		if(x<y)
			return x;
		else
			return y;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the 4 numbers");
		int w=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int r=smaller(smaller(w,x),smaller(y,z));
		System.out.println(r+" is smaller");
	}
}
