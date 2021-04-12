package StringManipulations;

public class ToStringMethod {
	int id;
	String name;
	public ToStringMethod(int a, String s)
	{
		this.id= a;
		this.name = s;
	}
	
	public String toString()
	{
		return new String("ID: "+ id + " Name: "+ name);
	}
		
	public static void main(String[] args) {
		ToStringMethod tsm = new ToStringMethod(23, "Java");
		
		System.out.println("id: "+ tsm.id);
		
		System.out.println("To print the objects need to override toString() method ");
		System.out.println("value of object: "+ tsm);
	}

}
