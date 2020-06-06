package hw;
import java.util.Scanner;
public class Behaviour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Female f1=null;
		System.out.println("/n1-children , 2- husband, 3- boyfriend");
		int ch=sc.nextInt();
		switch (ch)
		{
		case 1: f1=new children();
		break;
		case 2: f1=new husband();
		break;
		case 3: f1=new boyfriend();
		break;
		default: f1=new Female();
		}
		f1.mood();

	}

}
