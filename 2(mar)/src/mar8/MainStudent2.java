package mar8;
// each time object is created from the class, its constructor is called.
class Student
{
	int id;
	String name;
	double per;
	Student()
	{
		System.out.println("Student object constructor");
	}
	void display()
	{
		System.out.println("Name "+name);
		System.out.println("ID "+id);
		System.out.println("Per "+per);
	}
}
class MainStudent2
{
	public static void main(String[] args)
	{
		Student S1=new Student();
		Student S2=new Student();
		S1.display();
		S2.name="raghu";
		S2.per=76.66;
		S2.id=420;
		S2.display();
	}
}
