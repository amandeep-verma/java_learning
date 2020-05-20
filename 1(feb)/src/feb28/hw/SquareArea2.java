package feb28.hw;

import java.util.Scanner;
class SquareArea2
{
        static double area(int r)
        {
                System.out.println("interger side is "+r);
                return r*r;
        }

        static double area(float r)
        {
                 System.out.println("float side is "+r);
                 return r*r;
        }

        static double area(double r)
        {
                 System.out.println("double side is "+r);
                 return r*r;
        }

        public static void main(String[] args)
        {
                System.out.println("Main method started");
                System.out.println(area(8.5));
                System.out.println(area(6));
                System.out.println(area(2.2f));
        }
}

