package mar20;
// When a superclass makes an object using reference from base class, when we try to call an overloaded
// method, it calls the overloaded method accessing the variables from child class. But when you try to 
// access the variable using object, you get parent class variables value.

public class Main0 {

	public static void main(String[] args) {
		A0 a=new B0(); // upcasting
		a.disp();
		System.out.println(a.name);
	}
}
