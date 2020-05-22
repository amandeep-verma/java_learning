package mar5;

import java.util.Scanner;
class Customer
{
	int id;
	String name;
}
class mainDemo7
{
	static void display(int n)
	{
		System.out.println("your integer is "+n);
	}
	static void display(String st)
	{
		System.out.println("your string is- "+st);
	}
	static void display(Customer C)
	{
	        System.out.println("this is c- "+C);
	        System.out.println(C.id);
	        System.out.println(C.name);
	}
	public static void main(String[] args)
        {
		System.out.println("disnplay(\"123\")");
		display("123");
		System.out.println("-------------------");
		System.out.println("display(2)");
		display(2);
		System.out.println("-------------------");
		Customer c1=new Customer();
		System.out.println("display(c1)");
		display(c1);
		System.out.println("-------------------");
		Customer c2=new Customer();
		c2.name="Ravi";
		c2.id=125;
		System.out.println("display(c2)");
		display(c2);
	}
}
