package mar20;

public class Circle2 extends Shape2{
	double rad;
	Circle2(double rad)
	{
		this.rad=rad;
	}
	double getArea()
	{
		return (pi*rad*rad);
	}
	

}
