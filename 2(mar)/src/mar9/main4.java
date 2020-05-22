package mar9;
class Employee
{
	String name;
	int id;
	double sal;
	Employee(String name, int id, double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	Employee(int id,String name,  double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	Employee( double sal, int id,String name)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	void empInfo()
	{
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		System.out.println("sal: "+sal);
	}
}
class main4 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("akash",123,45000);
		Employee e2=new Employee("rohan",124,50000);
		Employee e3=new Employee("sohan",125,70999);
		e1.empInfo();
		e2.empInfo();
		e3.empInfo();
	}
}
