package mar21.abc;
// package abc imports xyz.Simple2. The default variables and method are not visible out of package.
// Where as protected members can be accessed via extends
import mar21.xyz.Simple2;
public class Test extends Simple2{
	void print()
	{
		// System.out.println(b);  //default not visible out of package
		// m2();                   //default not visible out of package
		System.out.println(c); // as extended
		m3(); // as extended
		System.out.println(d);
		m4();
	}
}
