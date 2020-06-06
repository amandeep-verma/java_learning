package mar20;

public class Rectangle2  extends Shape2{
	double l;
	double b;
	Rectangle2(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	double getArea()
	{
		return (l*b);
	}
}
