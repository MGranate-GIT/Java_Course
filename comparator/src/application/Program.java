/*
(1) Comparator object of separate class
(2) Comparator object of anonymous class 
(3) Comparator object of lambda expression within keys
(4) Comparator object of lambda expression without keys
(5) Comparator lambda expression "directly in the argument"
*/
package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/*	(2)	
			Comparator<Product> comp =new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		*/
		
		/* (3) Comparator<Product> comp = (p1, p2) -> */  /* (4) {*/
			/*return*/ /*p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());*/
		/*};*/
				
		
		list.sort(
				/* (1) new MyComparator()*/
				/* (2, 3,4) comp*/
				/* (5)*/(p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}
