package mar2;

class Student3
{ 
        public static void main(String[] args)
        {
                Stud S1; //S1 is Stud reference
                S1=new Stud();
                S1.id="123"; //null is replace by 123
                S1.per=73.56; //null is replace by &3.56
                S1.sname="Nandish"; //null is replace by Nandish
                S1.studying();
        }
}
class Stud
{
        //non-static member or instance members
        String id;
        double per;
        String sname;
        void studying()
        {
                System.out.println(id+" is id");
                System.out.println("percentage is "+per);
                System.out.println("Name is "+ sname);
        }
}
