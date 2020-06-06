package mar23;

public abstract class Employee3 extends Person3{
	int eid;
	double sal;
	public Employee3(String name,int age,int eid,double sal) 
	{
		super(name, age);
		this.eid=eid;
		this.sal=sal;
	}
	abstract int geteid();
	abstract double getsal();
}
