package apr3.handling;

public class Example3 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		String st = null;
		try {
			System.out.println("Number of character:" + st.length());
			// if string is null, it throws NullpointException
		}
		catch(NullPointerException ne )
		{
			System.out.println("caught");
		}
		finally {
			System.out.println("i am fully block");
		}

		System.out.println("thank you");
		System.out.println("main method end");

	}
}
