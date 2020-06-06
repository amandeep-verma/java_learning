package mar27;

public class MainRunner0 {

	public static void main(String[] args) {
		System.out.println(Simple0.x);
		Simple0 s1=new Sample0(); //up cast
		s1.m1();
		System.out.println(Sample0.x);
		Sample0 s=(Sample0)s1; //down cast
		
		s.m2();
		s.m1();
	}
}
