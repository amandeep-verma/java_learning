package feb28.hw;

import java.util.Scanner;
class Substract3
{
        static int subs(int a,int b)
        {
                System.out.println("int  number");
                return a-b;
        }
        static double subs(double a,double b)
        {
                System.out.println("float number");
                return a-b;
        }

        public static void main(String[] args)
        {
                System.out.println("--Method Overloading--");
                int s1=subs(2,3);
		System.out.println(s1);
                double s2=subs(5.7,2.2);
                System.out.println(s2);
        }
}

