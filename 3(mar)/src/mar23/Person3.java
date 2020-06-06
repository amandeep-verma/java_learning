package mar23;

public abstract class Person3 {
	String name;
	int age;
	public Person3(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	abstract String getName();
	abstract int getAge();
	
}
