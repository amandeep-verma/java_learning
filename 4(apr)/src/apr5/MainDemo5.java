package apr5;

import java.io.FileNotFoundException;

public class MainDemo5
{
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		String st="/Users/amandeepverma/Desktop/tolarn.txt";
		Simple5 s=new Simple5();
		try {
			s.open(st);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("Main Method end");
	}
}
