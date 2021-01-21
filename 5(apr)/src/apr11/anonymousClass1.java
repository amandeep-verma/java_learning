package apr11;

// anonymous class is used when we have to create a child class for only over-riding a method 
// for a very limited number of time.
// Instead of writing the child we can just write a anonymous class in main.
public class anonymousClass1 {

	public static void main(String[] args) {
		print1 P = new print1();
		P.Printing();

		// Here we are creating the object of the anonymous class, Its scope is only for this object.
		print1 PW = new print1() 
		{
			void Printing() 
			{
				System.out.println("welcome to j spider");
			}
		};
		
		PW.Printing();
	}

}
