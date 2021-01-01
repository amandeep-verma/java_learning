package mar5;
// creating object p3 referring to p1 and and initializing the variable linked to object p3 which reflects
// changes to p1 as well.
import java.util.Scanner;

class mainPen5
{
	public static void main(String[] args)
	{
		Pen p1=new Pen();
		Pen p2=new Pen();
		Pen p3=p1;
		p2.color="red";
		p2.writing();
		p3.color="black";
		p1.writing();
		p3.writing();
	}
}
