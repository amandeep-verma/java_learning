package mar31;

// implements Cloneable
public class Customer3 implements Cloneable{
	int cID;
	String cName;
	public Customer3(int cID, String cName) {
		this.cID = cID;
		this.cName = cName;
	}
	public String toString()
	{
		return "Customer ["+cID+","+cName+"]";
	}	
	
	public Object clone(){
		return new Customer3(cID,cName);
	}
	
	// the method below can be used for cloning instead of using the above one
	
//	public Object clone() throws CloneNotSupportedException{
//		return super.clone();
//	}
}
