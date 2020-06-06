package mar20;

public class Square2  extends Shape2{
	double s;
	Square2(double s)
	{
		this.s=s;
	}
	double getArea()
	{
		return s*s;
	}
}
