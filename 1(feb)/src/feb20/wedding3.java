package feb20;

import java.util.Scanner;
class wedding3
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your no.");
		int no=sc.nextInt();
		if((no%5==0)&&(no%3==0))
		System.out.println("S WEDS G");
		else if(no%5==0)
		System.out.println("g");
		else if(no%3==0)
		System.out.println("s");
		else
		System.out.println("");
	}
}
