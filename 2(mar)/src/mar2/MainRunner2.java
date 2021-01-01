package mar2;
//printing the class variables after initializing them
class MainRunner2
{ 
        public static void main(String[] args)
        {
                Pen rey; //rey is pen reference
		rey=new Pen();
		rey.color="blue"; //null is replace by blue
                rey.price=99.99; //null is replace by 99.99
                rey.cname="Reynolds"; //null is replace by Reynlods
                rey.writing();
		System.out.println("Price is "+ rey.price);
        }
}
//class Pen
//{
//	//non-static member or instance members
//        String color;
//        double price;
//        String cname;
//        void writing()
//        {
//                System.out.println(color+" color pen is writing");
//                System.out.println("company name is "+cname);
//                System.out.println("Price is "+ price);
//        }
//}
