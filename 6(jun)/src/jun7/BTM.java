package jun7;

public class BTM extends Branch{

	
	void payLoan() {
		System.out.println("insufficent balance , next month ll be paid");
		
	}

	void deposit(double amount) {
		balance=balance+amount;
		System.out.println("available balance="+balance);
	}
}
