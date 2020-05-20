package feb20.hw;

import java.util.Scanner;
class Couples4
{
        public static void main(String[] args)
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("enter your no.");
                int no=sc.nextInt();
                if((no%7==0)&&(no%3==0))
                System.out.println("murli WEDS meera");
                else if(no%3==0)
                System.out.println("murli");
                else if(no%7==0)
                System.out.println("meera");
                else
                System.out.println("");
        }
}
