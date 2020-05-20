package feb28;
import java.util.Scanner;
class RotateFan4
{
	static void rotate(int a)
	{
		System.out.println("fan is rotating at very slow speed");
	} 
        static void rotate(int a,int b) 
        {
                System.out.println("fan is rotating at slow speed");
        }
        static void rotate(int a,int b,int c) 
        {
                System.out.println("fan is rotating at medium speed");
        }
        static void rotate(int a,int b,int c,int d) 
        {
                System.out.println("fan is rotating at fast speed");
        }
        static void rotate(int a,int b,int c,int d,int e) 
        {
                System.out.println("fan is rotating at very fast speed");
        }
        public static void main(String[] args)
        {
		rotate(2);
                rotate(5,3);
                rotate(6,2,3);
                rotate(2,3,7,2);
                rotate(2,6,4,2,3);
		
	}
}
