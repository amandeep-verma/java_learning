package mar13;

public class MainRunner3 {
	public static void main(String[] args) {
		Student3 s1=new Student3("Rajesh",26,123,54.6);
		s1.stdInfo();
		System.out.println("-----------");
		s1.PersonInfo();
		
		Person3 p= new Student3("sahil",22,123,55);
		Student3 a=(Student3) p;
		System.out.println(a.Sper);
		
				
	}
}
