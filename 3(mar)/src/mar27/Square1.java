package mar27;

public class Square1 implements Shape1{
	double s;
	Square1(double s)
	{
		this.s=s;
	}
	public double getArea()
	{
		return s*s;
	}
}
