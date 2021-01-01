package mar6;
/* creating a object of class and trying to change its value using different methods. 
	1. referring the object
	2. referring the variable
	3. referring the object and initializing it to new object. 
*/
class Simple
{
	int x;
	void display()
	{
		System.out.println("x vaue is "+x);
	}
}
class MainSample1
{
	static void update(Simple s) // referring the object
	{
		s.x=500;
	}
	static void change(int a) // referring the variable
	{
		a=200;
	}
	static void referred(Simple Si) //referring the object and initializing it to new object. 
	{
		Si=new Simple();
		Si.x=1200;
	}
	public static void main(String[] args)
	{
		Simple S1=new Simple();
		S1.x=25;
		update(S1); // changes
		System.out.println("S1.x is   "+S1.x);
		change(S1.x); // no changes
		System.out.println("S1.x is   "+S1.x);
		referred(S1); // no changes
		System.out.println("S1.x is   "+S1.x);
	}

}

