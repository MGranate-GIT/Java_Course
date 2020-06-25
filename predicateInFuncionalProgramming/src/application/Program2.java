/*
• Comparator object of separate class
• Comparator object of anonymous class 
• Comparator object of lambda expression within keys
• Comparator object of lambda expression without keys
• Comparator lambda expression "directly in the argument"
*/
package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program2 {
	
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
		}

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
	
		list.sort(Program2::compareProducts);
		
		list.forEach(System.out::println);
		}
	}

