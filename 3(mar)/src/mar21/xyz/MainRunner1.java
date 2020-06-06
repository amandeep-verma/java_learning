package mar21.xyz;

public class MainRunner1 {

	public static void main(String[] args) {
		Test1 t1=new Test3();
		System.out.println("i am t1.x "+t1.x); // value of x from test1 is printed
		t1.print(); // since method calls for x, the value of from test3 is printed
		Test2 t2=new Test3();
		t2.print();
		t2.print("raghu");
		System.out.println("-----------");
		Test2 t3=new Test2();
		t3.print(); // since method print with no variable is inherited from test1 , value of x from test1 is picked
		t3.print("ragg");
	}

}
