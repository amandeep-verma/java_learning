package mar5;
// creating two objects of the class, initializing one with values and second with no values. Later making p2 = p1,
// which makes both of them referring to null values(default values).

import java.util.Scanner;

class mainPen6
{
	public static void main(String[] args)
	{
		Pen pn1=new Pen();
		pn1.color="red";
		pn1.writing();
		Pen pn2=new Pen();
		pn1=pn2;
		pn1.writing();
		pn2.writing();
	}
}
