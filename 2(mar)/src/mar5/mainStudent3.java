package mar5;
// defining a class student and made 3 object reference of the class, initialize them values and printing them.
class mainStudent3
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.name="ajit";
		s1.id=101;
		s1.per=71;
		s2.name="aman";
		s2.id=102;
		s2.per=79.2;
		s3.name="rijul";
		s3.id=103;
		s3.per=51.66;
		s1.info();
		System.out.println("-----------------");
		s2.info();
		System.out.println("-----------------");
		s3.info();
	}
}
class Student
{
	int id;
	String name;
	double per;
	void info()
	{
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("percentage is "+per);
	}
}

