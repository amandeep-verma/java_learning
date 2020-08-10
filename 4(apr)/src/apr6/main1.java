package apr6;

import java.io.IOException;
import java.sql.SQLException;

public class main1 {

	static void check(int a) throws IOException, SQLException
	{
		if(a%2==0)
			throw new NullPointerException("divisble by 2");
		if(a%5==0)
			throw new SQLException("divisible by 5");
		if(a%3==0)
			throw new IOException("divisble by 3");
	}
	
	public static void main(String[] args) throws Exception {
		try {
			check(21);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		check(25); // here 21 is also checked exception but we are throwing it to JVM
	}

}
