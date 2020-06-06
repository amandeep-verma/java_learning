package mar31;

public class Main1 {
	public static void main(String[] args) {
		B1 b1=new B1(5);
		System.out.println(b1.y);
		//b1.y=12; //the final field cannot be assigned a new value as it is immutable
		b1=new B1(33);
		System.out.println(b1.y);
	}
}
