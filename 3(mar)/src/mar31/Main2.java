package mar31;

public class Main2 {
	public static void main(String[] args) {
		String st1=new String();
		String st2=null;
		String st3=new String("JSpider");
		String st4=new String("QSpider");
		char ch[]= {'r','a','g','h','u'};
		String st5=new String(ch);
		String st6=new String("JSpider");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(st5);
		System.out.println(st6);
		System.out.println("<------------------------->");
		
		System.out.println(st1.hashCode());
		//System.out.println(st2.hashCode()); //null pointer exception
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		System.out.println(st5.hashCode());
		System.out.println(st6.hashCode());
		System.out.println("<------------------------->");
		
		System.out.println(st1.equals(st3));
		System.out.println(st3.equals(st4));
		System.out.println(st3.equals(st5));
		System.out.println(st3.equals(st6));
		System.out.println("<------------------------->");
		
		System.out.println(st3.equals(st6)); //compares content
		System.out.println(st3==st6); //compares address
		System.out.println(st3.compareTo(st6));
	}
}
