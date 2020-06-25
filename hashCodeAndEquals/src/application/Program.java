package application;

public class Program {
	
	public static void main(String[] args) {
	
	// equals is 100% accurate
	
	String a = "Maria";
	String b = "Alex";
	System.out.println(a.equals(b));
	
	System.out.println();
	
	// hashCode may lead to collision
	
	String c = "Maria";
	String d = "Alex";
	System.out.println(c.hashCode());
	System.out.println(d.hashCode());
	}
}
