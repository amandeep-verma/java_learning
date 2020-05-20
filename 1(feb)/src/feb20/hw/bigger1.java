package feb20.hw;

import java.util.Scanner;
class bigger1
{
        public static void main(String[] args)
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("enter your 1st no.");
                int no1=sc.nextInt();
                System.out.println("enter your 2nd no.");
                int no2=sc.nextInt();
	            if(no2>no1)
	            	System.out.println(no2+"is greater");
	            else
	            	System.out.println(no1+"is greater");
        }
}
