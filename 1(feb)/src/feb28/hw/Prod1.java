package feb28.hw;
import java.util.Scanner;
class Prod1
{
        static int mul(int a,int b)
        {
                System.out.println("2 number");
                return a*b;
	}
        static int mul(int x,int y,int z)
        {
                System.out.println("3 number");
                return x*y*z;
        }


        public static void main(String[] args)
        {
                System.out.println("Method Overloading");
                int s1=mul(2,3);
                System.out.println(s1);
                
                int s2=mul(5,6,7);
                System.out.println(s2);
        }
}
  
