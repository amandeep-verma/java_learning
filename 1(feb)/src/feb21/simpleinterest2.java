package feb21;

import java.util.Scanner;
class simpleinterest2
{
	static double getSi(int pr,double in,double ti)
	{
		double si=(pr*in*ti)/100;
		return si;
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal amount");
		int p=sc.nextInt();
		System.out.println("Enter rate of interest");
		double r=sc.nextDouble();
		System.out.println("Enter time");
	    double t=sc.nextDouble();
		double sim=getSi(p,r,t);
		System.out.println("si is "+sim);
	}
}
