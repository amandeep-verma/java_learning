package mar12;

public class Sample2 extends Simple2{
	int x=60;
	void print()
	{
		int x=90;
		System.out.println("I am print method of Sample");
		display();
		System.out.println("x local value is : "+x);
		System.out.println("x current value is : "+this.x);
		System.out.println("x super class value is : "+super.x);
		System.out.println("y value is : "+y);
	}

}
