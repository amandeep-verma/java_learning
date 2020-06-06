package mar30;

public class Student {
	int id;
	String name;
	double per;
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	public int hashCode() {
		return id;
	}

	
	public String toString() {
		String s="[";
		s=s+id+","+name+","+per+"]";
		return s;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student st=(Student)obj;
			return per==st.per;
		}
		return false;
	}
	
}
