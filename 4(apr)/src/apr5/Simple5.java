package apr5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Simple5 {

	void open(String st) throws FileNotFoundException {
		System.out.println("welcome to open method");
		FileInputStream fi = new FileInputStream(st);
		System.out.println("it is open");
		System.out.println("open method end");
	}
}
