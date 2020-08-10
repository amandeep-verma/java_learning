package apr6;

public class Tester3 {

	public static void main(String[] args)  {
		Train3 t=new Train3();
		try {
			t.travel(205);
		}
		catch(VeryFastException e)
		{
			System.out.println("exception occured ...");
		}

	}

}
