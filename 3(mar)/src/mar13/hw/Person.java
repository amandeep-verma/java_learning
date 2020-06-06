package mar13.hw;

public class Person {

	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void PersonInfo()
	{
		System.out.println("name "+name);
		System.out.println("age "+age);
	}
}
