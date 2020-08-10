package apr6;

public class Train3 {
	
	void travel(double speed) throws VeryFastException 
	{
		if(speed>100)
			throw new VeryFastException("please go slow");
		else
			System.out.println("you are safe");
	}
}
