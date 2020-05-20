package feb19.hw;

import java.util.Scanner;
class SimpleInterest
{
	public static void main(String[] args)
 	{
			Scanner sc=new Scanner(System.in);
	        System.out.println("enter principal amount");
			int p=sc.nextInt();
			System.out.println("enter time");
			int t=sc.nextInt();
			System.out.println("enter rate of interest");
			float r=sc.nextFloat();
			float S=(p*t*r)/100;
			System.out.println(S+" is the si");
	}
}
