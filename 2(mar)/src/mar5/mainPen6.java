package mar5;
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
