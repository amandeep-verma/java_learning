package feb19.hw;

import java.util.Scanner;
class EmployeeInfo
{
        public static void main(String[] args)
        {
	        Scanner scn=new Scanner(System.in);
	        System.out.println("Enter name of employee");
			String name=scn.next();
			System.out.println("Enter id");
			String id=scn.next();
			System.out.println("Enter salary");
			double sal=scn.nextDouble();
			System.out.println(name+" of id "+id+" gets salary of "+sal);
		}
}
