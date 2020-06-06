package mar22;

public class Sample2 {
	
	final int a=10;
	final int b;
	final int c;
	
	Sample2()
	{
//		a=90; // error as a is final , once declared can't be declared again
		b=20;
	}
	
	void disp()
	{
//		c=11; // c cant be assinged in a method as it is final (even if method is static)
	}
	
	{ // non static block
		
		c=11; // can be given a value as it is in a non static block
	}
	
	
	
}
