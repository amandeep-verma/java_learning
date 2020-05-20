package feb27;

import java.util.Scanner;
class mPowerP5
{
	static int Pow(int n,int y)
	{
		int pw=1;
		while(y!=0)
		{
			pw=n*pw;
			y--;
		}
		return pw;
	}



	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x");
		int x=sc.nextInt();
		System.out.println("enter p");
		int p=sc.nextInt(); 
		int po= Pow(x,p);
		System.out.println(x+"to the power"+p+" is "+ po);
	}
}

