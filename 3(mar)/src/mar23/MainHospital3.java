package mar23;

public class MainHospital3 {

	public static void main(String[] args) {
		Person3 p=new Doctor3("raveesh",28,123,5000,"surgeon");
		System.out.println(p.getAge());
		System.out.println(p.getName());
		
		Employee3 e=(Employee3)p;  //down casting
		System.out.println(e.getsal());
		System.out.println(e.geteid());
		
		Doctor3 d=(Doctor3)e;
		System.out.println(d.getDsg());
		System.out.println("\n-------------------------\n");
		
		Person3 p1=new Ptype3("abhishek",22,101,2500,"admitted");
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		Patient3 pat1=(Patient3)p1;
		System.out.println(pat1.getbill());
		System.out.println(pat1.getpid());
		
		Ptype3 pt1=(Ptype3)pat1;
		System.out.println(pt1.gettype()); 
	}
}
