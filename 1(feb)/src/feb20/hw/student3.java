package feb20.hw;

import java.util.Scanner;
class student3
{
        public static void main(String[] args)
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("enter marks of 1st sub");
                int marks1=sc.nextInt();
                System.out.println("enter marks of 2nd sub");
                int marks2=sc.nextInt();
                System.out.println("enter marks of 3rd sub");
                int marks3=sc.nextInt();
                System.out.println("enter marks of 4th sub");
                int marks4=sc.nextInt();
                int average=(marks1+marks2+marks3+marks4)/4;
                if((marks1>34)&&(marks2>34)&&(marks3>34)&&(marks4>34))
				{
					if(average>85)
					System.out.println("distniction");
					else if(average>60)
		                        System.out.println("1st class");
					else if(average>50)
		                        System.out.println("2nd class");
					else
						System.out.println("3rd class");
				}
				else
				{
					System.out.println("failed");
				}
		
        }
}
