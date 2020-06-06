package mar31;
//clone method
public class MainRunner3 {
	public static void main(String[] args) {
		Customer3 c1=new Customer3(123,"Mahesh");
		Customer3 c2=c1; // it is not duplicate
		System.out.println(c1);
		c2.cID=125;
		System.out.println(c1);
		
		// 1st way(not preferable)
		Customer3 c3=new Customer3(c1.cID,c1.cName); //duplicate
		c3.cName="ramesh";
		System.out.println(c1);
		System.out.println(c3);
		
		// 2nd way(preferred)
		Customer3 c4=(Customer3) c1.clone();
		c4.cName="raghu";
		System.out.println(c1);
		System.out.println(c4);
	}
}
