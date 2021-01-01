package mar9;
// printing the local variable, later printing the instance variable using this keyword.
class Test
{ 
        int y=50;
        int x=45;
        void display(int x)
        {
                System.out.println("value of x in this method is "+x);
                System.out.println("value of y in this method "+y);
                System.out.println("value of x out of this method is "+this.x);
        }
}

class MainRunner2
{
        int y=20;
        public static void main(String[] args)
        {
                Test s1=new Test();
                s1.display(11);
        }
}

