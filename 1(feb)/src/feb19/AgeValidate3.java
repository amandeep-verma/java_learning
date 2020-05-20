package feb19;

import java.util.Scanner;
class AgeValidate3
{	
        public static void main(String[] args)
        {
                Scanner scn=new Scanner(System.in);
                System.out.println("Enter your age");
		int age=scn.nextInt();
		if(age>=18)
		System.out.println("eligible to vote");
		else
		System.out.println("not eligible to vote");
	}
}
