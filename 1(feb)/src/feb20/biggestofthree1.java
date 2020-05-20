package feb20;

import java.util.Scanner;
class biggestofthree1
{
        public static void main(String[] args)
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("enter your 1st no.");
                int no1=sc.nextInt();
                System.out.println("enter your 2nd no.");
                int no2=sc.nextInt();
                System.out.println("enter your 3rd no.");
                int no3=sc.nextInt();
		if((no2>no1)&&(no2>no3))
		System.out.println(no2+" is greatest");
		else if(no1>no3)
		System.out.println(no1+" is greatest");
		else
		System.out.println(no3+" is greatest");
	}
}
