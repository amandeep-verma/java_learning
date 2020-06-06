package mar23;

public abstract class Patient3 extends Person3{
	int pid;
	double bill;
	public Patient3(String name, int age, int pid, double bill) {
		super(name, age);
		this.pid = pid;
		this.bill = bill;
	}
	abstract int getpid();
	abstract double getbill();
}
