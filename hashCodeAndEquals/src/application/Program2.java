package application;

import entities.Client;

public class Program2 {
	
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";

		// If s1 and s2 are new String, == does not work

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // compares references in memory heap
		System.out.println(s1 == s2); 
	}
}
