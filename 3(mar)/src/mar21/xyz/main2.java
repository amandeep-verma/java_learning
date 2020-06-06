package mar21.xyz;

public class main2 {

	public static void main(String[] args) {
		Simple2 si=new Simple2();
		// System.out.println(si.a);  //private
		// s1.m1();                   //private
 		System.out.println(si.b);
		si.m2();
		System.out.println(si.c);
		si.m3();
		si.m4();
		System.out.println("-------");
		Simple2 s2= new Sample2();
		// s2.disp(); // as disp is not in simple
		// s2.m1() ; // as m1 in simple is private, so m1 in sample is not overriden. Its like the disp method above 
	}

}
