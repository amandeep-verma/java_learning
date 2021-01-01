package feb28.hw;
//method overloading
class SpeedMethod4
{
	static void speed(int a)
	{
		System.out.println("vehicle is moving at speed of less than 10");
	}
	static void speed(int a,int b)
	{
		System.out.println("vehicle is moving at speed of 10-20");
	}
	static void speed(int a,int b,int c)
	{
		System.out.println("vehicle is moving at speed of 20-30 ");
	}
	static void speed(int a,int b,int c,int d)
	{
		System.out.println("vehicle is moving at speed of 30-40");
	}
	static void speed(int a,int b,int c,int d,int e)
	{
		System.out.println("vehicle is moving at speed of 50 or greater");
	}

	public static void main(String[] args)
	{
		System.out.println("do i play in ");
		speed(1);
		speed(1,2);
		speed(1,2,3);
		speed(1,2,3,4);
		speed(1,2,3,4,5);
	}
}
