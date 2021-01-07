package apr6;
// custom exception inheriting the exception class
public class InvalidAgeException extends Exception {
	InvalidAgeException(String st)
	{
		System.out.println(st);
	}
}

