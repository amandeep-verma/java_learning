package feb26.hw;
import java.util.Scanner;
class SumofSpecial4
{
        static boolean special(int n)
        {
                if(n>9&&n<100)
                {
                        int a=n/10;
                        int b=n%10;
                        int sum=a+b+a*b;
                        return n==sum;
                }
                else
                return false;
        }
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the no");
                int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
                {
                        boolean rs=special(i);
                        if(rs==true)
			sum=sum+i;
		}	
		System.out.println(sum+" is sum");
	}
}
