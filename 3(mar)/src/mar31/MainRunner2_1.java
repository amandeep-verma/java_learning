package mar31;
/* when we create string without using new keyword(ie- String a = "hell"), it checks if the same string is present
in the constant string pool area. If it is present the new string points to the already present String, if not it
creates the new String in constant String pool area. 
But when we create a string with new keyword, everytime a new String is made in heap area.
 */

public class MainRunner2_1 {

	public static void main(String[] args) {
		String s1 = "JSP";
		String s2 = new String("JSP");
		String s3 = "QSP";
		String s4 = new String("JSP");
		String s5 = "JSP";

		System.out.println(s1.equals(s2)); // equals compare the content
		System.out.println(s1 == s2); // == compares the address
		System.out.println(s1.equals(s5));
		System.out.println(s1 == s5);
		System.out.println(s2 == s4); // in heap area as created by new keyword, so everytime a new string is made
		System.out.println(s2.equals(s4));

		String a1 = "ABCDEF";
		String a2 = "ABZ";
		System.out.println(a1.compareTo(a2)); // compares character by character
		// negative value indicates a2 is bigger

		String example = "abcdabcdeabcd";
		String s = example.substring(1, 4);
		String t = example.substring(5, 8);
		System.out.println(s == t);

		int occ = example.indexOf("bcd", 6);
		System.out.println(occ);

		double[] a = new double[5];
		System.out.println(a[3]);

	}

}
