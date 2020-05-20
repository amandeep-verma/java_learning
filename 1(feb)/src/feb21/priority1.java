package feb21;

import java.util.Scanner;
class priority1
{
        public static void main(String[] args)
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("\nSOP(5+6+\"and\"+5+6)== ");
                System.out.println(5+6+"and"+5+6);
                System.out.println("\nSOP(5+6+\"and\"+5*6)== ");
                System.out.println(5+6+"and"+5*6);
                System.out.println("\nSOP(5+6+\"and\"+(5+6)))== ");
                System.out.println(5+6+"and"+(5+6));
                System.out.println("\nSOP(5+6+\"and\"+(5*6))== ");
				System.out.println(5+6+"and"+(5*6));
				System.out.println("\nSOP(5+6+\"and\"(5-3))== ");
				System.out.println(5+6+"and"+(5-3));
				System.out.println("\nSOP(5-6+\"and\"+(5-3))");
				System.out.println(5-6+"and"+(5-3));  //the last part (5-3) has to be in brackets
        }
}
