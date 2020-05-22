package mar9;

class Student
{
	String name;
	int id;
	double per;


	Student()
	{}
	//PASSING VALUE TO CONSTRUCTOR
	Student(String name, int id, double per)
	{
		this.name=name;
		this.id=id;
		this.per=per;
	}
	void stdInfo()
	{
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("per: "+per);
	}	

	//PASSING VALUE TO METHOD 
	void stdInfo(String name, int id, double per)
	{
		this.name=name;
		this.id=id;
		this.per=per;
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("per: "+per);
	}

}
class Main3
{
	public static void main(String[] args)
	{
		Student s1=new Student("rajesh",123,75.66);
		s1.stdInfo();
		Student s2=new Student("rakesh",125,60.55);
		s2.stdInfo();

		Student s3=new Student();
		s3.stdInfo("amnesh",123,56.22);
		Student s4=new Student();
		s4.stdInfo("werty",120,99.11);
	}
}
