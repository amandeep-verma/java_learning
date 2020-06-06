package mar30;

public class Pen {
	String color;
	int price;
	public Pen(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
	
	public int hashCode() {
		
		return price;
	}
	public String toString() {
		String s="[";
		s=s+color+","+price+"]";
		return s;
	}

	
	public boolean equals(Object obj) {
		if (obj instanceof Pen)
		{
			Pen p=(Pen)obj;
			return price==p.price;
		}
		return false;
	}
	
}

