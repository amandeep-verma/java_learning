package mar8;
// creating constructor of class with a print method which while printing shows constructor is called first when we
// make the object.
// STATIC MEMBERS ARE CREATED WHEN CLASS IS LOADED IN CLASS AREA AT THE TIME OF EXECUTION . SO STATIC MEMBERS OR METHODS 
// ARE THE FIRST THING CALLED.
class Sample
{
	Sample()
	{
		System.out.println("I am constructor of Sample");
	}
	void sample()
	{
		System.out.println("I am a Sample method");
	}
	void m1()
	{
		System.out.println("I am M1 method");
	}
	
}
class MainRunner1
{
	public static void main(String[] args)
	{
		Sample sa=new Sample();
		sa.m1();
		sa.sample();
	}
}
