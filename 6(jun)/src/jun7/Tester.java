package jun7;

public class Tester {

	public static void main(String[] args) {
		Bank b=new BTM();
		b.deposit(1000);
		Branch br=(Branch)b;
		br.payLoan();

	}

}
