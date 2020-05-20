package feb19;

import java.util.Scanner;
class CheckNum2
{
        public static void main(String[] args)
        {
                Scanner scn=new Scanner(System.in);
                System.out.println("Enter number to be checked");
		int n=scn.nextInt();
		if(n>=0)
		System.out.println(n+" is a +ve number");
		else
		System.out.println(n+" is a -ve number");
	}
}
