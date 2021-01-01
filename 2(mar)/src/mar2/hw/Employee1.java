package mar2.hw;
//same to mar2
class Employee1
{
	public static void main(String[] args)
	{
		Worker w1= new Worker();
		w1.name="amit";
		w1.id="b542";
		w1.salary=32000;
		w1.working();
		System.out.println("salary of "+w1.name+" is "+w1.salary);
	}		
}
class Worker
{
	String id;
	String name;
	double salary;
	void working()
	{
		System.out.println(name+" bearing id no. "+id+" gets salary of  "+salary);
	}
}
