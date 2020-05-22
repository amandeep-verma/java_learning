package mar8;
class Rectangle
{ 
        double l,b;
        Rectangle(double l1,double b1)
        {
                 System.out.println("rect is created");
                 l=l1;
                 b=b1;
        }
        double Area()
        {
                return l*b;
        }
}
class MainRect5
{
        public static void main(String[] args)
        {
                Rectangle r1=new Rectangle(5,6);
                Rectangle r2=new Rectangle(2.3,5.6);
                System.out.println(r1.Area());
                System.out.println(r2.Area());
        }
}
   
