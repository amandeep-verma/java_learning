package mar23;

public class MainHotel2 {

	public static void main(String[] args) {
		// Dosa2 d=new Dosa2();   (error- since dosa is a abstract class)
		Dosa2 d=new MasalaDosa2();
		System.out.println(d.getDosa());
		 d=new SetDosa2();
		System.out.println(d.getDosa());
		 d=new Plain2();
		System.out.println(d.getDosa());
	}

}
