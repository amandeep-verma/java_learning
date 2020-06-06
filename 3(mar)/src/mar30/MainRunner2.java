package mar30;

public class MainRunner2 {
	public static void main(String[] args) {
		Test t=new Test();
		Simple s=new Simple();
		Pen p=new Pen("Green",23);
		Pen p2=new Pen("Yellow",23);
		Student st=new Student(12,"rajesh",78.3);
		Student st2=new Student(13,"rohan",84.2);
		Student st3=new Student(14,"mahesh",78.3);
		System.out.println(t.hashCode());
		System.out.println(s.hashCode()); //overrided to return 420
		System.out.println(p.hashCode()); //overrided to return price
		System.out.println(st.hashCode()); //overrided to return id
		System.out.println(st2.hashCode()); //overrided to return id
		System.out.println("<------------------------------>");
		//System.out.println(t.toString());
		System.out.println(t); 
		System.out.println(s);//overrided to return String "Sample"
		System.out.println(p);   //overrided to return properties
		System.out.println(st); //overrided to return properties
		System.out.println("<------------------------------>");
		System.out.println(t.equals(t));
		System.out.println(s.equals(null));
		System.out.println(s.equals(s));
		System.out.println(p.equals(p2)); 
		System.out.println(p2.equals(p));
		System.out.println(p.equals(st));
		System.out.println(st.equals(st2));
		System.out.println(st2.equals(st));
		System.out.println(st.equals(st3));
		
		
	}
}
