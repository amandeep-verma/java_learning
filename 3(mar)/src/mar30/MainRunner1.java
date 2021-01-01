package mar30;
// Object class is the supermost class in java
// Program shows use of hashCode, toString, equals method.
public class MainRunner1 {

	public static void main(String[] args) {
		Object obj=new Object();
		System.out.println(obj.hashCode()); //returns address of object in decimal
		System.out.println(obj.toString()); // returns fully qualified name @ address of object in hexadecimal
		System.out.println(obj); // it prints toString method to return value
		System.out.println(obj.equals(obj)); // it compares address (true/false)
		System.out.println("<------------------------->");
		Object ob1=new Object();
		System.out.println(ob1.hashCode());
		Object ob2=ob1;
		System.out.println(ob2.hashCode());
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(obj));
		System.out.println(obj.equals(ob2));
		
		System.out.println("<------------------------->");
		System.out.printf("%d,%x",2018699554,2018699554);
	}
}
