package mar8;
class Customer
{ 
        String name;
        int id;
        long mob;
        Customer(String n,int i, long m)
        {
                System.out.println("Customer is created");
                name=n;
                id=i;
                mob=m;
        }
        void details()
        {
                 System.out.println("name is "+name);
                 System.out.println("Id is "+id);
                 System.out.println("mobile number is "+mob);
        }
}
class mainC4
{
        public static void main(String[] args)
        {
                Customer C1=new Customer("rajesh",123,9876543210l); // long have to be ended with l 
                Customer C2=new Customer("ramu",124,9876543226l);
                Customer C3=new Customer("suresh",125,9876543217l);
                C1.details();
                C2.details();
                C3.details();
        }
}
 
