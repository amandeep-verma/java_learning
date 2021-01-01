package mar9.hw;
// constructor chaining using this keyword. 
class Student
{
	int id;
	String name;
	double per;
	Student()
	{
		System.out.println("Student object created");
	}
	Student(int id)
	{
		this();
		this.id=id;
	}
	Student(int id,String name)
	{
		this(id);
		this.name=name;
	}
	Student(int id,String name,double per)
	{
		this(id,name);
		this.per=per;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("id: "+id );
		System.out.println("per: "+per);
	}
}
class ass1
{
	public static void main(String[] args)
	{
		Student s1=new Student(123);
		Student s2=new Student(124,"rat");
		Student s3=new Student(125,"qwerty",56.99);
		s1.display();
		s2.display();
		s3.display();
	}
}
