package apr11;

interface abc{
	void check();
}

public class AnonymousInterface2 {

	public static void main(String[] args) {

		abc a = new abc()
		{
			public void check()
			{
				System.out.println("hello from the anonymous class with Interface");
			}
			
		};
		
		a.check();
	}
}
