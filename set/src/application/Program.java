package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		// compares references - add hash and equals in the product class and it now compares content
		
		System.out.println(set.contains(prod));
	}
}