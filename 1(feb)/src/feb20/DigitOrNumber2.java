package feb20;

import java.util.Scanner;
class DigitOrNumber2
{
        public static void main(String[] args)
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("enter the number");
		int n=sc.nextInt();
		if ((n>-10)&&(n<10))
		System.out.println("its a digit");
		else
                System.out.println("its a number");
	}
}
